public class HappyTicket {

     private boolean bool;

    public void findHappyTicket(){

        int summa1 = 0, summa2=0;
        for(int number=100000;number<999999; number++ ){
                int num1 = number / 100000;
                int num2 = (number / 10000) % 10;
                int num3 = (number / 1000) % 10;
                int num4 = (number / 100) % 10;
                int num5 = (number / 10) % 10;
                int num6 = number % 10;
             summa1=num1+num2+num3;
             summa2=num4 + num5 + num6;
               if(defineLuckyTicket(summa1, summa2)){
                   System.out.println(number);
               };
            }

        }

        public boolean defineLuckyTicket(int sum1, int sum2){
        if(sum1==sum2){
         bool=true;}

        return  bool;
        }
    }

