public class HelloAll {
    public static void main(String[] args) {
    	System.out.println("Hello all!!!");
	//================================
	printUserInfo("Ruslan", "Gramatic");
    }

    private static void printUserInfo(String firstName, String lastName) {
	System.out.format("Hello %s %s, Welcome to Hillel school !!!\n", firstName, lastName);
    }
}

