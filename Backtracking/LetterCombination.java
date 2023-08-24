package Backtracking;

public class LetterCombination {

    public static void letterCombinations(String digits) {
        String[] mapping = {
            " ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        letterCombinationsHelper(digits, "", mapping);
    }

    public static void letterCombinationsHelper(String digits, String current, String[] mapping) {
        if (digits.length() == 0) {
            System.out.print(current + " ");
            return;
        }
        
        String letters = mapping[digits.charAt(0) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationsHelper(digits.substring(1), current + letters.charAt(i), mapping);
        }
    }

    public static void main(String[] args) {
        String input = "23"; // Example input
        letterCombinations(input);
    }
}
