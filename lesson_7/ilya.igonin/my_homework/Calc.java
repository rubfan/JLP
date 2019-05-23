public class Calc {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println(sum(n1, n2));
    }
    private static int sum(int n1, int n2){
        return n1 + n2;
    }
}
