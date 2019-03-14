import java.util.Scanner;

public class Tips {
    private static int sum = 100;
    private static double tips = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose the level of service: \n 1 - terrible\n 2 - poor\n 3 - good\n 4 - great\n 5 - excellent\n");
        int level = scanner.nextInt();
        getServiceLevel(level);
        System.out.println("You have to pay: "+ tips + " grn. Have a nice day!");

    }

    public static void getServiceLevel(int level) {
        switch (level){
            case 1:
                tips = sum;
                break;
            case 2:
                tips = sum + (sum * 0.05);
                break;
            case 3:
                tips = sum + (sum * 0.10);
                break;
            case 4:
                tips = sum + (sum * 0.15);
                break;
            case 5:
                tips = sum + (sum * 0.20);
                break;
                default:
                    System.out.println("You chose incorrect level of service");
        }
    }
}
