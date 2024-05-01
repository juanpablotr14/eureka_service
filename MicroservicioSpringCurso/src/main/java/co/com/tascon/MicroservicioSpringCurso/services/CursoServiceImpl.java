package co.com.tascon.MicroservicioSpringCurso.services;


import co.com.tascon.MicroservicioSpringCurso.repository.CursoRepository;
import co.com.tascon.common.usuario.models.entity.Curso;
import co.com.tascon.microservicecommuns.MicroservicioCommuns.service.CommonService;
import co.com.tascon.microservicecommuns.MicroservicioCommuns.service.CommonServiceImpl;

public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso>{

}
