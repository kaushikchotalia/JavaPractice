package PopularInterviewPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 7;
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci Series of " +count+ " numbers: ");

        for(int i=1; i<=count; ++i)
        {
            System.out.println(num1+" ");

            int sumOfPreviousTwo = num1 + num2;

            num1 = num2;

            num2=sumOfPreviousTwo;
        }
    }
}
