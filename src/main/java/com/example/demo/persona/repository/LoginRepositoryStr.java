package com.example.demo.persona.repository;

import com.example.demo.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepositoryStr extends JpaRepository<Login, String> {
}
