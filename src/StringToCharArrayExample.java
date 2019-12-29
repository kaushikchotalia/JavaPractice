public class StringToCharArrayExample {
    public static void main(String[] args) {
        String str = "Welcome to Java World";
        char[] ch = str.toCharArray();

        int lengthOfCh = ch.length;

        for(int i=0; i<lengthOfCh; i++)
        {
            System.out.println(ch[i]);
        }
        System.out.println(ch);
    }
}
