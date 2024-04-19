package com.co.tascon.usuarios.MicroservicioUsuarios.repository;

import com.co.tascon.usuarios.MicroservicioUsuarios.entity.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{
}
