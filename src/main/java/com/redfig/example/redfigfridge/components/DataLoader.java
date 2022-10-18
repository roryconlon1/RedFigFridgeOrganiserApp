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
        Food bacon = new Food("Bacon", 310, FoodType.PROTEIN, false, true, "https://cdn.shopify.com/s/files/1/2808/1390/products/back_bacon_887x589.jpg?v=1526392672");
        foodRepository.save(bacon);
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
        Food parmesan = new Food("Parmesan", 220, FoodType.DAIRY, false, true, "https://d2cbg94ubxgsnp.cloudfront.net/Pictures/1024x536/3/9/4/89394_parmesan_shutterstock_152999969_630m.jpg");
        foodRepository.save(parmesan);
        Food lettuce = new Food("Lettuce", 23, FoodType.VEGETABLE, false, true, "https://i0.wp.com/post.healthline.com/wp-content/uploads/2020/03/romaine-lettuce-1296x728-body.jpg?w=1155&h=1528");
        foodRepository.save(lettuce);
        Food whiteVinegar = new Food("White Wine Vinegar", 8, FoodType.CARBOHYDRATE, true, false, "https://ichef.bbci.co.uk/food/ic/food_16x9_832/foods/w/white_wine_vinegar_16x9.jpg");
        foodRepository.save(whiteVinegar);
        Food mayonnaise = new Food("Mayonnaise", 130, FoodType.FAT, false, true, "https://media-cldnry.s-nbcnews.com/image/upload/newscms/2022_26/1883740/homemade-mayonnaise-2x1-bn-220628.jpg");
        foodRepository.save(mayonnaise);
        Food anchovy = new Food("Anchovy", 145, FoodType.PROTEIN, true, false, "https://substackcdn.com/image/fetch/f_auto,q_auto:good,fl_progressive:steep/https%3A%2F%2Fbucketeer-e05bbc84-baa3-437e-9518-adb32be77984.s3.amazonaws.com%2Fpublic%2Fimages%2Fc7972286-f8af-45be-9e1b-7190b14cea72_3108x2331.jpeg");
        foodRepository.save(anchovy);
        Food garlic = new Food("Garlic", 13, FoodType.VEGETABLE, true, false, "https://cdn-prod.medicalnewstoday.com/content/images/articles/265/265853/bulbs-and-bowl-of-garlic.jpg");
        foodRepository.save(garlic);
        Food crouton = new Food("Crouton", 90, FoodType.CARBOHYDRATE, true, false, "https://feelgoodfoodie.net/wp-content/uploads/2020/11/Homemade-Croutons-4.jpg");
        foodRepository.save(crouton);
        Food chicken = new Food("Chicken Breast", 200, FoodType.PROTEIN, false, true, "https://karachifarmersmarket.com/wp-content/uploads/2021/06/chicken-breasts.jpg");
        foodRepository.save(chicken);
        Food cheddar = new Food("Cheddar Cheese", 300, FoodType.DAIRY, false, true, "https://www.verywellfit.com/thmb/CC1fl_ZPwpBVgyexTm3N5lK40VQ=/3000x1687/smart/filters:no_upscale()/cheddar-cheese-crop-3fdf5ad3229e4748bbc0b8acdc442dcd.jpg");
        foodRepository.save(cheddar);
        Food mozz = new Food("Mozzarella", 250, FoodType.DAIRY, false, true, "https://www.thebuffalofarm.co.uk/sites/buffalo/files/styles/product/public/mozz-smaller.jpg?itok=7NoSw1e3");
        foodRepository.save(mozz);
        Food gruyere = new Food("Gruyere", 290, FoodType.DAIRY, false, true, "https://curd-nerd.com/wp-content/uploads/2018/06/What-Is-Gruyere-Cheese-.png");
        foodRepository.save(gruyere);
        Food macaroni = new Food("Macaroni", 175, FoodType.CARBOHYDRATE, true, false, "https://c.recipeland.com/uploads/image/image/663/fit640_pasta-elbow-macaroni.jpg");
        foodRepository.save(macaroni);
        Food butter = new Food("Butter", 164, FoodType.DAIRY, true, true, "https://www.southernliving.com/thmb/TGM7Ld1VKovoBV_Gr8WHITKE63I=/1777x1333/smart/filters:no_upscale():focal(999x665:1001x667)/butter_cutting_board-179875636-2000-14b4ec54a0a64d2f8c884822acb68415.jpg");
        foodRepository.save(butter);
        Food milk = new Food("Milk", 95, FoodType.DAIRY, false, true, "https://kerrsdairy.co.uk/wp-content/uploads/2021/12/1-Pint-Whole-Milk-Glass.jpg");
        foodRepository.save(milk);

        Recipe spagBol = new Recipe("Spaghetti Bolognese", RecipeType.PASTA, 300, "Chop veg, cook it, add mice, cook it, come back in 5 hours", "https://recipetineats.com/wp-content/uploads/2018/07/Spaghetti-Bolognese.jpg");
        recipeRepository.save(spagBol);
        Recipe bananaBread = new Recipe("Banana Bread", RecipeType.DESERT, 45, "Mix ingredients and fling it in the oven.", "https://www.simplyrecipes.com/thmb/n0haOVlgXcM8Sr53p3C-U53YP2U=/4399x3299/smart/filters:no_upscale()/Simply-Recipes-Easy-Banana-Bread-LEAD-2-2-63dd39af009945d58f5bf4c2ae8d6070.jpg");
        recipeRepository.save(bananaBread);
        Recipe beansOnToast = new Recipe("Beans on Toast", RecipeType.DIET, 10, "Cook beans n place it on toast.", "https://yourcookingbuddy.com/wp-content/uploads/2022/02/baked-beans-toast-img-11.jpg");
        recipeRepository.save(beansOnToast);
        Recipe carbonara = new Recipe("Spaghetti Carbonara", RecipeType.PASTA, 30, "Bring a pot to a boil and add the Spaghetti.    Add bacon to a cold pan and cook until crispy.  Combine egg and parmesan in a separate bowl.    Remove the pan with the bacon from the heat and combine with pasta, egg mixture and pasta water.", "https://static01.nyt.com/images/2021/02/14/dining/carbonara-horizontal/carbonara-horizontal-threeByTwoMediumAt2X-v2.jpg");
        recipeRepository.save(carbonara);
        Recipe caesar = new Recipe("Chicken Caesar Salad", RecipeType.SALAD, 30, "Put chicken in the oven at 180 degrees.  Crush garlic and add to a bowl with parmesan, anchovies, mayonnaise and white whine vinegar.  Break chicken into smaller pieces and combine with the lettuce, sauce, croutons and shaved parmesan.", "https://www.cookingclassy.com/wp-content/uploads/2015/01/chicken-caesar-salad2-edit-srgb..jpg");
        recipeRepository.save(caesar);
        Recipe macNCheese = new Recipe("Macaroni and Cheese", RecipeType.FAMILY, 45, "Boil a pot of salted water and add macaroni.  In another pan combine flour and butter and gradually add milk to form a roux.  Add the cheeses to the roux until desired consistency.  Finally add cooked macaroni to the cheese mixture and serve.", "https://upload.wikimedia.org/wikipedia/commons/4/44/Original_Mac_n_Cheese_.jpg");
        recipeRepository.save(macNCheese);

        spagBol.addFood(mince);
        spagBol.addFood(onion);
        spagBol.addFood(carrot);
        spagBol.addFood(choppedTomato);
        spagBol.addFood(spaghetti);
        spagBol.addFood(beans);
        spagBol.addFood(bacon);
        recipeRepository.save(spagBol);

        bananaBread.addFood(banana);
        bananaBread.addFood(flour);
        bananaBread.addFood(sugar);
        bananaBread.addFood(egg);
        recipeRepository.save(bananaBread);

        beansOnToast.addFood(beans);
        beansOnToast.addFood(bread);
        recipeRepository.save(beansOnToast);

        carbonara.addFood(egg);
        carbonara.addFood(egg);
        carbonara.addFood(egg);
        carbonara.addFood(bacon);
        carbonara.addFood(spaghetti);
        carbonara.addFood(parmesan);
        recipeRepository.save(carbonara);

        caesar.addFood(chicken);
        caesar.addFood(lettuce);
        caesar.addFood(mayonnaise);
        caesar.addFood(whiteVinegar);
        caesar.addFood(parmesan);
        caesar.addFood(crouton);
        caesar.addFood(garlic);
        caesar.addFood(anchovy);
        recipeRepository.save(caesar);

        macNCheese.addFood(macaroni);
        macNCheese.addFood(flour);
        macNCheese.addFood(butter);
        macNCheese.addFood(milk);
        macNCheese.addFood(cheddar);
        macNCheese.addFood(mozz);
        macNCheese.addFood(gruyere);
        recipeRepository.save(macNCheese);

    }
}
