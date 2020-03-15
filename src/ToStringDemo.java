public class ToStringDemo {
    int rollno;
    String name;
    String city;

    ToStringDemo(int rollno, String name, String city)
    {
        this.rollno=rollno;
        this.city=city;
        this.name=name;
    }

    public static void main(String[] args) {
        ToStringDemo s1 = new ToStringDemo(1,"KC","Brampton");
        String s2 = s1.toString();
        System.out.println(s2);
    }
}
