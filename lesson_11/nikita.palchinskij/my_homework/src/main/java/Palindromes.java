import java.util.Scanner;

public class Palindromes {
    public static String[] toStringArray(String sentence)
    {
        String[] words = sentence.split(",");
        for (int i = 0; i < words.length; i++)
        {
            words[i] = words[i].trim();
        }
        return words;
    }
    public static String reverse(String word)
    {
        String reversed = "";
        for(int i = word.length() - 1; i >= 0; i--)
        {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }
    public static void main(String args[])
    {
        String string;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words: ");
        string = sc.nextLine();
        String[] strings = toStringArray(string);
        for(int i = 0; i < strings.length; i++)
        {
            if(strings[i].equals(reverse(strings[i])))
                count++;
        }
        System.out.println("There are " + count + " palindromes in the text");
    }
}
