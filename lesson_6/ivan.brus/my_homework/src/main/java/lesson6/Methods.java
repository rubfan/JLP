import java.util.Arrays;

public class Methods {


    void sequence1(){
        int x=1000;
        System.out.println(x);
        for(int i=1; i<3000; i++){
            x+=3;
            System.out.println(x);
        }
    }

    void sequence2(){
        int x=1;
        System.out.println(x);
        for(int i=0; i<54; i++){
            x+=2;
            System.out.println(x);
        }
    }

    void sequence3(){
        int x=90;
        System.out.println(x);
        while(x>0){
            System.out.println(x-=5);
        }
    }

    void sequence4(){
        int x=1;
        for(int i=0; i<20; i++){
            x*=2;
            System.out.println(x);
        }
    }

    void arraySum(int[] arr, int n){
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=arr[i];
        }
        System.out.println(Arrays.stream(arr1).sum());
    }

    void arrayMinMax(int[]arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }

    void arraySumUnEven(int[]arr){
        int even=0;
        int uneven=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                even+=arr[i];
            }else{
                uneven+=arr[i];
            }
        }
        System.out.println("сумма четных элементов = " + even + " сумма нечетных = " + uneven);
    }

    void luckyNumber(){
        int[] arr = new int[6];
        for(int i=100000; i<999999; i++){
            char[] charr = (i+"").toCharArray();
            for(int j=0; j<6; j++){
                arr[j] = Character.getNumericValue(charr[j]);
            }
            if(arr[0]+arr[1]+arr[2] == arr[3]+arr[4]+arr[5]) System.out.println(Arrays.toString(arr));
        }
    }

    void toBinary(int a){
        System.out.println(Integer.toBinaryString(a));
    }

    void fiveMin(int[] arr){
        Arrays.sort(arr);
        int[] min = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(min));

    }

     void addDigits(int a){
        int[] arr = new int[(a+"").length()];
        char[] charr = (a+"").toCharArray();
        for(int i=0; i < (a+"").length(); i++){
            arr[i] = Character.getNumericValue(charr[i]);
        }
        int sum = Arrays.stream(arr).sum();
        if((sum+"").length()>1){
            addDigits(sum);
        }else System.out.println(sum);
    }

}
