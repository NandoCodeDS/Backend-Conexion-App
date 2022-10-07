package com.example.demo.persona.rest;

import com.example.demo.model.Login;
import com.example.demo.persona.service.LoginServiceStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/login/")
public class LoginStrREST {

    @Autowired
    private LoginServiceStr loginServiceStr;

    @GetMapping("{email}")
    private ResponseEntity<List<Login>> getUserByMail(@PathVariable("email") String id_mail){
        return ResponseEntity.ok(loginServiceStr.findByEmail(id_mail));
    }

    @PostMapping
    private ResponseEntity<Login> saveLogin(@RequestBody Login login){
        try {
            Login personaGuardada = loginServiceStr.save(login);
            return ResponseEntity.created(new URI("/login/"+personaGuardada.getId())).body(personaGuardada);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping (value = "delete/{email}")
    private ResponseEntity<Boolean> deleteLogin(@PathVariable("email") String id_mail) {
        loginServiceStr.deleteById(id_mail);
        return ResponseEntity.ok(!(loginServiceStr.findByEmail(id_mail) != null));
    }

}
