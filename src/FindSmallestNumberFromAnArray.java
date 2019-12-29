public class FindSmallestNumberFromAnArray {
    public static void main(String[] args) {
        int a[] = new int[]{50,60,5,90,500,3};
        int min = a[0];
        for (int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("Smallest Number Of an Array is -> "+min);
    }
}
/* With Method
public static void minElementInAttay(int arr[])
    {
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr1[] = {11,90,50,60,10,45};
        minElementInAttay(arr1);
    }*/
