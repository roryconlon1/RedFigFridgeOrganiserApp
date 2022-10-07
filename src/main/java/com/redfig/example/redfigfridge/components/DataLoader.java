package com.redfig.example.redfigfridge.components;

import com.redfig.example.redfigfridge.models.Food;
import com.redfig.example.redfigfridge.models.Recipe;
import com.redfig.example.redfigfridge.models.foodType;
import com.redfig.example.redfigfridge.models.recipeType;
import com.redfig.example.redfigfridge.repositories.FoodRepository;
import com.redfig.example.redfigfridge.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FoodRepository foodRepository;

    @Autowired
    RecipeRepository recipeRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Food mince = new Food("Mince", 500, foodType.PROTEIN, false, true);
        foodRepository.save(mince);
        Food onion = new Food("Onion", 50, foodType.VEGETABLE, true, false);
        foodRepository.save(onion);
        Food carrot = new Food("Carrot", 50, foodType.VEGETABLE, false, true);
        foodRepository.save(carrot);
        Food choppedTomato = new Food("Chopped Tomatoes", 60, foodType.VEGETABLE, true, false);
        foodRepository.save(choppedTomato);
        Food spaghetti = new Food("Spaghetti", 100, foodType.CARBOHYDRATE, true, false);
        foodRepository.save(spaghetti);
        Food banana = new Food("Banana", 5, foodType.FRUIT, true, false);
        foodRepository.save(banana);
        Food flour = new Food("Flour", 1, foodType.CARBOHYDRATE, true, false);
        foodRepository.save(flour);
        Food egg = new Food("Egg", 180, foodType.PROTEIN, false, true);
        foodRepository.save(egg);
        Food sugar = new Food("Sugar", 500, foodType.FAT, true, false);
        foodRepository.save(sugar);
        Food beans = new Food("Beans", 300, foodType.CARBOHYDRATE, true, false);
        foodRepository.save(beans);
        Food bread = new Food("Bread", 100, foodType.CARBOHYDRATE, true, false);
        foodRepository.save(bread);

        Recipe spagBol = new Recipe("Spaghetti Bolognese", recipeType.PASTA, 300, "Chop veg, cook it, add mice, cook it, come back in 5 hours");
        recipeRepository.save(spagBol);
        Recipe bananaBread = new Recipe("Banana Bread", recipeType.DESERT, 45, "Mix ingredients and fling it in the oven.");
        recipeRepository.save(bananaBread);
        Recipe beansOnToast = new Recipe("Beans on Toast", recipeType.DESERT, 10, "Cook beans n place it on toast.");
        recipeRepository.save(beansOnToast);

        spagBol.addFood(mince);
        spagBol.addFood(onion);
        spagBol.addFood(carrot);
        spagBol.addFood(choppedTomato);
        spagBol.addFood(spaghetti);
        spagBol.addFood(beans);
        recipeRepository.save(spagBol);

        bananaBread.addFood(banana);
        bananaBread.addFood(flour);
        bananaBread.addFood(sugar);
        bananaBread.addFood(egg);
        recipeRepository.save(bananaBread);

        beansOnToast.addFood(beans);
        beansOnToast.addFood(bread);
        recipeRepository.save(beansOnToast);


    }
}
