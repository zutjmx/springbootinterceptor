package com.zutjmx.curso.springboot.app.interceptor.springbootinterceptor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;
import com.zutjmx.curso.springboot.app.interceptor.springbootinterceptor.models.Informacion;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/app")
public class ApplicationController {

    @GetMapping("/info")
    public ResponseEntity<Informacion> getInfoApp() {
        Informacion info = new Informacion(
            "Curso de Spring Boot, Interceptores",
            "zutjmx@gmail.com",
            "1.0.0"
        );
        return ResponseEntity.ok(info);
    }

    @GetMapping("/gotcharacter")
    public Map<String, String> getGotCharacter() {
        Faker faker = new Faker(Locale.getDefault());
        return Collections.singletonMap("nombre", faker.gameOfThrones().character());
    }
    
    @GetMapping("/lebowskiquote")
    public Map<String, String> getLebowskiQuote() {
        Faker faker = new Faker(Locale.getDefault());
        return Collections.singletonMap("cita", faker.lebowski().quote());
    }
    
}
