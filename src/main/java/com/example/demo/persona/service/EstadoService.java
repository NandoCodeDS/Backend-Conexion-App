package com.example.demo.persona.service;

import com.example.demo.model.Estado;
import com.example.demo.persona.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EstadoService implements EstadoRepository{
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    @Override
    public List<Estado> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }

    public List<Estado> findAllByCountry(int id){
        List<Estado> estadoRespuesta=new ArrayList<>();
        List<Estado> estados = estadoRepository.findAll();
        for(int i=0; i<estados.size();i++){
            if(estados.get(i).getPais().getId()==id){
                estadoRespuesta.add(estados.get(i));
            }
        }
        return estadoRespuesta;
    }

    @Override
    public Page<Estado> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Estado> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Estado entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Estado> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Estado> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Estado> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Estado> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Estado> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Estado getOne(Integer integer) {
        return null;
    }

    @Override
    public Estado getById(Integer integer) {
        return null;
    }

    @Override
    public Estado getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Estado> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Estado, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
