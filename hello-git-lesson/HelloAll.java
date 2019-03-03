ublic class HelloAll {
     public static void main (String[] args){
        System.out.println("Hello all!!!);
	//================================
	printUserInfo("Vladyslav", "Kasyanchuk");
	printUserInfo("Ruslan", "Gramatic");
	printUserInfo("Kirill" ,"Klyenko");
	printUserInfo("Rotar", "Denis");
  	printUserInfo("Iliya ","Chernomorets");
	printUserInfo("Vitalij", "Stinskij");
        printUserInfo("Iliya ","Chernomorets");

	printUserInfo("Denis","Palamarchuk")
    

=======
  	printUserInfo("Vladislav","Berdnikov");
>>>>>>> 3cf8cfc6300cfd4c92e1602527e57adccb4c402b

     }
    private static void printUserInfo(String firstName, String lastName) {
	System.out.format("Hello %s %s, Welcome to Hillel school !!!\n", firstName, lastName);
    }
}
