public class Calc {

    public static long add(int arg1, int arg2){
        long addition = arg1 + arg2;
        return addition;
    }
    public static long sub(int arg1, int arg2){
        long subtraction = arg1 - arg2;
        return subtraction;
    }
    public static long div(int arg1, int arg2){
        long division = ((long) (double) arg1 / arg2);
        return division;
    }
    public static long mul(int arg1, int arg2){
        long multiplication = arg1 * arg2;
        return multiplication;
    }
}
