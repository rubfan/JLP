public class Ex1 {
    public static void main(String[] args) {
        int[] a = {34, 25, 15, 67, 89, 101};
        int min = a[0];
        long time = System.nanoTime();

        for(int i = 0; i < a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        time = System.nanoTime() - time;
        System.out.println(min);
        System.out.println(time + "ns");
    }
}
