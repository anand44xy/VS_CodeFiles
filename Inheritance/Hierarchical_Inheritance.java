// Hierarchical inheritance: Any number of class can be inherited form same class.
package Inheritance;

class Demo1{
   void display(){
    System.out.println("display method of Demo1 class");
   }
}

class Demo2 extends Demo1{

}

class Demo3 extends Demo1{

}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Demo3 d3=new Demo3();
        d3.display();
    }
}
