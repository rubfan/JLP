import java.util.*;

public class MyHomework {
    public static void main(String[] args) {


        //Массив из трёх случайных чисел
        Random rand = new Random();
        int[] varArr = new int[3];
        for (int i=0;i<varArr.length;i++){
            varArr[i]=rand.nextInt(100);
        }

        //1) Найти минимальное из 3х чисел
        System.out.printf("1)\n The minimum of three numbers %s is number %d\n",strVars(varArr),min(varArr));

        //2) Найти среди 3х чисел максимальное и минимальное
        System.out.printf("2)\n The minimum of three numbers %s is number %d, maximum is number %d\n",strVars(varArr),min(varArr),max(varArr));

        //3) Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
        varArr[0]=min(varArr);
        varArr[1]=min(varArr);
        System.out.printf("3)\n The minimum of three numbers %s are numbers: ",strVars(varArr));
        for (int i:varArr){
            if (i==min(varArr))
                System.out.printf(i+" ");
        }
        System.out.println();

        //4) Написать программу, которая проверит, является ли число четным или нечетным
        int a=rand.nextInt(100);
        if (a%2==0)
            System.out.printf("4)\n Number %d is even.\n",a);
        else
            System.out.printf("4)\n Number %d - uneven.\n",a);

        //5) Даны 2 числа, определить делится ли первое число на второе без остатка
        int b=rand.nextInt(9)+1; //делитель должен быть больше нуля
        if (a%b==0)
            System.out.printf("5)\n Number %d divided by %d without remainder \n",a,b);
        else
            System.out.printf("5)\n Number %d do not divided by %d without remainder\n",a,b);

        //6) Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
        if(Math.abs(10-a)<Math.abs(10-b))
            System.out.printf("6)\n Number %d closer to ten than %d\n",a,b);
        else if(Math.abs(10-a)==Math.abs(10-b))
            System.out.printf("6)\n Numbers %d  and %d - are equal.\n",a,b);
        else
            System.out.printf("6)\n Number %d closer to ten than %d\n",b,a);

        //7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней,
        //если известно, что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил
        //в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
        int days=rand.nextInt(10);
        int discount=0;
        int cost=40;
        if (days>7)
            discount=50;
        else if(days>5)
            discount=20;
        int pay=days*cost-discount;
        System.out.printf("7)\n The cost of rent for  %d days, with discount %d uah, will be %d uah\n",days,discount,pay);


    }
    private static int min(int varArr[]){
        int min=varArr[0];
        for (int i:varArr){
            if (i<min)
                min=i;
        }
        return min;
    }

    private static int max(int varArr[]){
        int max=varArr[0];
        for (int i:varArr){
            if (i>max)
                max=i;
        }
        return max;
    }

    // возвращает массив строку с содержимым массива
    private static String strVars(int varArr[]){
        String s="";
        for (int i:varArr){
            s=s+Integer.toString(i)+" ";
        }
        return s;
    }

}
