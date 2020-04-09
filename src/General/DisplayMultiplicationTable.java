package General;

import java.util.Scanner;

public class DisplayMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for that multiplication table is required");
        int n = sc.nextInt();
        for(int i=0;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+n*i);
        }

    }


}
