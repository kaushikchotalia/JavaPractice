package StringsPractice;

public class CharAtExample1 {
    public static void main(String[] args) {
        String s= "Welcome to Java World";
        for(int i=0;i<s.length();i++)
        {
            System.out.println("Char at "+i+"index is "+s.charAt(i));
        }
        System.out.println("-----------------------------------------");
        for (int i=0;i<s.length();i++)
        {
            if(i%2==0) {
                System.out.println("Char at Even Place is "+i+"index is "+s.charAt(i));
            }
        }
        System.out.println("-----------------------------------------");
        for (int i=0;i<s.length();i++)
        {
            if(i%2!=0)
                System.out.println("Char at Odd Place is "+i+"index is "+s.charAt(i));
        }
    }
}
