import java.util.Random;

public class Task9 {

    //9) Перевести число в двоичную систему счисления

    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(Integer.MAX_VALUE);
        int pow = 2;
        String binary="";

        int i = num;
        while (i > 0){
            if (i % pow > 1){
                pow *= 2;
            }
            else{
                binary = (i % pow) + binary;
                i /= 2;
                pow = 2;
            }
        }
        System.out.println("Integer :\t" + num);
        System.out.println("Binary :\t" + binary);
        System.out.println("Control :\t" + Integer.toBinaryString(num));
    }
}
