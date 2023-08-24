package Recursion;

public class Example2 {
    public static void fun(String s) {
        if (s.length() == 0) {
            return;
        }
        System.out.print(s.charAt(0));
        fun(s.substring(1));
        System.out.print(s.charAt(0));
    }

    public static void main(String[] args) {
        String input = "abcde";
        fun(input);
    }
}
