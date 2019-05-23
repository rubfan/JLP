public class Palindrom {

    private String[] words;

    public int amountOfPalindromes(String s) {
        words = s.split(",");
        int amount = 0;
        for (int i = 0; i < words.length; i++) {
            if (checkForPalindrom(words[i].trim())) {
                amount++;
            }
        }
        return amount;
    }

    private boolean checkForPalindrom(String x) {
        char[] array = x.toCharArray();
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - j]) {
                j++;
                } else {
                return false;
            }
        }
        j = 1;
        return true;
    }
}
