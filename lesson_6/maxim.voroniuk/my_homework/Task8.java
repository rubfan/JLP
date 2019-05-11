public class Task8 {
//    8) Найти все счастливые билеты от 100000 до 999999 :
//    билет счастливый если сумма первых трех цифр равна сумме трех
//    последних например, 123312: 1+2+3==3+1+2
    public static void main(String[] args) {
        int[] ticket = new int[6];
        int temp;
        int luckyTotal = 0;
        int sumFirst;
        int sumLast;

        for (int i = 100000; i <= 999999; i++){
            temp=i;

            //разбить число на цифры, поместить в массив
            for (int j = ticket.length - 1; j >= 0; j--){
                ticket[j] = temp % 10;
                temp /=10;
            }

            sumFirst = ticket[0] + ticket [1] + ticket [2];
            sumLast = ticket[3] + ticket [4] + ticket [5];

            // Вывод
            if(sumFirst == sumLast){
                System.out.print(i + "\t");

                //По 20 в ряд
                if (luckyTotal % 20 == 0){
                    System.out.println();
                }
                luckyTotal++;
            }
        }
        System.out.println("\nTotal lucky tickets: " + luckyTotal);
    }
}
