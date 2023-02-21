package shapes;

 class Square extends Quadrilateral implements Measurable{

     protected double side;
     public Square(double side){
         super(side, side);
         this.side = side;
     }
     @Override
     public double getPerimeter() {
         return side * 4;
     }

     @Override
     public double getArea() {
         return side * side;
     }


}
