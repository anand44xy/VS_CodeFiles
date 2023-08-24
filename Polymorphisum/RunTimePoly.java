//Runtime polymorphism, also known as dynamic polymorphism or method overriding, occurs when a subclass provides a specific implementation for a method that is already defined in its superclass or parent class. 
package Polymorphisum;
class Automobiles{
    public void FourWheelers(){
        System.out.println("My Four-Wheelers Collection");
    }
    public void TwoWheelers(){
        System.out.println("My Two-Wheelers Collection");
    }
}

class MahindraTHAR extends Automobiles{
    @Override
    public void FourWheelers(){
        System.out.println("My new Mahindra THAR");
    }
}

class REcontinentalGT650 extends Automobiles{
    @Override
    public void TwoWheelers(){
        System.out.println("My new Royal Enfield Continental GT 650");
    }
}

class REhunter350 extends Automobiles{
    @Override
    public void TwoWheelers(){
        System.out.println("My new Royal Enfield Hunter 350");
    }
}


public class RunTimePoly {
    public static void main(String[] args) {
       Automobiles auto1=new MahindraTHAR();
       Automobiles auto2=new REcontinentalGT650();
       Automobiles auto3=new REhunter350();
    
       auto1.FourWheelers(); //Calls the overridden FourWheeler method of the MahindraTHAR class
       auto2.TwoWheelers();  //Calls the overridden TwoWheelers method of the REcontinentalGT650 class
       auto3.TwoWheelers();  //Calls the overridden TwoWheelers method of the Ehunter350 class
    }
}

