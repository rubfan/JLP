public class HelloAll {
<<<<<<< HEAD
     public static void main (String[] args){
        System.out.println("Hello all!!!);
	//================================
	printUserInfo("Vladyslav", "Kasyanchuk");
	printUserInfo("Ruslan", "Gramatic");
	printUserInfo("Irina", "Shvec");
	printUserInfo("Rotar", "Denis");
        printUserInfo("Iliya ","Chernomorets");
	printUserInfo("Maxim", "Voroniuk");
	printUserInfo("Kirill" ,"Klyenko");
	printUserInfo("Rotar", "Denis");
        printUserInfo("Nikita", "Palchinski");
  	printUserInfo("Iliya ","Chernomorets");
	printUserInfo("Vitalij", "Stinskij");
        printUserInfo("Iliya ","Chernomorets");
  	printUserInfo("Vladislav","Berdnikov");
        printUserInfo("Denis","Palamarchuk");
=======
>>>>>>> 218e8e0416b0b870ebc5fd35b7e0d87bea494f5f

      public static void main (String[] args){
          System.out.println("Hello all!!!);
          //================================
          printUserInfo("Vladyslav", "Kasyanchuk");
          printUserInfo("Ruslan", "Gramatic");
          printUserInfo("Ilya", "Igonin");
          printUserInfo("Irina", "Shvec");
          printUserInfo("Rotar", "Denis");
          printUserInfo("Maxim", "Voroniuk");
          printUserInfo("Kirill" ,"Klyenko");
          printUserInfo("Rotar", "Denis");
          printUserInfo("Nikita", "Palchinski");
          printUserInfo("Iliya ","Chernomorets");
          printUserInfo("Vitalij", "Stinskij");
          printUserInfo("Vladislav","Berdnikov");
          printUserInfo("Anna","Tsurkan");
          printUserInfo("Denis","Palamarchuk");
          printUserInfo("Aleksey", "Andreev");
      }
                           
      private static void printUserInfo(String firstName, String lastName) {
          System.out.format("Hello %s %s, Welcome to Hillel school !!!\n", firstName, lastName);
      }
}
