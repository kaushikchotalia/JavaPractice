public class CountVoWelsInString {
    public static void main(String[] args) {
        String str1= "Hello how are you?";
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)=='a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'|| str1.charAt(i)== 'u')
            {
                count++;
            }
        }
        System.out.println("Number of Vowels in given String is - "+count);
    }
}
