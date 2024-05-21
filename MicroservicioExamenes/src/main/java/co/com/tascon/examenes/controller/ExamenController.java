package co.com.tascon.examenes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.tascon.common.usuario.models.entity.Examen;
import co.com.tascon.common.usuario.models.entity.Pregunta;
import co.com.tascon.examenes.service.ExamenService;
import co.com.tascon.microservicecommuns.controller.CommonController;


@RestController
public class ExamenController extends CommonController<Examen, ExamenService> {
	@PutMapping("/asignarPregunta/{id}")
    public ResponseEntity<?> asignarPregunta(@PathVariable Long id, @RequestBody List<Pregunta> preguntas) {
        Optional<Examen> examenGuardado = service.findById(id);

        if (examenGuardado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Examen examenActualizado = examenGuardado.get();
        preguntas.forEach(pregunta -> {
        	examenActualizado.addPregunta(pregunta);
        });

        return ResponseEntity.status(HttpStatus.OK).body(service.save(examenActualizado));
    }
	
	@PutMapping("/eliminarPregunta/{id}")
    public ResponseEntity<?> eliminarPregunta(@PathVariable Long id, @RequestBody Pregunta pregunta) {
        Optional<Examen> examenGuardado = service.findById(id);

        if (examenGuardado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Examen examenActualizado = examenGuardado.get();
        examenActualizado.removePregunta(pregunta);

        return ResponseEntity.status(HttpStatus.OK).body(service.save(examenActualizado));
    }
}