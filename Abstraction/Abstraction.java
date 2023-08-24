/*
 * Abstraction:
 *  Abstraction is the process of simplifying the complex system by showing the essential deatils only-
 *  and hiding the unnecessoray details.
 *  
 */
abstract class Airoplane{
    abstract public void takeOff();
    abstract public void alert();
}

//  #multi_level_inheritance
class CargoPlane extends Airoplane{
    public void takeOff(){
    System.out.println("Cargo plane requires longer runway");
    }

    public void alert(){
        System.out.println("Please! Put your phone on Airplane mode.");
    }
}

//  #multi_level_inheritance
class Passanger extends Airoplane{
     public void takeOff(){
    System.out.println("Passanger plane requires medium runway");
    }

    public void alert(){
        System.out.println("Please ensure your seatbelts are securely fastened, your personal belongings are stowed away, and electronic devices are turned off or switched to airplane mode. Thank you for choosing to fly with us, and we wish you a pleasant journey.\"");
    }
}



public class Abstraction {
    public static void main(String[] args) {
     Airoplane ref1=new CargoPlane();
     Airoplane ref2=new Passanger();
     ref1.takeOff();
     ref1.alert();
     ref2.takeOff();
     ref2.alert();
     ((CargoPlane)ref1).alert();//Down Casting, NOTE:- "We cannot access specilized methods directly if parent class is abstract type class."
    }
}
