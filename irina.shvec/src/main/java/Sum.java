import java.util.Scanner;
/*Написать программу, которая получает 2 числа из командной строки как параметры,и выводит
 результат суммы этих чисел. Программу нужно запаковать в jar и запустить из командной строки.*/

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter two digits which sum do you need: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println("The sum is: " + (firstNum+secondNum));
    }
}
