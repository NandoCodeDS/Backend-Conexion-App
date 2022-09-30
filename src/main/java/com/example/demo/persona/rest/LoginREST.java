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
@RequestMapping("/login/")
public class LoginREST {
    @Autowired
    private LoginService loginService;
    @GetMapping()
    private ResponseEntity<List<Login>> getAllPersona(){
        return ResponseEntity.ok(loginService.findAll());
    }

    @PostMapping
    private ResponseEntity<Login> savePersona (@RequestBody Login login){
        try {
            Login personaGuardada = loginService.save(login);
            return ResponseEntity.created(new URI("/login/"+personaGuardada.getEmail())).body(personaGuardada);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping (value = "delete/{email}")
    private ResponseEntity<Boolean> deletePersona(@PathVariable ("email") String id_email){
        loginService.deleteById(id_email);
        return ResponseEntity.ok(!(loginService.findById(id_email)!=null));
    }

}
