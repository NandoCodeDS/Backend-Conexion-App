package com.example.demo.persona.service;

import com.example.demo.model.Login;
import com.example.demo.persona.repository.LoginRepositoryStr;
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
public class LoginServiceStr implements LoginRepositoryStr {

    @Autowired
    LoginRepositoryStr loginRepositoryStr;

    @Override
    public List<Login> findAll() {
        return loginRepositoryStr.findAll();
    }

    public List<Login> findByEmail(String id_mail){
        List<Login> loginStrRespuesta=new ArrayList<>();
        List<Login> login = loginRepositoryStr.findAll();
        for(int i=0; i<login.size();i++){
            if((login.get(i).getEmail()).equals(id_mail)){
                loginStrRespuesta.add(login.get(i));
            }
        }
        return loginStrRespuesta;
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
    public List<Login> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {
        loginRepositoryStr.deleteById(s);
    }

    @Override
    public void delete(Login entity) {
        loginRepositoryStr.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Login> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Login> S save(S entity) {
        return loginRepositoryStr.save(entity);
    }

    @Override
    public <S extends Login> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Login> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
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
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Login getOne(String s) {
        return null;
    }

    @Override
    public Login getById(String s) {
        return null;
    }

    @Override
    public Login getReferenceById(String s) {
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
