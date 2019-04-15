public class Sum {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("The program must take 2 integer arguments");
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d\n",a,b,a+b);
    }
}
