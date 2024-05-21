package co.com.tascon.examenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.tascon.common.usuario.models.entity.Pregunta;


@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta, Long> {
}