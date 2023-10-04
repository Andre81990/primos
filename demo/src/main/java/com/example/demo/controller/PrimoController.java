package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimoController {
    @GetMapping(value = "/hello")
    public String ciao()
    {
        return "hello world!";

    }
    @GetMapping(value = "/greeting")
    public ResponseEntity<String> saluti()
    {
        return ResponseEntity.ok("buon pomeriggio");
    }

}
