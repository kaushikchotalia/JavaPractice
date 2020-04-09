package StringsPractice;

public class StringGetBytesExample {
    public static void main(String[] args) {
        String s1="abcd";
        byte[] b = s1.getBytes();
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        String s2 = new String(b);
        System.out.println(s2);
    }
}
