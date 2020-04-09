package ArraysPractice;

public class CountEvenNumberInArray {
    public static void main(String[] args) {

        int a[] = new int[]{3, 2, 1, 8, 4, 7};
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            if((a[i]%2)==0)
            {
                count++;
            }
        }
        System.out.println("Total number of Even numbers in given array is - "+count);

    }
}
