package com.example.demo.controller;

import com.example.demo.Entity.Meal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealPriceRange {

    @GetMapping(value = "/meal/price")
    public List<Meal> getMealPrice(@RequestParam("min") double minPrice,
                                   @RequestParam("max") double maxPrice)
    {

        return null;
    }

}
