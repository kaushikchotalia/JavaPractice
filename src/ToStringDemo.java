public class ToStringDemo {
    int rollno;
    String name;
    String city;

    ToStringDemo(int rollno, String name, String city)
    {
        this.rollno=rollno;
        this.city=city;
        this.name=city;
    }

    public static void main(String[] args) {
        ToStringDemo s1 = new ToStringDemo(1,"KC","Brampton");
        s1.toString();
        System.out.println(s1);
    }
}
