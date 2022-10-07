package com.example.demo.persona.rest;

import com.example.demo.model.Login;
import com.example.demo.persona.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/log/")
<<<<<<< HEAD
=======
//login
>>>>>>> 269816d8ee6738c1cbd9eba997c8d1149c1c3caa
public class LoginREST {
    @Autowired
    private LoginService loginService;

    @GetMapping()
    private ResponseEntity<List<Login>> getAllLogin(){
        return ResponseEntity.ok(loginService.findAll());
    }

    @GetMapping ("{id}")
    private ResponseEntity<List<Login>> getUserById(@PathVariable("id") int idUser){
        return ResponseEntity.ok(loginService.findAllByNewId(idUser));
    }


    @PostMapping
    private ResponseEntity<Login> saveLogin(@RequestBody Login login){
        try {
            Login personaGuardada = loginService.save(login);
            return ResponseEntity.created(new URI("/usuarios/"+personaGuardada.getId())).body(personaGuardada);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping ("{id}")
        private ResponseEntity<Boolean> deleteLogin(@PathVariable("id") int idUser){
            loginService.deleteById(idUser);
            return ResponseEntity.ok(!(loginService.findAllByNewId(idUser)!=null));
    }

}
