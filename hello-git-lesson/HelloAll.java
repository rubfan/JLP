public class HelloAll {

<<<<<<< HEAD

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
          printUserInfo("Ivan", "Brus");
      }
=======
     public static void main (String[] args) {
        System.out.println("Hello all!!!);
        //Add fisrt and second name
	      //================================
        printUserInfo("Vladyslav", "Kasyanchuk");
        printUserInfo("Ruslan", "Gramatic");
        printUserInfo("Irina", "Shvec");
        printUserInfo("Rotar", "Denis");
        printUserInfo("Iliya ","Chernomorets");
        printUserInfo("Ruslan", "Gramatic");    }
        printUserInfo("Irina", "Shvec");
        printUserInfo("Rotar", "Denis");
        printUserInfo("Maxim", "Voroniuk");
        printUserInfo("Kirill" ,"Klyenko");
        printUserInfo("Nikita", "Palchinski");
        printUserInfo("Vitalij", "Stinskij");
        printUserInfo("Iliya ","Chernomorets");
        printUserInfo("Vladislav","Berdnikov");
        printUserInfo("Anna","Tsurkan");
        printUserInfo("Denis","Palamarchuk");
    }
                           
    private static void printUserInfo(String firstName, String lastName) {
	System.out.format("Hello %s %s, Welcome to Hillel school !!!\n", firstName, lastName);
    }
        printUserInfo("Aleksey", "Andreev");
        printUserInfo("Ilya", "Igonin");
        printUserInfo("Ivan", "Brus");
      }	
>>>>>>> 50fc13eeac3bbfa107a139f2d74c4d0a385cb9ca
                           
      private static void printUserInfo(String firstName, String lastName) {
          System.out.format("Hello %s %s, Welcome to Hillel school !!!\n", firstName, lastName);
      }

}
