package ArraysPractice;

public class FindDuplicateFromArray {
    public static void main(String[] args) {

      //If same value is given an array more than two time then array is printed 3 times.
        // Find a solution that even though more than two times same element is there in an array, still the output should print only once for the duplicate element.


        int a[] = {5,2,5,3,4,7,5,3,7,9,9,8,9};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Duplicate Element - "+a[i]);
                }
            }
        }
    }
}
