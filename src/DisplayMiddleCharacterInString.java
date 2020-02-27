import org.jetbrains.annotations.NotNull;

public class DisplayMiddleCharacterInString {
    public static void main(String[] args) {
    findMiddleCharacter("Hello1");
    }

    public static String findMiddleCharacter(String str)
    {
        int position;
        int length;
        if(str.length() %2 == 0)
        {
            position = str.length()/2 - 1;
            length = 2;
        }
        else
        {
            position = str.length()/2;
            length =1;
        }
        String str1 = str.substring(position,position+length);
        System.out.println(str1);
        return str1;

    }
}
