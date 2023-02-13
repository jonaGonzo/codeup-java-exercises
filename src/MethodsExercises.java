import java.util.Scanner;

public class MethodsExercises {

//    1.

    public static int Addition(int a, int b) {
        return a + b;
    }

    ;

    public static int Subtract(int a, int b) {
        return a - b;
    }

    ;

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    ;

    public static int Division(int a, int b) {
        return a / b;
    }

    ;

    public static int Modulus(int a, int b) {
        return a % b;
    }

//    2.

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            System.out.println("Input is out of range. Try Again.");
            return getInteger(min, max);
        }
    };


//    3.

    public static long factorial(int num) {
        long output = 1;
        for (int i= 1; i <= num; i += 1) {
            output *= i;
        }
        return output;
    }


    public static void main(String[] args) {

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println(" You entered: " + userInput);
//
//        System.out.println(Addition(1, 2));
//        System.out.println(Subtract(3, 2));
//        System.out.println(Multiplication(3, 3));
//        System.out.println(Division(12, 9));
//        System.out.println(Modulus(12, 7));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
    }
}




