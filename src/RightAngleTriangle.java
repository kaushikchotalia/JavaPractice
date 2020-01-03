import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 0; i < n; i++) {
            num = 1;
            for (int j = 0; j <= i; j++)
            {
                System.out.println(num++);

            }
            System.out.println("");
        }
    }
}

