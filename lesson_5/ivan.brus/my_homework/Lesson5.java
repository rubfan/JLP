import static java.lang.Integer.parseInt;

public class Lesson5 {

    public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//        System.out.println("введите операцию");
//        String operand = scn.nextLine();
//        System.out.println("введите первое число");
//        int a = scn.nextInt();
//        System.out.println("введите второе число");
//        int b = scn.nextInt();

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
