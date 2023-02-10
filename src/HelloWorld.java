public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 104;
        System.out.println(myFavoriteNumber);

        String myString = "And the whole world, loves it how you break it down!";
        System.out.println(myString);

        Float myNumber = 3.14F;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";
//
//        int x = 4;
//        x +=  5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(y);

        byte noFit = 127;
        System.out.println(++noFit);

        int maxVal = Integer.MAX_VALUE;
        System.out.println(++maxVal);

        System.out.printf("Ola %s %s %s %s %s","Jona", "with", "the", "big","heart");
    }

}
