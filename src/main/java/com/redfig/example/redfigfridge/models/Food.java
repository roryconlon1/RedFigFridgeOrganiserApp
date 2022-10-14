package com.redfig.example.redfigfridge.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @Enumerated(value=EnumType.STRING)
    private FoodType foodType;
    @Column(name="pantryFood")
    private Boolean pantryFood;
    @Column(name="fridgeFood")
    private Boolean fridgeFood;

    @Column(name="image")
    private String image;

    @ManyToMany
    @JsonIgnoreProperties({"foods"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "foods_recipes",
            joinColumns = {@JoinColumn(name = "food_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "recipe_id", nullable = false, updatable = false)}
    )
    private List<Recipe> recipes;

    public Food(String name, Integer calories, FoodType foodType, Boolean pantryFood, Boolean fridgeFood, String image) {
        this.name = name;
        this.calories = calories;
        this.foodType = foodType;
        this.pantryFood = pantryFood;
        this.fridgeFood = fridgeFood;
        this.image = image;
        this.recipes = new ArrayList<>();
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

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
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

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
