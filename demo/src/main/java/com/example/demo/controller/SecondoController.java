package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SecondoController {


    private int x=1;

    @GetMapping(value = "/boolean")
    public ResponseEntity<String> boole() {
boolean is= new Random().nextBoolean();

        if (is){
            return ResponseEntity.badRequest().body("è minore di 4");
        }
        return ResponseEntity.ok("e maggiore di 4");
    }
}
