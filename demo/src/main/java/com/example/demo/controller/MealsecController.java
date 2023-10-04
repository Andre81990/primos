package com.example.demo.controller;


import com.example.demo.Entity.Meal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MealsecController {
    private List<Meal> meals =new ArrayList<>();

    public Meal getMealByName(@PathVariable ("nome")String nome)
    {
       // return foundMeal;
        return null;
    }

}
