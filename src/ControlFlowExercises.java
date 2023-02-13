import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Exercise 1A

//        int i = 5;
//        System.out.println(i);
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//
//        int j = 105;

//        Exercise 1B

//        do {
//
//            System.out.println(j -= 5);
//        } while (j > -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            long num = (long) Math.pow(i, 2);
//            i = num;
//        } while (i <= 1000000);

//        Exercise 1C
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }

//        Exercise 2

//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//            }else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else if (i % 3 == 0) {
////                String fizz = "Fizz";
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Exercise 3
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a number you want to go to: ");
//        int input = scanner.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed\n------ | ------ | ------");
//            System.out.printf("%-6d | %=7d | %-5s%n, i, i * i, (i*i*i");

        int userNumber = 0;
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= userNumber; i++) {
            System.out.println(String.format("%-6d | %-7d | %-6d", i, i * i, i * i * i));

        }
    }
}
