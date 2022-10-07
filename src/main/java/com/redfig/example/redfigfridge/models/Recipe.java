package com.redfig.example.redfigfridge.models;

import javax.persistence.*;
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
    private recipeType recipeType;
    @Column(name = "cook_time")
    private Integer cookTime;
    @Column(name = "method")
    private String method;

    public Recipe(String name, com.redfig.example.redfigfridge.models.recipeType recipeType, Integer cookTime, String method) {
        this.name = name;
        this.recipeType = recipeType;
        this.cookTime = cookTime;
        this.method = method;
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

    public com.redfig.example.redfigfridge.models.recipeType getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(com.redfig.example.redfigfridge.models.recipeType recipeType) {
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
}
