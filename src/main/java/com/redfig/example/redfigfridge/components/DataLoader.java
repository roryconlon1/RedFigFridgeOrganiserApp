package com.redfig.example.redfigfridge.components;

import com.redfig.example.redfigfridge.models.Food;
import com.redfig.example.redfigfridge.models.Recipe;
import com.redfig.example.redfigfridge.models.FoodType;
import com.redfig.example.redfigfridge.models.RecipeType;
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
        Food mince = new Food("Mince", 500, FoodType.PROTEIN, false, true, "https://www.denstonehall.co.uk/wp-content/uploads/2020/04/steak_mince.jpg");
        foodRepository.save(mince);
        Food onion = new Food("Onion", 50, FoodType.VEGETABLE, true, false, "https://produits.bienmanger.com/34833-0w600h600_Organic_Yellow_Onion.jpg");
        foodRepository.save(onion);
        Food carrot = new Food("Carrot", 50, FoodType.VEGETABLE, false, true, "https://media.healthyfood.com/wp-content/uploads/2019/07/The-lost-plot-growing-carrots-iStock-471680420.jpg");
        foodRepository.save(carrot);
        Food choppedTomato = new Food("Chopped Tomatoes", 60, FoodType.VEGETABLE, true, false, "https://freshpointlocal.co.uk/wp-content/uploads/2019/04/ChoppedTomatoes.jpg");
        foodRepository.save(choppedTomato);
        Food spaghetti = new Food("Spaghetti", 100, FoodType.CARBOHYDRATE, true, false, "https://www.tasteofhome.com/wp-content/uploads/2019/03/shutterstock_116159029-small.jpg");
        foodRepository.save(spaghetti);
        Food banana = new Food("Banana", 5, FoodType.FRUIT, true, false, "https://images.immediate.co.uk/production/volatile/sites/30/2017/01/Bananas-218094b-scaled.jpg");
        foodRepository.save(banana);
        Food flour = new Food("Flour", 1, FoodType.CARBOHYDRATE, true, false, "https://www.thespruceeats.com/thmb/dKYZwtTOK8JcLiDCrvBrwTE5qDc=/1000x1000/smart/filters:no_upscale()/all_purpose_flour1_2-92747f05d2c7445d86fedae894c8c16e.jpg");
        foodRepository.save(flour);
        Food egg = new Food("Egg", 180, FoodType.PROTEIN, false, true, "https://i0.wp.com/post.healthline.com/wp-content/uploads/2020/05/eggs-counter-1296x728-header.jpg?w=1155&h=1528");
        foodRepository.save(egg);
        Food sugar = new Food("Sugar", 500, FoodType.FAT, true, false, "https://www.tasteofhome.com/wp-content/uploads/2019/11/sugar-shutterstock_615908132.jpg?fit=700,800");
        foodRepository.save(sugar);
        Food beans = new Food("Beans", 300, FoodType.CARBOHYDRATE, true, false, "https://moonandspoonandyum.com/wp-content/uploads/2022/05/baked-beans.jpg");
        foodRepository.save(beans);
        Food bread = new Food("Bread", 100, FoodType.CARBOHYDRATE, true, false, "https://assets.bonappetit.com/photos/5f84743360f032defe1f5376/16:9/w_2192,h_1233,c_limit/Pullman-Loaf-Lede-new.jpg");
        foodRepository.save(bread);

        Recipe spagBol = new Recipe("Spaghetti Bolognese", RecipeType.PASTA, 300, "Chop veg, cook it, add mice, cook it, come back in 5 hours", "https://recipetineats.com/wp-content/uploads/2018/07/Spaghetti-Bolognese.jpg");
        recipeRepository.save(spagBol);
        Recipe bananaBread = new Recipe("Banana Bread", RecipeType.DESERT, 45, "Mix ingredients and fling it in the oven.", "https://www.simplyrecipes.com/thmb/n0haOVlgXcM8Sr53p3C-U53YP2U=/4399x3299/smart/filters:no_upscale()/Simply-Recipes-Easy-Banana-Bread-LEAD-2-2-63dd39af009945d58f5bf4c2ae8d6070.jpg");
        recipeRepository.save(bananaBread);
        Recipe beansOnToast = new Recipe("Beans on Toast", RecipeType.DESERT, 10, "Cook beans n place it on toast.", "https://yourcookingbuddy.com/wp-content/uploads/2022/02/baked-beans-toast-img-11.jpg");
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
