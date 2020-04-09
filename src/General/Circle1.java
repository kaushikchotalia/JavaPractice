package General;

public class Circle1 {
    private double x,y;
    private double r;
    double circumference()
    {
        return 2 * 3.14* r ;
    }
    double area()
    {
        return  3.14* r * r;
    }

    /*// set r with this
    public void setRadius(double r)
    {
        this.r = r;
    }*/
    /*//declare argument name different for setter method
    public void setRadius(double p)
    {
        r = p;
    }*/

    public Circle1(double r) {
        this.r = r;
    }
}
