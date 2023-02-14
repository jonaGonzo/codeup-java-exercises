package oop;

import static oop.DishTools.*;

public class DishTest {
    public static void main(String[] args) {
    Dish dish1 = new Dish();
    dish1.costInCents = 72;
    dish1.nameOfDish = "Microwave Grapefruit";
    dish1.wouldRecommend = true;

    Dish dish2 = new Dish();
    dish2.costInCents = 172;
    dish2.nameOfDish = "Microwave Burrito";
    dish2.wouldRecommend = false;


        dish1.printSummary();
        System.out.println(shoutDishName(dish2));
        System.out.println(analyzeDishCost(dish1));
        System.out.println(flipRecommendation(dish2));
        System.out.println(analyzeCostDollar(dish1));
    }


}
