package co.com.tascon.microservicecommuns.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import co.com.tascon.microservicecommuns.service.CommonService;

import java.util.Optional;


public class CommonServiceImpl<E, R extends CrudRepository<E, Long>> implements CommonService<E> {

    @Autowired
    private R dao;

    @Override
    @Transactional(readOnly = true)
    public Iterable<E> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<E> findById(Long id) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public E save(E entity) {
        return dao.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
