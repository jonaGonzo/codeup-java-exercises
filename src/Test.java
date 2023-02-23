import java.awt.*;

class Test {
    public static void main(String[] args) {
        String newString = "Run with me!";
    try {
        String newSubString = newString.substring(15);
        System.out.println(newString.length());

    } catch (Exception e){
        System.out.println("You caught the exception.");
    }
    }}
