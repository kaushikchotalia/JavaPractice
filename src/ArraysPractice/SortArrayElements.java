package ArraysPractice;

public class SortArrayElements {
    public static void ReturnSortedElementsOfArray(int arr1[])
    {
        System.out.println("Elements of Original Array is: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        int temp=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    temp=arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println("Elements of Sorted Array is: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }

    public static void main(String[] args) {
        //Sort an array through Arrays.sort method.
        /*int arr3[] = {11,20,50,80,5,90};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));*/
        int arr2[] = {5,9,50,4,999,555};
        ReturnSortedElementsOfArray(arr2);

    }
}
