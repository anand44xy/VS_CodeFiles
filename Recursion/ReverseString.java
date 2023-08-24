package Recursion;

public class ReverseString {
    public static void fun(String s) {
        if (s.length() == 0) {
            return;
        }
        
        System.out.print(s.charAt(s.length() - 1));
        fun(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        String input = "abcd";
        fun(input);
    }
}
