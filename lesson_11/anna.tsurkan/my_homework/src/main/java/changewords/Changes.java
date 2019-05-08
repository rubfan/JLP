package changewords;

import java.util.Arrays;

public class Changes {


    String newEmail1;
    String newEmail2;
    char[] array;
    String[] arr;

    protected String changeEmail(String email){
            newEmail1= email.replace("@", "[at]");
            newEmail2= newEmail1.replace(".", "[dot]");
            return  newEmail2;
        }

     protected String cutWord(String word){
         if (word.length() >= 4) {
             char[] arr = word.toCharArray();
             return " " + arr[0] +  (arr.length-2) + arr[arr.length-1];
         } else
             return word;
     }
     public String cutEveryWordFromString(String string){
        arr = string.split(" ");
         for(int i=0; i<arr.length; i++){
             arr[i] = cutWord(arr[i]);
         }
         return Arrays.toString(arr);
     }
}






