public class StaticAndNonStatic {
    static int i = 100;
    static String s = "Beginnersbook";
    //Static method
    static void display()
    {
        System.out.println("i:"+i);
        System.out.println("i:"+s);
    }
    //non-static method
    void funcn()
    {
        //Static method called in non-static method
        //display();
        System.out.println("i:"+i);
        System.out.println("i:"+s);
    }
    //static method
    public static void main(String args[])
    {
        StaticAndNonStatic obj = new StaticAndNonStatic();
        //You need to have object to call this non-static method
        obj.funcn();
        //Static method called in another static method
        display();
    }

}
