public class SumOfArrayWithMethod {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        System.out.println(sumOfArray(arr));
     //   System.out.println(averageOfArray(arr));
    }
    public static int sumOfArray(int[] arr1)
    {
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            sum = arr1[i]+sum;
        }
        return sum;
    }
    //public static int averageOfArray(int[] arr1)
    //{
    //   int avg = sumOfArray(arr1)/arr1.length);
    //    return avg;
   // }

}
