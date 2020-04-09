package ArraysPractice;

public class FindLargestNumberFromAnArray {
    public static void main(String[] args) {
        int a[] = new int[]{500, 10, 5, 40, 50, 99, 70, 80, 90, 10001};
        int max = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("Largest number from an array is - " +max);
    }
}
