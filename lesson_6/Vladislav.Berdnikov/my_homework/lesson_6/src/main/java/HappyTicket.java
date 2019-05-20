public class HappyTicket {

    public static void main(String[] args){

        int sum1, sum2;

        for(int i=100000;i<999999; i++ ){
            int num1 = i / 100000;
            int num2 = (i / 10000) % 10;
            int num3 = (i / 1000) % 10;
            int num4 = (i / 100) % 10;
            int num5 = (i / 10) % 10;
            int num6 = i % 10;

            sum1 = num1 + num2 + num3;
            sum2 = num4 + num5 + num6;

            if(luckyTicket(sum1, sum2)){
                System.out.println(i);
            }
        }

    }

    public static boolean luckyTicket(int sum1, int sum2){

        boolean bool = false;

        if(sum1 == sum2){
            bool = true;}

        return  bool;
    }
}