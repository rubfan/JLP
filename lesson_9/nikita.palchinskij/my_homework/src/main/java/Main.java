public class Main {
    public static void main(String[] args){
        // NullPointer -> Integer в int (getCurePrice)
        // Убрал статики в Human


        Hospital hospital = new HospitalImpl();

        System.out.println(hospital.getCountOfFreeHRooms());

        hospital.setHospital(11, "st. Holy, 17");
        System.out.println("Hospital " + hospital.getHNumber() +
                " is on " + hospital.getHAddress() + ".");

        Human human = new HumanImpl();
        Human human2 = new HumanImpl();

        human.setName("John", "Smith");
        human2.setName("Yarchuk", "Alex");

        //System.out.println(human.getFName() + ' ' + human2.getFName());

        human.comeToHospital();
        System.out.println(hospital.getCountOfFreeHRooms());
        human2.comeToHospital();
        System.out.println(hospital.getCountOfFreeHRooms());

        human.setIllness("Bronchitis");
        human.setIllness("Get cold");

        human.setConcession(11);
        human2.setConcession(2);

        human2.setIllness("Sour");
        human2.setIllness("Blacklab");

        human.setConcession(22);
        human2.setConcession(4);

        human.comeToHospital();
        System.out.println(hospital.getCountOfFreeHRooms());

        System.out.print(human2.getFName() + "'s ");
        System.out.println(" concession is " + human2.getConcession());
        System.out.print(human.getFName() + "'s ");
        System.out.println(" concession is " + human.getConcession());

        System.out.println();
        hospital.getCureList();
        human.price();
        human2.price();
        hospital.getCurePrice();

        System.out.println();

        human.leaveTheHospital();
        human.leaveTheHospital();
        System.out.println(hospital.getCountOfFreeHRooms());
    }
}

