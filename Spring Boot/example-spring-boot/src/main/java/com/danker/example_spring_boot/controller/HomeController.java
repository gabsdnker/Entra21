package com.danker.example_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controlador REST que responde a requisições HTTP
@RestController
public class HomeController {
    
    // Método que responde a requisições GET na raiz do contexto da aplicação
    @GetMapping("/")
    public String helloWorld(){
        return "Hello, World!";
    }
}
