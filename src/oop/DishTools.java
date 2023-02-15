package oop;

import static oop.Dish.lessThanADollar;

/*
 -- SHORT ASSIGNMENT #2 --
Create a class of static members (variables and methods) called DishTools
  - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
  - shoutDishName() - that takes in a Dish object and prints out the name in all caps
  - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
  - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
Try out the DishTools methods with Dish objects in the DishTest main method
BONUS - add some static methods to the Dish class that compares two dishes in some way
 */

class DishTools {
    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static String shoutDishName(Dish dish) {
        return String.format("%s", dish.getNameOfDish().toUpperCase());
    }
    public static String analyzeDishCost(Dish dish) {
        return (dish.getCostInCents() < AVERAGE_COST_OF_DISH_IN_CENTS) ? "Less expensive than average" : "More expensive than average";
    }
    public static boolean flipRecommendation(Dish dish) {
        return !dish.getWouldRecommend();
    }
    public static String analyzeCostDollar(Dish dish) {
        return (dish.getCostInCents() < lessThanADollar) ? "Dollar Find!" : "No go deal!";
    }
}




