public class FromDecimalToBinary {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(Convert10to2(number, ""));

    }

    static String Convert10to2(int num, String res) {
        if (num < 2) {
            if (num == 0)
                res = res + "0";
            else
                res = res + "1";
            String res2 = "";
            for (int i = res.length() - 1; i >= 0; i--)
                res2 += res.charAt(i);
            return res2;
        } else {
            if (num % 2 == 0)
                res = res + "0";
            else
                res = res + "1";
            return Convert10to2(num / 2,res);
        }
    }
}
