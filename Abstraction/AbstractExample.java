abstract class AbstractClass{
   abstract void AbstractMethod1(); // Abstract methods are those 'methods without body or implemetation'

   abstract void AbstractMethod2();

   void ConceteMethod1(){ // 'methods which have complete implementation and provides actual functionality', just opposite to abstract methods 
    System.out.println("This is concrete method 1");
   }

   void ConcreteMethod2(){
    System.out.println("This is concrete method 2");
   }

}

class ConcreteClass extends AbstractClass{
    @Override
    void AbstractMethod1() {
    System.out.println("Implementation of Abstract method 1.");
     }

    @Override
    void AbstractMethod2(){
        System.out.println("Implementation of Abstract method 2.");
    }

}
public class AbstractExample {
    public static void main(String[] args) {
        // Crete an objact of an concrete class
        ConcreteClass obj = new ConcreteClass();
        // call method
        obj.AbstractMethod1();
        obj.AbstractMethod2();
        obj.ConceteMethod1();
        obj.ConcreteMethod2();
    }
}
