package PopularInterviewPrograms;

public class RightAngleTrianglePrintStar {
    public static void main(String[] args) {
        String s = "*";
        int n = 10;
        for(int i=1; i<=n ; i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(s);
            }
            System.out.println("");
        }

    }
}
