public class Algorithm {
    public static void main(String[] args) {
        int k = 0;
        int n = 10;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    k++;
                }
            }
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Program spent " + timeSpent + " mss");
        System.out.println("The result is " + k);
    }
}
