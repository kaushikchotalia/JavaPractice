package PopularInterviewPrograms;

public class RightAngleTriangle {
    public static void main(String[] args) {
        int n = 10;
        //not printing in triangle manner
        for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

