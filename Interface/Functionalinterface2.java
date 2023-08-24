@FunctionalInterface
interface MathsOperation{
   int operation(int a, int b);
}


public class Functionalinterface2 {
    public static void main(String[] args) {
        // Create instance of functional interface using a lambda expression
        MathsOperation addition=(a,b)-> a+b;
        int reslt=addition.operation(2, 03);
        System.out.println("Addition is: "+reslt);

    }
 }
