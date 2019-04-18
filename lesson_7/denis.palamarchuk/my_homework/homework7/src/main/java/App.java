public class App {
    public static void main(String[] args) {

        Calc calc=new Calc();
        System.out.println(calc.add(5,3));
        System.out.println(calc.sub(5,3));
        System.out.println(calc.div(5,3));
        System.out.println(calc.mul(5,3));
    }
}
class Calc{
    public long add(int a, int b){

        return a+b;
    }
    public long sub(int a, int b) {

        return a-b;
    }
    public long div(int a, int b){

        return a/b;
    }
    public long mul(int a, int b){

        return a*b;
    }
}