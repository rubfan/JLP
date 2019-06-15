import java.util.Scanner;

public class WordCutter {
    public static void main(String args[])
    {
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");
        word = sc.nextLine();
        int size = word.length();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(size - 1);
        String newWord = firstLetter + String.valueOf(size - 2) + lastLetter;
        System.out.println("Your word in \"programmers' slang\": ");
        System.out.println(newWord);
        System.out.println(":)");
    }
}

