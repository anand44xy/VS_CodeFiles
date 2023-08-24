/*
 * Time complexity: O(2^n)
 * Space complexity: O(n)
 */
package Recursion;
import java.util.Scanner;

public class CountStairs {
    public static int StairsFind(int n){
        //1.Base case condition
        if (n<=1) {
            return n;
        } else {
            //2.Recursive call
            int result=StairsFind(n-1)+StairsFind(n-2);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number of stairs: ");
        int n=scn.nextInt();
        scn.close();
        //function call
        int NumOfWays=StairsFind(n);
        System.out.println("Number of ways are: "+NumOfWays);
    }
}
