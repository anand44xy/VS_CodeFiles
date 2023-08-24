/*
 * Time Complexity: O(log b) This is because the algorithm uses a binary exponentiation approach.
 * Space Complexity: O(log b)
 */
package Recursion;
import java.util.Scanner;

class PowerFind{
 public static int PowerCalc(int a,int b){

  if (b==0) { //1.Base Case Condition
    return 1;
  }
  else {
    int mid=b/2;
    int result=PowerCalc(a, mid);//2.Recursive call
    int finalResult=result*result;
    
    //if b is even or odd then
    if (b%2==0) {
      return finalResult;
    } else {
      return a*finalResult;
    }
  }
 }

 public static void main(String[] args) { 

  Scanner scn=new Scanner(System.in);
  System.out.println("Enter the value of a:");
  int a=scn.nextInt();
  System.out.println("Enter the value of b:");
  int b=scn.nextInt();
  scn.close();

  //function calling
  int power=PowerCalc(a, b);
  System.out.println("a^b is: "+power);
  

 }
}
