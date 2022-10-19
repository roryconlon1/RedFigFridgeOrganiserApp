package com.redfig.example.redfigfridge;

import com.redfig.example.redfigfridge.models.*;
import com.redfig.example.redfigfridge.repositories.FoodRepository;
import com.redfig.example.redfigfridge.repositories.RecipeRepository;
import com.redfig.example.redfigfridge.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
class RedfigfridgeApplicationTests {

	@Autowired
	FoodRepository foodRepository;

	@Autowired
	RecipeRepository recipeRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}
	
//	@Test
//	public void canGetFoodAndRecipe(){
//		User paul = new User();
//		userRepository.save(paul);
//		Food mince = new Food("Mince (500g)", 500, FoodType.PROTEIN, false, true, "https://www.denstonehall.co.uk/wp-content/uploads/2020/04/steak_mince.jpg", paul);
//		foodRepository.save(mince);
//		Recipe spagBol = new Recipe("Spaghetti Bolognese", RecipeType.PASTA, 300, "Chop veg, cook it, add mice, cook it, come back in 5 hours", "https://recipetineats.com/wp-content/uploads/2018/07/Spaghetti-Bolognese.jpg", paul);
//		recipeRepository.save(spagBol);
//	}
//
//	@Test
//	public void canChangeUser(){
//		User paul = new User();
//		userRepository.save(paul);
//		User john = new User();
//		userRepository.save(john);
//		Food mince = new Food("Mince (500g)", 500, FoodType.PROTEIN, false, true, "https://www.denstonehall.co.uk/wp-content/uploads/2020/04/steak_mince.jpg", paul);
//		foodRepository.save(mince);
//		Recipe spagBol = new Recipe("Spaghetti Bolognese", RecipeType.PASTA, 300, "Chop veg, cook it, add mice, cook it, come back in 5 hours", "https://recipetineats.com/wp-content/uploads/2018/07/Spaghetti-Bolognese.jpg", paul);
//		recipeRepository.save(spagBol);
//		mince.setUser(john);
//		assertEquals(john, mince.getUser());
//	}


}
