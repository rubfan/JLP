public class App {
    public static void main(String[] args) {
    Calc calc = new Calc();

    double b=(double )calc.add(5,5);
        System.out.println(b);
        System.out.println(calc.add(5,6));
        System.out.println(calc.sub(5,6));
        System.out.println(calc.mil(5,6));
        System.out.println(calc.div(5,3));
    }
}
