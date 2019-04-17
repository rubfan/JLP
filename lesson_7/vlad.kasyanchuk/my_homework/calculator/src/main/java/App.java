import java.util.Scanner;

public class App {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Добавление" + Calc.add(a,b));
        System.out.println("Вычитание" + Calc.sub(a,b));
        System.out.println("Умножение" + Calc.div(a,b));
        System.out.println("Деление" + Calc.mil(a,b));
    }
}
