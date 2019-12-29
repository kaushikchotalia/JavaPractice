public class ReverseElementsInArray {
    public static void main(String[] args) {
        int[] arr2 = {11,22,33,44,54,66,77,88,99};
        ReturnReverseArray(arr2);
    }
    public static void ReturnReverseArray(int arr1[])
    {
        for(int i=arr1.length-1; i>=0;i--)
            System.out.println(arr1[i]);
    }
}
