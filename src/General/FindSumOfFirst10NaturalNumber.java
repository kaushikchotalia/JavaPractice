package General;

public class FindSumOfFirst10NaturalNumber {
    public static void main(String[] args) {
        int num =10;
        int count=0;
        int total=0;

        for(int i=0; i<=num; i++)
        {
            total = total + count;
            count++;
        }
        System.out.println("The sum of first 10 natural number is -> "+total);
    }
}
