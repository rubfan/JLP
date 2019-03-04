public class HelloAll {
     public static void main (String[] args){
        System.out.println("Hello all!!!);
	//================================
	printUserInfo("Vladyslav", "Kasyanchuk");
	printUserInfo("Ruslan", "Gramatic");
	printUserInfo("Irina", "Shvec");
	printUserInfo("Rotar", "Denis");
        printUserInfo("Iliya ","Chernomorets");
	printUserInfo("Kirill" ,"Klyenko");
	printUserInfo("Rotar", "Denis");
  	printUserInfo("Iliya ","Chernomorets");
	printUserInfo("Vitalij", "Stinskij");
        printUserInfo("Iliya ","Chernomorets");
  	printUserInfo("Vladislav","Berdnikov");

     }
    private static void printUserInfo(String firstName, String lastName) {
	System.out.format("Hello %s %s, Welcome to Hillel school !!!\n", firstName, lastName);
    }
}
