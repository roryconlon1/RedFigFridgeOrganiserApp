package com.redfig.example.redfigfridge.controllers;

import com.redfig.example.redfigfridge.models.Food;
import com.redfig.example.redfigfridge.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    FoodRepository foodRepository;

    @GetMapping(value = "/foods")
    public ResponseEntity<List<Food>> getAllFoods(){
        return new ResponseEntity<>(foodRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/foods/{id}")
    public ResponseEntity getIndividualFood(@PathVariable Long id){
        return new ResponseEntity<>(foodRepository.findById(id), HttpStatus.OK);
    }
}
