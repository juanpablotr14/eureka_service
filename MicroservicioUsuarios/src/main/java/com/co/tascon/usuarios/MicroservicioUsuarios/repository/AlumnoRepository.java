package com.co.tascon.usuarios.MicroservicioUsuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.tascon.common.usuario.models.entity.Alumno;


@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{
}