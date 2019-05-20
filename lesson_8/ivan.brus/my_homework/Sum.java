public class Sum {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] arr = new int[10];
        int randomValue = rnd.nextInt(10);
        System.out.println(randomValue);

        for(int i=0; i < arr.length; i++){
            arr[i] = rnd.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        label1:
        {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == randomValue) {
                        System.out.println(true);
                        break label1;
                    }
                }
            }
        }

    }

}
