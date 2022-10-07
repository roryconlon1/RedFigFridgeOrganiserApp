package com.redfig.example.redfigfridge.repositories;

import com.redfig.example.redfigfridge.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
