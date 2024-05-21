package co.com.tascon.curso.MicroservicioSpringCurso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.com.tascon.common.usuario.models.entity.Alumno;
import co.com.tascon.common.usuario.models.entity.Curso;
import co.com.tascon.curso.MicroservicioSpringCurso.services.CursoService;
import co.com.tascon.microservicecommuns.controller.CommonController;


public class CursoController extends CommonController<Curso, CursoService>{

	@PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id){
        Optional<Curso> ob = service.findById(id);

        if(ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        Curso cursoDB = ob.get();
        cursoDB.setNombre(curso.getNombre());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoDB));
    }
	
	@PutMapping("/{id}/asignar-alumno")
	public ResponseEntity<?> asignarAlumno(@RequestBody List<Alumno> alumno, @PathVariable Long id){
		
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoDb = ob.get();
		
		alumno.forEach( a -> {
			cursoDb.addAlumnos(a);
		});
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoDb));
		
	}
	
	@PutMapping("/{id}/eliminar-alumno")
	public ResponseEntity<?> eliminarAlumno(@RequestBody Alumno alumno, @PathVariable Long id){
		
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoDb = ob.get();
		cursoDb.removeAlumnos(alumno);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		
	}
	
}
