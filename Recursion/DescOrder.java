/*
 * Recursion: A function that call itself is called Recursion.
 */
package Recursion;
//Descending order of a integer series
public class DescOrder {
    public static void PrintNo(int n){
        if (n==0) { //1.Base Case Condition(Termination Condition)
            return;
        }
        System.out.print(" "+ n);
        PrintNo(n-1); //2.Recursive call
    }

public static void main(String[] args) {
   int n=10;
   // function calling
    PrintNo(n);
}
}