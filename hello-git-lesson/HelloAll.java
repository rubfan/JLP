public class HelloAll {
     public static void main (String[] args){
        System.out.println("Hello all!!!);
	//================================
	printUserInfo("Vladyslav", "Kasyanchuk");
	printUserInfo("Ruslan", "Gramatic");
	printUserInfo("Kirill" ,"Klyenko");
	printUserInfo("Rotar", "Denis");
        printUserInfo("Nikita", "Palchinski");
  	printUserInfo("Iliya ","Chernomorets");
	printUserInfo("Vitalij", "Stinskij");
        printUserInfo("Iliya ","Chernomorets");
  	printUserInfo("Vladislav","Berdnikov");
        printUserInfo("Denis","Palamarchuk");

     }
    private static void printUserInfo(String firstName, String lastName) {
	System.out.format("Hello %s %s, Welcome to Hillel school !!!\n", firstName, lastName);
    }
}
