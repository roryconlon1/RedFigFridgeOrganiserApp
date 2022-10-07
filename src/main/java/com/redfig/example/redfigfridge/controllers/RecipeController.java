package com.redfig.example.redfigfridge.controllers;

import com.redfig.example.redfigfridge.models.Recipe;
import com.redfig.example.redfigfridge.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping(value = "/recipes")
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        return new ResponseEntity<>(recipeRepository.findAll(), HttpStatus.OK);
    }
}
