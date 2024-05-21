package co.com.tascon.common.usuario.models.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "examen")
public class Examen {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	@Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@PrePersist
    public void prePersist() {
        this.createAt = new Date();
    }
	
	@JsonIgnoreProperties(value = { "examen" }, allowSetters = true)
	@OneToMany(mappedBy = "examen", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pregunta> listaPregunta;
    
    public void setPreguntas(List<Pregunta> preguntas) {
		this.listaPregunta.clear();
		preguntas.forEach(this::addPregunta);
		
	}
    
    public void addPregunta(Pregunta pregunta) {
    	this.listaPregunta.add(pregunta);
    	pregunta.setExamen(this);
    }
    
    public void removePregunta(Pregunta pregunta) {
    	this.listaPregunta.remove(pregunta);
    	pregunta.setExamen(null);
    }
}
