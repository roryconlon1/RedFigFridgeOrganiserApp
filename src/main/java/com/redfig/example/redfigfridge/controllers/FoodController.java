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
public class FoodController {

    @Autowired
    FoodRepository foodRepository;

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping(value = "/foods")
    public ResponseEntity<List<Food>> getAllFoods(){
        return new ResponseEntity<>(foodRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/foods/{id}")
    public ResponseEntity getIndividualFood(@PathVariable Long id){
        return new ResponseEntity<>(foodRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/foods")
    public ResponseEntity<Food> postFood(@RequestBody Food food){
        foodRepository.save(food);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }

    @DeleteMapping(value="/foods/{id}")
    public ResponseEntity<Food> deleteFood(@PathVariable Long id){
        Food found = foodRepository.getById(id);
        foodRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping(value = "/foods/{foodsId}/addRecipe/{recipeId}")
    public ResponseEntity<Food> addRecipe(@PathVariable Long foodId, @PathVariable Long recipeId){
        Food food = foodRepository.findById(foodId).get();
        Recipe recipe = recipeRepository.findById(recipeId).get();
        food.addRecipe(recipe);
        foodRepository.save(food);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }

}
