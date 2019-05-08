public class Task1 {
    public static void main(String[] args) {
//        1) Создайте программу, выводящую на экран все четырёхзначные
//        числа последовательности 1000 1003 1006 1009 1012 1015 ….
        int jump = 0;

        for (int i = 1000; i < 9999;i += 3 ){
            System.out.print(i + " ");

            jump++;
            // Переносить на новую строку каждые 30 значений
            if(jump % 30 == 0){
                System.out.println();
            }
        }
    }
}
