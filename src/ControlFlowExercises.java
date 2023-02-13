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

        System.out.println("Pick a number up to 100, to receive the multiple table: ");
        int userNum = scanner.nextInt();
        System.out.println("Do you want to continue: [y/N]");
        String userContinue = scanner.next();
        if (userContinue.equals("y")){
            System.out.println("""
            Here is a table!

            number | squared | cubed
            ------ | ------- | -----
            """);
            for (int i = 0; i <= 5; i += 1) {
                System.out.println(i + "      |" + i * userNum + "       |" + i * userNum * userNum);
            }

        } else {
            System.out.println("Ok");
        }
        
        
//        Exercise 4

        System.out.println("Please enter your numeric grade (a value of 0 - 100): ");
        int userGrade = scanner.nextInt();
        System.out.println("Do you want to continue: [y/N]");
        String userCont = scanner.next();
        if(userCont.equals("y") && userGrade <= 59){
            System.out.println("F: 59 - 0");
        } else if(userCont.equals("y") && userGrade >=  60 && userGrade <= 66){
            System.out.println("D: 66-60");
        } else if(userCont.equals("y") && userGrade >=  67 && userGrade <= 79){
            System.out.println("C: 79-67");
        } else if(userCont.equals("y") && userGrade >=  80 && userGrade <= 87){
            System.out.println("B: 87-80");
        } else if(userCont.equals("y") && userGrade >=  88 && userGrade <= 100){
            System.out.println("A: 88-100");
        }
    }
}
