import java.util.Scanner;

class Abbreviator {

    private String words;
    private  String oneWord;

    private Abbreviator(String oneWord){
            this.oneWord = oneWord;
    }

    public Abbreviator(){
        Scanner scan = new Scanner(System.in);
        this.words = scan.nextLine();
        System.out.println(this.split());
    }


    public String split(){
        String[] arrOfStr = this.words.split(" ");
        String resultString = "";
        for(String a: arrOfStr){
           resultString += new Abbreviator(a).abbreviate();
        }
        return resultString;
    }

    private String abbreviate(){
        String resultString = "";
        char[] arrChar = this.oneWord.toCharArray();
        if(arrChar.length > 4) {
                resultString += arrChar[0] + String.valueOf(arrChar.length - 2) + arrChar[arrChar.length - 1] + " ";
            }else resultString += this.oneWord;
        return resultString;
    }
}
