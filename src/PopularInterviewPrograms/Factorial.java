package PopularInterviewPrograms;

public class Factorial {
    public static void main(String[] args) {
        double fact = 10;
        double result = 1;
        for(int i=1; i<fact; i++)
        {
            result = result * i;
        }
        System.out.println("PopularInterviewPrograms.Factorial of number is "+result);
    }
}
