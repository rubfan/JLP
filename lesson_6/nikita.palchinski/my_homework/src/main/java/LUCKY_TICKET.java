public class LUCKY_TICKET {
    public static void main(String[] args) {
        int frst = 100000;
        int lst = 999999;
        for(int o = frst; o < lst; o++)
        {
            if(luckiness(o))
                System.out.println(o);
        }
        //luckiness(123565);
    }
    public static boolean luckiness(int a){
        int fn = a / 100000; //1
        int sn = a / 10000 - 10 * fn; //2
        int tn = a / 1000 - 10 * sn - 100 * fn; //3
        int ssn = a % 10; //6
        int ffn = (a % 100 - ssn) / 10; //5
        int frn = (a % 1000 - 10 * ffn - ssn) / 100; //4

        //System.out.format("%s %s %s %s %s %s\n", fn, sn, tn, frn, ffn, ssn);

        if(fn + sn + tn == frn + ffn + ssn)
            return true;
        else
            return false;

    }
}
