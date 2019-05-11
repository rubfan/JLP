public class TwoDigits {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 12};
        int sum = 20;
        boolean b = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == sum) {
                b = true;
                System.out.println("{" + arr[i] + "," + arr[i + 1] + "}");
            }
        }
        System.out.println(b);
    }
}
