package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class User_Login {


    @GeneratedValue (strategy = GenerationType.AUTO)
    private BigInteger id;

    @Id
    private String correo;

    private String contra;

    private String token;

    public User_Login() {
    }

    public User_Login(BigInteger id, String correo, String contra, String token) {
        this.id = id;
        this.correo = correo;
        this.contra = contra;
        this.token = token;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
