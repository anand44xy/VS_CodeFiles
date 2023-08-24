/*
 * Recursion: "A function that call itself is called Recursion."
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Recursion;
import java.util.Scanner;

class Factorialfind{
  public static int Calcfactorial(int n){
    if (n==0 || n==1) { //1.Base Case Condition
        return 1;
    }
    else{
       int result=n*Calcfactorial(n-1); //2.Recursive call
       return result;
    }
  }

  public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the no. whose factorial that you want to find: ");
    int n=scn.nextInt();

    // function calling
    int factorial=Calcfactorial(n);
    System.out.println("Factorial of "+n+" is: "+factorial);
    scn.close();
  }
}