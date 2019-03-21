package sorts;
/*Определите сложность следующего алгоритма*/
public class Algorithm {
    public static void main(String[] args) {
        int k = 0;// 1 operation
        int n = 10;// 1 operation
        for (int i = 0; i < n; i++) { // 9 operations
            for (int j = i + 1; j < n; j++) { // 8 operations
                for (int z = j + 1; z < n; z++) { // 7 operations
                    k++; // 7*8*9 = 504 operations
                }
            }
        }
        System.out.println("The result is " + k);// 1 operation
    }
// there are 507 operations in the algorithm
}

