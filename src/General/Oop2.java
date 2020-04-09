package General;

import General.Circle1;

public class Oop2 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(3.5);
        // General.Circle1 c1 = new General.Circle1();
        //c1.setRadius(3.5);
        System.out.println("Area of circle c :"+ c1.area());
        System.out.println("Area of circle c :"+ c1.circumference());
    }
}
