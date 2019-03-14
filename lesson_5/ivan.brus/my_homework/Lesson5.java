import static java.lang.Integer.parseInt;

public class Lesson5 {

    public static void main(String[] args) {

        System.out.println("введите операцию");
    String operand = args[0];
    int a = parseInt(args[1]);
    int b = parseInt(args[2]);

    if(operand.equals("+")){
        System.out.println(a+b);
    }else if(operand.equals("-")){
        System.out.println(a-b);
    }else if(operand.equals("*")){
        System.out.println(a*b);
    }else if(operand.equals("/")){
        System.out.println(a/b);
    }else if(operand.equals("%")){
        System.out.println(a%b);
    }else if(operand.equals("addition")){
        System.out.println(Math.abs(a-b));
    }else if(operand.equals("tips")){
        double tips = new Lesson5().tips(a,b);
        System.out.println(tips);
    }

    }

    double tips(int checkAmount, int service){
        double tips = checkAmount + checkAmount*service*0.01;
        return tips;
    }
}
