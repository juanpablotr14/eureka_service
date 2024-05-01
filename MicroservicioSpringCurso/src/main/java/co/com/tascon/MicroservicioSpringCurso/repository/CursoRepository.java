package co.com.tascon.MicroservicioSpringCurso.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.tascon.common.usuario.models.entity.Curso;


public interface CursoRepository extends CrudRepository<Curso, Long> {
	
	

}
