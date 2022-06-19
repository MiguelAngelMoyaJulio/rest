package com.example.demohero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hola")
    public String saludo() {
        return "hola mi primer app en la nube";
    }

}
