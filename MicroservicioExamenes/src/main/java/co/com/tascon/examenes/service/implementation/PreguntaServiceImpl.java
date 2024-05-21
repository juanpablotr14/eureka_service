package co.com.tascon.examenes.service.implementation;

import org.springframework.stereotype.Service;

import co.com.tascon.common.usuario.models.entity.Pregunta;
import co.com.tascon.examenes.repository.PreguntaRepository;
import co.com.tascon.microservicecommuns.service.CommonService;
import co.com.tascon.microservicecommuns.service.implementation.CommonServiceImpl;


@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta> {
}