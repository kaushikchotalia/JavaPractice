package PopularInterviewPrograms;

public class FactorialUsingMethod {
    public static void main(String[] args) {
        double fact = factorial(10);
        System.out.println(fact);
    }
    public  static double factorial(double number)
    {
        double result=1;
        for (double i = 1; i <= number; i++) {
            result = result * i;

        }
        return result;
    }
}
