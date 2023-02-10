import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately: %.2f\n",  pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();
        System.out.println("You entered: " + input);

        System.out.println("Enter three words: ");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
        System.out.printf("Your three words are: %s %s %s %n", wordOne, wordTwo, wordThree);

        scanner.nextLine();

        System.out.println("Enter in a sentence: ");
        String userSent = scanner.nextLine();
        System.out.printf("You said: %s %n", userSent);

        System.out.println("Enter the approx. length of the classroom: ");
        String length = scanner.next();

        System.out.println("Enter the approx. width of the classroom: ");
        String width = scanner.next();
        int lengthNum = Integer.parseInt(length);
        int widthNum = Integer.parseInt(width);
        int area = lengthNum * widthNum;
        int perimeter = (lengthNum + lengthNum) + (widthNum + widthNum);
        System.out.printf("The area of your classroom: %s\n", area);
        System.out.printf("The perimeter of your classroom: %s", perimeter);


    }
}
