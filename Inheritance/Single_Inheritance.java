//Inheritance: ("Tells about code reusabiltiy") 
//A class that inherites the features of another class is called Inheritance.
// Single Inheritance: Only one class can be inherited by it's parent class.
package Inheritance;

class ParentClass{
    void disp(){
        System.out.println("Method of paretn class ");
    }
}

class ChildClass extends ParentClass{

}

public class Single_Inheritance {
    public static void main(String[] args) {
        ChildClass cc=new ChildClass();
        cc.disp();
    }
    
}
