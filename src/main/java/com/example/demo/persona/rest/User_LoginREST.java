package com.example.demo.persona.rest;

import com.example.demo.model.User_Login;
import com.example.demo.persona.repository.User_LoginRepository;
import com.example.demo.persona.service.User_LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/user_login/")
public class User_LoginREST {

    @Autowired
    private User_LoginService user_loginService;

    @GetMapping()
    private ResponseEntity<List<User_Login>> getAllUser_Login(){
        return ResponseEntity.ok(user_loginService.findAll());
    }

    @PostMapping
    private ResponseEntity<User_Login> saveUser(@RequestBody User_Login bodyLogin){
        try{
            User_Login userSaved = user_loginService.save(bodyLogin);
            return ResponseEntity.created(new URI("/user_login/"+userSaved.getCorreo())).body(userSaved);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "delete/{correo}")
    private ResponseEntity<Boolean> borrarUser(@PathVariable ("correo") String ide_correo){
        user_loginService.deleteById(ide_correo);
        return ResponseEntity.ok(!(user_loginService.findById(ide_correo)!=null));
    }




}
