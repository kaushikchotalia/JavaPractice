public class ReverseString {
    public static void main(String[] args)
    {
    String s2 = "JavaWorld";
        System.out.println(Reverse(s2));
        /*//Reverse String thriugh StringBuffer
        StringBuffer sb = new StringBuffer("KC");
        sb.reverse();
        System.out.println(sb);*/
    }

    public static String Reverse(String InputString)
    {
        String ReverseString = "";
        for(int i=InputString.length()-1;i>=0;i--)
        {
            ReverseString = ReverseString + InputString.charAt(i);
        }
        return ReverseString;
    }
}
