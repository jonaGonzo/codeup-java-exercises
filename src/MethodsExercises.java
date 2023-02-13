public class MethodsExercises {

//    1.

    public static int Addition(int a, int b) {
        return a + b;
    };

    public static int Subtract(int a, int b) {
        return a - b;
    };

    public static int Multiplication(int a, int b) {
        return a * b;
    };

    public static int Division(int a, int b) {
      return a / b;
    };

    public static int Modulus(int a, int b){
        return a%b;
    }

//    2.


    public static void main(String[] args) {
        System.out.println(Addition(1,2));
        System.out.println(Subtract(3,2));
        System.out.println(Multiplication(3,3));
        System.out.println(Division(12, 9));
        System.out.println(Modulus(12, 7));
    }
}




