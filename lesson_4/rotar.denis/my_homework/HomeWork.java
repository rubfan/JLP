import java.util.Scanner;

public class HomeWork {
	public static void main (String[] args) {
		int NumTask;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number of Task from 1 to 7:");
			NumTask = in.nextInt();
		switch (NumTask) {
			case 1:	Task_1 ();
				break;
			case 2:	Task_2 ();
				break;
			case 3:	Task_3 ();
				break;
			case 4:	Task_4 ();
				break;
			case 5:	Task_5 ();
				break;
			case 6:	Task_6 ();
				break;
			case 7:	Task_7 ();
				break;
			default: System.out.println("From 1 to 7");
				break;
		}
	}
	private static void Task_1 () {
		int num1, num2, num3;
		System.out.println("");
		System.out.println("Task 1");
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the first number: ");
			num1 = in.nextInt();
		System.out.print("Enter the second number: ");
			num2 = in.nextInt();
		System.out.print("Enter the third number: ");
			num3 = in.nextInt();
		if (num1 == num2 && num2 == num3)
			System.out.println("All numbers are equal among them there is no minimum");
		else if (num1 <= num2 && num1 <= num3)
			System.out.println("Minimal value: " + num1);
		else if (num2 <= num1 && num2 <= num3)
			System.out.println("Minimal value: " + num2);
		else if (num3 <= num1 && num3 <= num2)
			System.out.println("Minimal value: " + num3);
	}
	private static void Task_2 () {
		int num1, num2, num3;
		System.out.println("");
		System.out.println("Task 2");
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the first number: ");
			num1 = in.nextInt();
		System.out.print("Enter the second number: ");
			num2 = in.nextInt();
		System.out.print("Enter the third number: ");
			num3 = in.nextInt();
		if (num1 == num2 && num2 == num3)
			System.out.println("All numbers are equel among them there is neither minimal nor maximal");
		else if (num1 <= num2 && num1 <= num3) {
			System.out.println("Minimal value: " + num1);
			if (num2 > num3)
				System.out.println("Maximal value: " + num2);
			else
				System.out.println("Maximal value: " + num3);
		}
		else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Minimal value: " + num2);
			if (num1 > num3)
				System.out.println("Maximal value: " + num1);
			else
				System.out.println("Maximal value: " + num3);
		}
		else if (num3 <= num1 && num3 <= num2) {
			System.out.println("Minimal value: " + num3);
			if (num1 > num2)
				System.out.println("Maximal value: " + num1);
			else
				System.out.println("Maximal value: " + num2);
		}
	}
	private static void Task_3 () {
		int num1, num2, num3;
		System.out.println("");
		System.out.println("Task 3");
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the first number: ");
			num1 = in.nextInt();
		System.out.print("Enter the second number: ");
			num2 = in.nextInt();
		System.out.print("Enter the third number: ");
			num3 = in.nextInt();
		if (num1 == num2 && num2 == num3)
			System.out.println("All value minimal: " + num1 + ", " + num2 + ", " + num3);
		else if (num1 <= num2 && num1 <= num3) {
			if (num1 == num2)
				System.out.println("Minimal value: " + num1 + ", " + num2);	
			else if (num1 == num3)
				System.out.println("Minimal value: " + num1 + ", " + num3);
			else
				System.out.println("Minimal value: " + num1);
		}
		else if (num2 <= num1 && num2 <= num3) {
			if (num2 == num3)
				System.out.println("Minimal value: " + num2 + ", " + num3);
			else
				System.out.println("Minimal value: " + num2);
		}
		else if (num3 <= num1 && num3 <= num2)
			System.out.println("Minimal value: " + num3);
	}
	private static void Task_4 () {
		int per, res;
		System.out.println("");
		System.out.println("Task 4");
		Scanner in = new Scanner (System.in);
		System.out.print("Enter number: ");
		per = in.nextInt();
		res = per%2;
			if (per == 0)
			System.out.println("And not a even, and not a odd");
				else {
					if (res == 0)
					System.out.println("Yours number even");
					else
					System.out.println("Yours number odd");
				}
	}
	private static void Task_5 () {
		int num1, num2, res;
		System.out.println("");
		System.out.println("Task 5");
		int i = 0;
		while (i < 10) {
			Scanner in = new Scanner (System.in);
			System.out.print("Enter the first number: ");
 				num1 = in.nextInt();
			System.out.print("Enter the second number: ");
				num2 = in.nextInt();
			if (num2 == 0) {
				System.out.println("Zero cannot be divided");
				i++;
				if (i == 5) {
					System.out.println("It is not funny");
					i = 100;
				}
			}
			else {
				res = num1%num2;
				if (res == 0) {
					System.out.println("Numbers are divided without remaining");
					i = 100;
				}
				else {
					System.out.println("Numbers do not divide without remaining");
					i = 100;
				}
			}

		}
	}
	private static void Task_6 () {
		int num1, num2;
		System.out.println("");
		System.out.println("Task 6");
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the first number: ");
			num1 = in.nextInt();
		System.out.print("Enter the second number: ");
			num2 = in.nextInt();
		if (Math.abs(num1 - 10) == Math.abs(num2 - 10))
			System.out.println("And how do I answer that ?");
		else if (Math.abs(num1 - 10) < Math.abs(num2 - 10))
			System.out.println("10 closer: " + num1);
		else if (Math.abs(num1 -10) > Math.abs(num2 - 10))
			System.out.println("10 closer: " + num2);
	}
	private static void Task_7 () {
		int NumOfDay, cost;
		System.out.println("");
		System.out.println("Task 7");
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the number of day: ");
			NumOfDay = in.nextInt();
		int i = 0;
		while (i < 10) {
			if (NumOfDay <= 0) {
				System.out.println("Try once more");
				i++;
			}
			else if (NumOfDay >= 7) {
				cost = NumOfDay * 40 - 50;
				System.out.println("Pay: " + cost);
				i = 100;
			}
			else if (NumOfDay >= 5 && NumOfDay < 7) {
				cost = NumOfDay * 40 - 20;
				System.out.println("Pay: " + cost);
				i = 100;
			}
			else if (NumOfDay <5 && NumOfDay > 0) {
				cost = NumOfDay *40;
				System.out.println("Pay: " + cost);
				i = 100;
			}
			else if (i == 5){
				System.out.println("You are hopeless");
				i = 100;
			}
		}
	}
}

