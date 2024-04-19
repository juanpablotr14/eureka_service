package com.co.tascon.usuarios.MicroservicioUsuarios.service;

import com.co.tascon.usuarios.MicroservicioUsuarios.entity.Alumno;

import java.util.Optional;

public interface AlumnoService {
    public Iterable<Alumno> findAll();
    public Optional<Alumno> findById(Long id);
    public Alumno save(Alumno alumno);
    public void deleteById(Long id);
}