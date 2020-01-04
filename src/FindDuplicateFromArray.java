public class FindDuplicateFromArray {
    public static void main(String[] args) {
        int a[] = {5,2,5,3,4,7,3};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && (i!=j))
                {
                    System.out.println("Duplicate Element - "+a[j]);
                }
            }
        }
    }
}
