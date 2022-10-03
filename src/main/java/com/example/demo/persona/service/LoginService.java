package com.example.demo.persona.service;

import com.example.demo.model.Estado;
import com.example.demo.model.Login;
import com.example.demo.persona.repository.LoginRepository;
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
public class LoginService implements LoginRepository {

    @Autowired
    LoginRepository loginRepository;


    @Override
    public List<Login> findAll() {
        return loginRepository.findAll();
    }

    public List<Login> findAllByNewId(int id){
        List<Login> loginRespuesta=new ArrayList<>();
        List<Login> login = loginRepository.findAll();
        for(int i=0; i<login.size();i++){
            if(login.get(i).getId()==id){
                loginRespuesta.add(login.get(i));
            }
        }
        return loginRespuesta;
    }



    @Override
    public List<Login> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Login> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Login> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {
        loginRepository.deleteById(integer);
    }

    @Override
    public void delete(Login entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Login> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Login> S save(S entity) {
        return loginRepository.save(entity);
    }

    @Override
    public <S extends Login> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Login> findById(Integer integer) {
        return loginRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Login> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Login> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Login> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Login getOne(Integer integer) {
        return null;
    }

    @Override
    public Login getById(Integer integer) {
        return null;
    }

    @Override
    public Login getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Login> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Login> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Login> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Login> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Login> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Login> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Login, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
