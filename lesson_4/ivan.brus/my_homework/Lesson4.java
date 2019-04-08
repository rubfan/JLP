import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Lesson4 {

    static int a;
    static int b;
    static int c;

    public static void main(String[] args) throws Exception{

        Lesson4 ls = new Lesson4();

        /* проверяем содержит ли строка слово "days", если да - вызываем метод для подсчета стоимости аренды. чтобы вызвать
        его сканер должен получить что-то типа "6 days". парсим строку и вытаскиваем из неё int для передачи методу
        apartmentsRent. Если ввод не содержит слово "days" - проверяем сколько было введено значений чтобы передать их
        методу unEven с одним аргументом для проверки на четность, unEven с двумя аргументами для проверки на
        делимость и близость к 10 или valueMinMax с тремя аргументами.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        if(str1.contains("days")){
            int rentDays = parseInt(str1.replaceAll(" days" , ""));
            ls.apartmentsRent(rentDays);
            return;
        }else{
             a = parseInt(str1);
        }

        // тут вы наверное зададитесь вопросом:"чувак! зачем ты считываешь string ведь вторым вводом у тебя точно должен быть int!"
        // но если инициализировать переменную как Integer и проверить пустой ввод на null - метод в блоке if не вызывается...
        // хз почему.

        String str2 = br.readLine();
        if (str2.equals("")) {
            ls.unEven(a);
        }else{
             b = parseInt(str2);
        }

        String str3 = br.readLine();
        if (str3.equals("")){
            ls.unEven(a,b);
        }else{
            c = parseInt(str3);
            ls.valueMinMax(a,b,c);
        }

    }


    void valueMinMax(int a, int b, int c) {
        int min;
        if(a==b && b==c) {
            System.out.println("значения равны");
        }else if(a==b || b==c || a==c){
            if(a==b){
                if(a < c){
                    System.out.println("минимальное значени " + a + "в количестве 2 штуки");
                    System.out.println(c + "максимальное значение");
                }else{
                    System.out.println(a + " максимальное значение в количестве 2 штуки");
                    System.out.println(c + " минимальное значение");
                }
            }else if(b==c){
                if(b < a){
                    System.out.println("минимальное значени " + b + "в количестве 2 штуки");
                    System.out.println(a + "максимальное значение");
                }else{
                    System.out.println(b + " максимальное значение в количестве 2 штуки");
                    System.out.println(a + " минимальное значение");
                }
            }else{
                if(c < b){
                    System.out.println("минимальное значени " + c + "в количестве 2 штуки");
                    System.out.println(b + "максимальное значение");
                }else{
                    System.out.println(c + " максимальное значение в количестве 2 штуки");
                    System.out.println(b + " минимальное значение");
                }
            }
        }else{
            if(a<b && a<c){
                System.out.println("минимальное значение " + a);
            }else if(b<c && b<a){
                System.out.println("минимальное значение " + b);
            }else{
                System.out.println("минимальное значение " + c);
            }
        }
    }

    void unEven(int a){
        if(a % 2 == 0){
            System.out.println("число " + a + " четное");
        }else{
            System.out.println("число " + a + " нечетное");
        }
    }

    void unEven(int a, int b){
        if(a % b == 0){
            System.out.println("числа делятся нацело");
        }else{
            System.out.println("числа не делятся нацело");
        }

        if(Math.abs(a-10) > Math.abs(b-10)){
            System.out.println(b + " ближе к 10");
        }else{
            System.out.println(a + " ближе к 10");
        }
    }

    void apartmentsRent(int rentDays){
        int cost;
        if(rentDays > 7){
            cost = (40 * rentDays) - 50;
        }else if(rentDays > 5){
            cost = (40 * rentDays) - 20;
        }else{
            cost= 40 * rentDays;
        }

        System.out.println("стоимость проживания составит " + cost);
    }
}