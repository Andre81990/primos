package com.example.demo.controller;

import com.example.demo.Entity.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class MealController {

    @GetMapping(value = "/meal")
    public List<Meal> getAll()
    {
        List<Meal> meal=new ArrayList<>();
        return meal;
    }

}
