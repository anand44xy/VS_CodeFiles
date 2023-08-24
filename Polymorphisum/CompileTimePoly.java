//Compile-time polymorphism, also known as static polymorphism or method overloading, occurs when multiple methods in the same class have the same name but different parameter lists. 

package Polymorphisum;
class Calculator{
    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public String add(String str1, String str2){
        return str1+str2;
    }

    public double add(double num1, double num2){
        return num1+num2;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        Calculator calc=new Calculator();

        int score=calc.add(8, 9, 10);
        System.out.println("Score is: "+score);

        String name=calc.add("Anand ", "Saini");
        System.out.println("Your Name: "+name);

        double result=calc.add(5.5, 6.5);
        System.out.println("Result is: "+result);


    }
}
