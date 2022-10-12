package com.redfig.example.redfigfridge.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "recipe_type")
    private RecipeType recipeType;
    @Column(name = "cook_time")
    private Integer cookTime;
    @Column(name = "method")
    private String method;

    @ManyToMany
    @JsonIgnoreProperties({"recipes"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "foods_recipes",
            joinColumns = {@JoinColumn(name = "recipe_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "food_id", nullable = false, updatable = false)}
    )
    private List<Food> foods;

    public Recipe(String name, RecipeType recipeType, Integer cookTime, String method) {
        this.name = name;
        this.recipeType = recipeType;
        this.cookTime = cookTime;
        this.method = method;
        this.foods = new ArrayList<>();
    }

    public Recipe() {
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

    public RecipeType getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(RecipeType recipeType) {
        this.recipeType = recipeType;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public void addFood(Food food){
        this.foods.add(food);
    }
}
