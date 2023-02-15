package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(String input) {
        System.out.println("Enter a string: ");
        return this.scanner.nextLine();
    }

    public Boolean yesNo(String input) {
        System.out.println("Continue [Y/n]? ");
        String inputToLower = input.toLowerCase();
        return inputToLower.equals("y") || inputToLower.equals("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("Pick a number between %d and %d.", min, max);
        int userInput = scanner.nextInt();
        if (userInput > max || userInput < min) {
            getInt(min, max);
        } else {
            System.out.printf("Your number was: %d", userInput);
        }
        return userInput;
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Pick a number between %f and %f.", min, max);
        double userInput = scanner.nextDouble();
        if (userInput > max || userInput < min) {
            getDouble(min, max);
        } else {
            System.out.printf("Your number was %f", userInput);
        }
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter a number with a decimal: ");
        double userInput = scanner.nextDouble();
        System.out.printf("Your number: %f", userInput );
        return userInput;
    }

}