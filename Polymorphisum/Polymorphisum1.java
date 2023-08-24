/*  Polymorphisum: (Tells about Flexibility)
>Ability of different classes to be treated as object of their common base class (or interface)through method overriding.
>Rduce the size of code by parent type reference and child class object.
*/
package Polymorphisum;

abstract class Company{
   abstract public void Tech(); // Abstract method

   abstract public void NonTech(); // Abstract method
  
   public void other(){   // Concrete method  / implimentation is there......
    System.out.println("Abstract class can have abstract methods and concrete methods also.");
   }
}
// #Hierarchical_inheritance
class IBI extends Company{
  @Override
  public void Tech(){
    System.out.println("IBI is a tech company and it is hire Java Developers.");
   }
   
   public void NonTech(){
    System.out.println("IBI is not a non-tech company.");
   }

   public void general(){ //Specilized Method
    System.out.println("Such a mthods which are present only in chlild class not in parent class are called *Specilized Methods* ");
   }
}

// #Hierarchical_inheritance
class PWskills extends Company{
  @Override
   public void Tech(){
    System.out.println("PW Skills is a tech company and it is hire Java Developers and DATA Scintist.");
   }
   
   public void NonTech(){
    System.out.println("PW Skills is not a non-tech company.");
   }
}

class ITindustires{
      public void WorkSpace(Company ref){
        ref.Tech();
        ref.NonTech();
        System.out.println("-------------------------------------");
    }
}

public class Polymorphisum1 {
    public static void main(String[] args) {
        IBI ibi=new IBI();
        PWskills pw=new PWskills();
       
        ITindustires IT=new ITindustires();
        IT.WorkSpace(ibi);
        IT.WorkSpace(pw);
        
        //-------------------------------------
        Company ibiComp=new IBI();
        ((IBI)ibiComp).general(); // Down Casting: Specilized methods are not diretly accessed. 
        
    }
}

/*     
        Abstraction: Abstraction is the process of simplifying the complex system by showing the essential deatils only and hiding the unnecessoray details.
        Inheritance: The classes IBI and PWskills both inherit from the base class Company. 
        This establishes an "is-a" relationship, where IBI and PWskills are both specialized types of the Company class.

        Method Overriding: In the derived classes IBI and PWskills, you have overridden the Tech() and NonTech() methods inherited
         from the base class Company. This allows each derived class to provide its own implementation of these methods while adhering to the same method signature defined in the base class.

        Polymorphic Method Invocation: In the ITindustires class, the WorkSpace method takes a parameter of type Company (the base class type). 
        This means that you can pass instances of IBI or PWskills to this method, and it will call the appropriate overridden methods based on the actual runtime type of the object. This demonstrates polymorphism in action.
 */