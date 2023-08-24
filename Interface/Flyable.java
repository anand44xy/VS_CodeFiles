interface Flyable{
    abstract void fly();
}

interface Swimable{
    abstract void swim();
}

class Duck implements Flyable, Swimable{
    @Override
    public void fly(){
        System.out.println("Ducks are flyable.");
    }

    @Override
    public void swim(){
        System.out.println("Ducks are swimable.");
    }
    
}

public class Interface{
    public static void main(String[] args) {
        Duck dk=new Duck();
        dk.fly();
        dk.swim();
    }
}