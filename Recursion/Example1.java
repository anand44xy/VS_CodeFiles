package Recursion;

public class Example1 {
  
        public static int fun(int n) { 
            if (n == 0) {
                return 0; 
            }
            return 1 + fun(n / 2);
        }
    
        public static void main(String[] args) {
            int input = 10; // Choose any integer you want to pass to the fun function
            int result = fun(input);
            System.out.println("Result: " + result);
        }
    }
    /*
     * For the input 10, it takes 4 steps to reach 0 (10 -> 5 -> 2 -> 1 -> 0),
     *  hence the output is 4. The same logic applies for other inputs as well.
     * 
     *  the main purpose of this code is to illustrate how a recursive function can be used 
     * to solve a problem that involves counting the number of halvings needed to reach 0 
     * from a positive integer.
     */
