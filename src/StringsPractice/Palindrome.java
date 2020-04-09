package StringsPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original;
        String reverse = "";

        System.out.println("Please enter String or Number to check if it is Plandrome ");
        Scanner sc = new Scanner(System.in);
        original = sc.nextLine();

        int length = original.length();

        for(int i=length-1; i>=0; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        if(original.equalsIgnoreCase(reverse))
        {
            System.out.println("Entered String or number is StringsPractice.Palindrome");
        }
        else{
            System.out.println("Entered String or number is NOT StringsPractice.Palindrome");
        }

    }
}
