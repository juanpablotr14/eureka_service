package co.com.tascon.examenes.service.implementation;

import org.springframework.stereotype.Service;

import co.com.tascon.common.usuario.models.entity.Examen;
import co.com.tascon.examenes.repository.ExamenRepository;
import co.com.tascon.microservicecommuns.service.CommonService;
import co.com.tascon.microservicecommuns.service.implementation.CommonServiceImpl;


@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen> {
}