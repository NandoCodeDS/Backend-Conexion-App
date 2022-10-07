package com.example.demo.persona.rest;

import com.example.demo.model.Estado;
import com.example.demo.model.Pais;
import com.example.demo.persona.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/pais/")
public class PaisREST {
    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises(){
        return ResponseEntity.ok(paisService.findAll());
    }

    @GetMapping ("{id}")
    private ResponseEntity<List<Pais>> getbyPais(@PathVariable("id") int idPais){
        return ResponseEntity.ok(paisService.findByPais(idPais));
    }
}
