// Multi-Level Inheritance: A class that can have mltiple parent class
package Inheritance;
class Demo1{
   void display(){
    System.out.println("display method of Demo1 class");
   }
}

class Demo2 extends Demo1{

}

class Demo3 extends Demo2{

}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Demo3 d3=new Demo3();
        d3.display();
    }
}

