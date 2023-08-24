/*
Q.4 Create an interface called Drawable with a method draw() that has no implementation. Implement this interface
 in classes Circle and Rectangle. Write a program that creates objects of Circle and Rectangle and calls the draw()
 method on each object.
 Ans. 
 */
package MockTest1;

interface Drawable{
    void Draw();
}

class Circle implements Drawable{

    @Override
    public void Draw() {
        System.out.println("Drawing the shape of circle.");      
    }

}

class Rectangle implements Drawable{
    @Override
    public void Draw(){
        System.out.println("Drawing the shape of Rectangle.");
    }
}
public class Question4 {
    public static void main(String[] args) {
        //Creatin the objects of Circle and Rectangle and call the method Draw .
        Drawable circle=new Circle();
        circle.Draw();
        
        Drawable rectangle=new Rectangle();
        rectangle.Draw();


    }
}
