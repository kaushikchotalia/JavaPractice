public class Oops1 {
    public static void main(String[] arg) {
        Circle c = new Circle();
        c.r = 3.5;
        System.out.println("Area of circle c :"+ c.area());
        System.out.println("Area of circle c :"+ c.circumference());
    }

    private static class Circle {

        double x,y;
        double r;
        double circumference( )
        {
            return 2 * 3.14* r ;
        }
        double area()
        {
            return  3.14* r * r;
        }
    }
}
