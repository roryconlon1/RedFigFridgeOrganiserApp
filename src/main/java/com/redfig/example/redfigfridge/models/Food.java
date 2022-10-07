package com.redfig.example.redfigfridge.models;

import javax.persistence.*;

@Entity
@Table(name="foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="calories")
    private Integer calories;
    @Column(name="foodType")
    private foodType foodType;
    @Column(name="pantryFood")
    private Boolean pantryFood;
    @Column(name="fridgeFood")
    private Boolean fridgeFood;

    public Food(String name, Integer calories, com.redfig.example.redfigfridge.models.foodType foodType, Boolean pantryFood, Boolean fridgeFood) {
        this.name = name;
        this.calories = calories;
        this.foodType = foodType;
        this.pantryFood = pantryFood;
        this.fridgeFood = fridgeFood;
    }

    public Food() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public com.redfig.example.redfigfridge.models.foodType getFoodType() {
        return foodType;
    }

    public void setFoodType(com.redfig.example.redfigfridge.models.foodType foodType) {
        this.foodType = foodType;
    }

    public Boolean getPantryFood() {
        return pantryFood;
    }

    public void setPantryFood(Boolean pantryFood) {
        this.pantryFood = pantryFood;
    }

    public Boolean getFridgeFood() {
        return fridgeFood;
    }

    public void setFridgeFood(Boolean fridgeFood) {
        this.fridgeFood = fridgeFood;
    }
}
