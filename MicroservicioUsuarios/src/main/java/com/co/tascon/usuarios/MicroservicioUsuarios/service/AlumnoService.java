package com.co.tascon.usuarios.MicroservicioUsuarios.service;


import co.com.tascon.common.usuario.models.entity.Alumno;
import co.com.tascon.microservicecommuns.MicroservicioCommuns.service.CommonService;


public interface AlumnoService extends CommonService<Alumno>{
    public Alumno save(Alumno alumno);
    public void deleteById(Long id);
}