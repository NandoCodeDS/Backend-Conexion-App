package com.example.demo.persona.service;

import com.example.demo.model.User_Login;
import com.example.demo.persona.repository.User_LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class User_LoginService implements User_LoginRepository {

    @Autowired
    User_LoginRepository loginRepository;
    @Override
        public List<User_Login> findAll() {
            return loginRepository.findAll();
    }

    @Override
    public List<User_Login> findAllById(Iterable<String> correo) {
        return loginRepository.findAllById(correo);
    }

    @Override
    public void deleteById(String correo) {
        loginRepository.deleteById(correo);
    }

    @Override
    public <S extends User_Login> S save(S entity) {
        return loginRepository.save(entity);
    }

    @Override
    public List<User_Login> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User_Login> findAll(Pageable pageable) {
        return null;
    }

       @Override
    public long count() {
        return 0;
    }


    @Override
    public void delete(User_Login entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends User_Login> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends User_Login> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User_Login> findById(String s) {
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
    public <S extends User_Login> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends User_Login> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<User_Login> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public User_Login getOne(String s) {
        return null;
    }

    @Override
    public User_Login getById(String s) {
        return null;
    }

    @Override
    public User_Login getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends User_Login> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends User_Login> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User_Login> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends User_Login> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends User_Login> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends User_Login> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends User_Login, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
