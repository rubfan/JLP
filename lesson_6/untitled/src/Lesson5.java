import static java.lang.Integer.parseInt;

public class Lesson5 {

    public static void main(String[] args) {

        System.out.println("введите операцию");
        String operand = args[0];
        int a = parseInt(args[1]);
        int b = parseInt(args[2]);

        switch(operand){
            case "+" : System.out.println(a+b);
            case "-" : System.out.println(a-b);
            case "*" : System.out.println(a*b);
            case "/" : System.out.println(a/b);
            case "%" : System.out.println(a%b);
            case "addition" : System.out.println(Math.abs(a-b));
            case "tips" : System.out.println(new Lesson5().tips(a,b));
        }

    }

    double tips(int checkAmount, int service){
        double tips = checkAmount + checkAmount*service*0.01;
        return tips;
    }
}
