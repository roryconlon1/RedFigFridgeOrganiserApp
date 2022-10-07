package com.redfig.example.redfigfridge.repositories;

import com.redfig.example.redfigfridge.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}
