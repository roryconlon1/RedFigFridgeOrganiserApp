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
    @Enumerated(value = EnumType.STRING)
    private RecipeType recipeType;
    @Column(name = "cook_time")
    private Integer cookTime;
    @Column(name = "method")
    private String method;

    @Column(name="image")
    private String image;

    @ManyToMany
    @JsonIgnoreProperties({"recipes"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "foods_recipes",
            joinColumns = {@JoinColumn(name = "recipe_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "food_id", nullable = false, updatable = false)}
    )
    private List<Food> foods;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = true)
    @JsonIgnoreProperties({"recipes", "foods"})
    private User user;

    public Recipe(String name, RecipeType recipeType, Integer cookTime, String method, String image, User user) {
        this.name = name;
        this.recipeType = recipeType;
        this.cookTime = cookTime;
        this.method = method;
        this.image = image;
        this.foods = new ArrayList<>();
        this.user = user;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
