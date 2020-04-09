package ArraysPractice;

public class SumOfArray {
    public static void main(String[] args) {
       // int a[]= new int[]{1, 2, 3, 4, 4, 5, 4, 4, 5, 4};
        int a[]={1,2,3,5,7,9};
        int total=0;
        for (int i=0;i<a.length;i++)
        {
            total = total + a[i];
        }
        System.out.println("Sum of an array is - "+total);
    }
}
