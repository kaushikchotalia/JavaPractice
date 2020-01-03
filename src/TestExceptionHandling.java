public class TestExceptionHandling {
    public static void main(String[] args) {
        try
        {
            int i = 5;
            int k = 0;
            int j = i / k;
            System.out.println( "result" + j);
        }
        catch (Exception e)
        {
            System.out.println("Exception occured while division");
        }
        System.out.println("Exception handled if any and Flow continues");
        System.out.println("Next Statement...");

    }
}
