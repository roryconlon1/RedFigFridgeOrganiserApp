package com.redfig.example.redfigfridge;

import com.redfig.example.redfigfridge.models.Food;
import com.redfig.example.redfigfridge.models.Recipe;
import com.redfig.example.redfigfridge.models.foodType;
import com.redfig.example.redfigfridge.models.recipeType;
import com.redfig.example.redfigfridge.repositories.FoodRepository;
import com.redfig.example.redfigfridge.repositories.RecipeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
class RedfigfridgeApplicationTests {

	@Autowired
	FoodRepository foodRepository;

	@Autowired
	RecipeRepository recipeRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void canGetFoodAndRecipe(){
		Food food = new Food("Banana", 200, foodType.FRUIT, true, false);
		foodRepository.save(food);
		Recipe recipe = new Recipe("Banana Split", recipeType.DESERT, 10, "CutAndAdd");
		recipeRepository.save(recipe);
	}


}
