package com.co.tascon.usuarios.MicroservicioUsuarios.service;

import com.co.tascon.usuarios.MicroservicioUsuarios.entity.Alumno;
import com.co.tascon.usuarios.MicroservicioUsuarios.repository.AlumnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AlumnoServiceImpl implements AlumnoService{

    private AlumnoRepository dao;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Alumno> findAll() {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Alumno> findById(Long id) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public Alumno save(Alumno alumno) {
        return null;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
