public class Palindrome {

    private String words;

    public Palindrome(String words){
        this.words = words;
    }

    public String findPalindrome(){
        int counter = 0;
        String[] strArr = this.words.split(",");

        for(String a: strArr){
            if(a.trim().equals(new StringBuffer(a).reverse().toString().trim())){
                counter++;
            }
        } return "There is " + counter + " palindromes";
    }
}
