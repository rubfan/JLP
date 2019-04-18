package palindrome;

public class Palindrome {
    char[] arr;
    String[] arrayOfString;

    public int   numberOfPalindromes(String text) {
        int amount =0;
        arrayOfString=text.split(",");
        for (String el: arrayOfString) {
           if(isPalindrome(el.trim())){
               amount++;
           }
        }
        return amount;
    }



    private boolean isPalindrome(String word){
        int end=1;
        arr = word.toCharArray();
        for(int i=0; i<arr.length;){
            if((arr[i] == arr[arr.length-end])){
                i++; end++;}
            else {
                return false;
            }
        }
        end=1;
        return  true;
    }
}
