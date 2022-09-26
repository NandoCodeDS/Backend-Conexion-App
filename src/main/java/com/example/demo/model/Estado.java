package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;
    private String nombre;

    //Constructor
    public Estado() {
    }

    public Estado(Pais pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }

    //Getters - Setters
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
