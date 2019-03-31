import java.util.Scanner;

public class Spiral {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[][] spiral = new int[size][size];
        int i = 1, j, k, p = size / 2;
        for(k = 1; k <= p; k++)/*Цикл по номеру витка*/
        {
            for (j = k - 1; j < size - k + 1; j++)
                spiral[k - 1][j] = i++;
            for (j = k; j < size - k + 1; j++)
                spiral[j][size - k] = i++;
            for (j = size - k - 1;j >= k - 1; --j)
                spiral[size - k][j] = i++;
            for (j = size - k - 1;j >= k; j--) spiral[j][k - 1] = i++;
        }
        if (size % 2 == 1)
            spiral[p][p] = size * size;
        for(i = 0; i < size; i++)
            for(j = 0; j < size; j++)
            {
                System.out.format("%d\t", spiral[i][j]);
                if(j == size - 1)
                    System.out.println();
            }
    }
}
