import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Sequence {
   private  Scanner scanner = new Scanner(System.in);

   public  void show4NumberSequence() {
       System.out.println("Enter stop number:");
       int stopNumber = scanner.nextInt();
        for(int i=1000; i<stopNumber; i +=3) {
            System.out.print(i + " ");

        }}

     public void showUnpairSequence() {
           int count = 0, number = 1;
           while (count <= 54) {
               System.out.println(number + " ");
               number += 2;
               count++;
           } }

     public  void showPositiveSequence() {
        int number =90;
        while(number<=90 && number >=0){
            System.out.println(number);
            number-=5;
        }
    }

       public  void showPowSequence() {
           int count = 20;
           double number = 2;
           for (int i = 1; count > 0; i++) {
               System.out.println(Math.pow(number, i));
               count--;

           }

        }




}
