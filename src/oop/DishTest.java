package oop;

import static oop.DishTools.*;

public class DishTest {
    public static void main(String[] args) {
    Dish dish1 = new Dish(100, "Tacos", true);
        Dish dish2 = new Dish(200, "Burrito", true);
        dish2.printSummary();
        System.out.println(dish1.getNameOfDish());
        System.out.println(flipRecommendation(dish1));
    }
}
