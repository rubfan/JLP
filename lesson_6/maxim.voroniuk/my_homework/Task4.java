public class Task4 {
    public static void main(String[] args) {
//        4) Создайте программу, выводящую на экран первые 20 элементов
//        последовательности 2 4 8 16 32 64 128 ….
        int num = 2;
        for (int i = 0; i < 20; i++){
            System.out.print(num + " ");
            num *= 2;
        }
    }
}
