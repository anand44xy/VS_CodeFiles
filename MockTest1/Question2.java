/*
 * Q.2 
 *  Create a superclass called Shape with an abstract method calculateArea() that returns the area of the shape.
 *  Implement subclasses Rectangle, Circle, and Triangle that inherit from the Shape class.
 *  Implement the calculateArea() method in each subclass to calculate and return the area of a rectangle, circle,
 *  and triangle, respectively. Then, create a class called ShapeCalculator with a method printArea(Shape shape) that
 *  accepts an object of type Shape and prints its area. Demonstrate polymorphism by passing instances of different 
 *  subclasses to the printArea() method.
 *  Ans.
 */
package MockTest1;

abstract class Shape{
    abstract double calculateArea();
}

class Rectangle extends Shape{
    private double length;
    private double width;
    //Constructor
    public Rectangle(double length, double width){
       this.length=length;
       this.width=width;
    }

    @Override
    double calculateArea(){
     return length*width;
    }
} 


class Circle extends Shape{
    private double radius;
    //constructor
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    double calculateArea(){
        return radius*radius*Math.PI;
    }
    
}


class Traingle extends Shape{
    private double base;
     private double height;
     //constructor
     public Traingle(double base, double height){
         this.base=base;
         this.height=height;
     }

     @Override
     double calculateArea(){
        return 0.5*base*height;
     }

}

class ShapeCalculator{
    double printArea(Shape shape){
       double area= shape.calculateArea();
       System.out.println("Area of shape is: "+area);
       return area;
    }
}
public class Question2 {
    public static void main(String[] args) {
        ShapeCalculator shapeCalu=new ShapeCalculator();
        Shape rectangle=new Rectangle(4,5);
        Shape circle=new Circle(5);
        Shape triangle=new Traingle(2, 3);

        shapeCalu.printArea(rectangle);
        shapeCalu.printArea(circle);
        shapeCalu.printArea(triangle);

    }
}
