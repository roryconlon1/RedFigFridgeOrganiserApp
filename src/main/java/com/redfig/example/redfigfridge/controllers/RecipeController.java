package com.redfig.example.redfigfridge.controllers;

import com.redfig.example.redfigfridge.models.Food;
import com.redfig.example.redfigfridge.models.Recipe;
import com.redfig.example.redfigfridge.repositories.FoodRepository;
import com.redfig.example.redfigfridge.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    FoodRepository foodRepository;

    @GetMapping(value = "/recipes")
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        return new ResponseEntity<>(recipeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/recipes/{id}")
    public ResponseEntity getIndividualRecipe(@PathVariable Long id){
        return new ResponseEntity<>(recipeRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/recipes")
    public ResponseEntity<Recipe> postRecipe(@RequestBody Recipe recipe){
        recipeRepository.save(recipe);
        return new ResponseEntity<>(recipe, HttpStatus.CREATED);
    }

    @PutMapping(value="/recipes/{recipeId}/addIngredient/{foodId}")
    public ResponseEntity<Recipe> addIngredient(@PathVariable Long recipeId, @PathVariable  Long foodId){
        Recipe recipe = recipeRepository.findById(recipeId).get();
        Food food = foodRepository.findById(foodId).get();
        recipe.addFood(food);
        recipeRepository.save(recipe);
        return new ResponseEntity<>(recipe, HttpStatus.OK);
    }


    @DeleteMapping(value = "/recipes/{id}")
    public ResponseEntity<Recipe> deleteRecipe(@PathVariable Long id){
        Recipe found = recipeRepository.getById(id);
        recipeRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }



}
