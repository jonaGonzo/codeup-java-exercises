package shapes;

import util.Input;

public class ShapesTest {

    private Rectangle box1;
    public ShapesTest(Rectangle box1) {
        this.box1 = box1;
    }


    // VIEWPORT //
    public static void main(String[] args) {
        Measurable myShape = new Square(10);
        System.out.println(myShape.getArea());


//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//
//        Input input = new Input();
//        System.out.println("Please enter a radius to create a circle");
//
//        double userRadius = input.getDouble();
//        System.out.println();
//        Circle circle = new Circle(userRadius);
//        System.out.printf("""
//                ========================
//                the circumfrence is %.3f
//                the area is %.2f
//                ========================
//                """, circle.getCircumference(), circle.getArea());
//        Rectangle newRectangle = new Rectangle(4, 5);
//        System.out.printf("""
//                ========================
//                Area: %.0f
//                Perimeter: %.0f
//                ========================
//                """, newRectangle.getArea(), newRectangle.getPerimeter());
//        Square newSquare = new Square(10);
//
//        System.out.printf("""
//                ========================
//                Area: %.0f
//                Perimeter: %.0f
//                ========================
//                """, newSquare.getArea(), newSquare.getPerimeter());

        System.out.printf("""
                 
                 /﹋\\
                (҂`_´)
                <,︻╤=╤====─ ҉ - - - JAVA
                 /﹋\\
                """);
    }
}


