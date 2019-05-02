import java.util.*;

public class ARRAYS {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++CYCLES+++++++++++++++");
        System.out.println("++++++++++++++++++1++++++++++++++++++");
        int start = 1000;
        while(start < 10000){
            System.out.format("%s ", start);
            start += 3;
        }
        System.out.println("\n++++++++++++++++++2++++++++++++++++++");
        start = 1;
        int count = 1;
        while(count < 56)
        {
            System.out.print(start + " ");
            start += 2;
            count++;
        }
        System.out.println("\n++++++++++++++++++3++++++++++++++++++");
        start = 90;
        while(start >= 0)
        {
            System.out.print(start + " ");
            start -= 5;
        }
        System.out.println("\n++++++++++++++++++4++++++++++++++++++");
        start = 2;
        count = 1;
        while(count < 21)
        {
            System.out.print(start + " ");
            start *= 2;
            count++;
        }
        System.out.println("\n++++++++++++++++ARRAYS+++++++++++++++");
        System.out.println("++++++++++++++++++5++++++++++++++++++");
        Scanner kent = new Scanner(System.in);
        System.out.print("Enter the size: \n");
        int size = kent.nextInt();
        int homework[] = new int[size];
        int i = 0, sum = 0;
        for (;i < size;)
        {
            System.out.print("Enter " + (i+1) +"th element: \n");
            homework[i] = kent.nextInt();
            i++;
        }
        System.out.println("Enter size of elements you wanna sum up: ");
        int n = kent.nextInt();
        for (i = 0; i < n; i++)
        {
            sum += homework[i];
        }
        System.out.print("Sum of " + n +" elements is: " + sum);
        System.out.println("\n++++++++++++++++++6++++++++++++++++++");
        int max = homework[0];
        int min = homework[0];
        for(i = 0; i < size; i++)
        {
            if(homework[i] > max)
                max = homework[i];
            if(homework[i] < min)
                min = homework[i];
        }
        System.out.println("Maximum is: " + max);
        System.out.print("Minimum is: " + min);
        System.out.println("\n++++++++++++++++++7++++++++++++++++++");
        int sumofodd = 0, sumofeven = 0;
        for (i = 0; i < size; i++)//odd
        {
            if(i % 2 == 0)//due to the fact that the first element has a zero number
                sumofodd += homework[i];
        }
        for (i = 0; i < size; i++)//even
        {
            if(i % 2 == 1)
            sumofeven += homework[i];
        }
        System.out.print("Sum of odd elements is: " + sumofodd + "\nSum of even elements is: " + sumofeven);
        System.out.println("\n++++++++++++++++++10++++++++++++++++++");
            for(i = homework.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){

                    if( homework[j] > homework[j+1] ){
                    int tmp = homework[j];
                    homework[j] = homework[j+1];
                    homework[j+1] = tmp;
                    }
                }
            }
            System.out.print("The first five minimums are: ");
            for(int o = 0; o < 5; o++)
            {
                System.out.print(homework[o] + " ");
            }
    }
}
