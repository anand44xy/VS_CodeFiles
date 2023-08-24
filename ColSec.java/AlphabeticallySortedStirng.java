import java.util.Scanner;
import java.util.Arrays;
public class AlphabeticallySortedStirng {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=scn.next();
     
        String lowerCase=str.toLowerCase();
        char[] c=lowerCase.toCharArray();  
     
        Arrays.sort(c);
        System.out.println("Alphabetically sorted Stirng is: "+c);
   
    }
}