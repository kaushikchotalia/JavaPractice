public class CountCharacter {
    //Task - Count number of 'A' in the given string

    public static void main(String[] args) {
        String s = "ASCII stands for American Standard Code for Information Interchange. Computers can only understand numbers, so an ASCII code is the numerical representation of a character such as 'a' or '@' or an action of some sort. ASCII was developed a long time ago and now the non-printing characters are rarely used for their original purpose. Below is the ASCII character table and this includes descriptions of the first 32 non-printing characters. ASCII was actually designed for use with teletypes and so the descriptions are somewhat obscure. If someone says they want your CV however in ASCII format, all this means is they want 'plain' text with no formatting such as tabs, bold or underscoring - the raw format that any computer can understand. This is usually so they can easily import the file into their own applications without issues. Notepad.exe creates ASCII text, or in MS Word you can save a file as 'text only'";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            count++;
        }
        System.out.println("Count of A character in given string is "+count);
    }
}
