import java.util.Scanner;

public class GuessingGameCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice=-1;
        while(choice!=0)
        {
            System.out.println("________________________________");
            System.out.println("------------MENU----------------");
            System.out.println("________________________________");
            System.out.println("Please Key in 1 for Sum");
            System.out.println("Please Key in 2 for Subtraction");
            System.out.println("Please Key in 3 for Multiplication");
            System.out.println("Please key in 4 for Division");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Please enter first number");
                    int num1 = scanner.nextInt();
                    System.out.println("Please enter second number");
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Sum of First number and second number is-->"+sum);
                    break;
                case 2:
                    System.out.println("Please enter first number");
                    int num3 = scanner.nextInt();
                    System.out.println("Please enter second number");
                    int num4 = scanner.nextInt();
                    int sub = num3 - num4;
                    System.out.println("Subtraction of First number and second number is-->"+sub);
                    break;
                case 3:
                    System.out.println("Please enter first number");
                    int num5 = scanner.nextInt();
                    System.out.println("Please enter second number");
                    int num6 = scanner.nextInt();
                    int mul = num5 * num6;
                    System.out.println("Multiplication of First number and second number is-->"+mul);
                    break;
                case 4:
                    System.out.println("Please enter first number");
                    int num7 = scanner.nextInt();
                    System.out.println("Please enter second number");
                    int num8 = scanner.nextInt();
                    int div = num7 / num8;
                    System.out.println("Division of First number and second number is-->"+div);
                    break;
                default:
                    System.out.println("Key In Choice Invalid");
            }
        }
    }
}
