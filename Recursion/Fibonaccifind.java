/*
 * Fibonaccci Series: 0,1,1,2,3,5,8,13....
 *   0+1=1
 *   1+1=2  ,so (n-1)+(n-2) 
 *       
 *  Time Complexity: O(2^n)
 *  Space Complexity: O(n)
 */
package Recursion;
import java.util.Scanner;
public class Fibonaccifind {
    public static int fibonacciSeries(int n){
         int result=0;
          //1. Base Case Condition
         if (n<=1) {
            return n;
         } else {
            //2. Recursive fuctio call
            result= fibonacciSeries(n-1)+ fibonacciSeries(n-2); 
         }
         return result;
    }

    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Enter the nth nubmber in fibonacci series:");
         int n=scn.nextInt();
         //function call
         int result=fibonacciSeries(n);
         System.out.println("The result of nth fibonaccu number is: "+result);
         scn.close();

    }
}
