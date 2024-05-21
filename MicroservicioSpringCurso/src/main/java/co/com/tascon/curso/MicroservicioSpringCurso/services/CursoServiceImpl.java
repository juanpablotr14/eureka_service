package co.com.tascon.curso.MicroservicioSpringCurso.services;

import co.com.tascon.common.usuario.models.entity.Curso;
import co.com.tascon.curso.MicroservicioSpringCurso.repository.CursoRepository;
import co.com.tascon.microservicecommuns.service.CommonService;
import co.com.tascon.microservicecommuns.service.implementation.CommonServiceImpl;

public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso>{
}