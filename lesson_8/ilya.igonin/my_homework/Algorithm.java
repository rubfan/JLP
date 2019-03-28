public class Algorithm {
    public static void main(String[] args) {
        int k = 0;
        int n = 10;
        long time = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    k++;
                }
            }
        }
        time = System.nanoTime()-time;
        System.out.println("The result is " + k);
        System.out.println(time + "ns");
    }
}