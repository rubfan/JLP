public class Main {
    public static void main(String[] args){
        Hospital hospital = new HospitalImpl();

        hospital.setHospital(11, "st. Holy, 17");
        System.out.println("Hospital " + hospital.getHNumber() +
                " is on " + hospital.getHAddress() + ".");

        Human human = new HumanImpl();
        Human human2 = new HumanImpl();
        human.setName("John", "Smith");
        human.comeToHospital();
        System.out.println(hospital.getCountOfFreeHRooms());
        human2.comeToHospital();
        human2.setConcession(12);
        System.out.println(hospital.getCountOfFreeHRooms());
        human.setIllness("bronchitis");
        human.setIllness("get cold");
        hospital.getCureList();
        hospital.getCureList();
        hospital.getCurePrice().showList();
        human2.leaveTheHospital();
        human2.setMoney(20);
        System.out.println(hospital.getCountOfFreeHRooms());

        human.setHealthState("little bad");

        System.out.println(human.getHealthState());
        System.out.println(hospital.paid());
        System.out.println();
        human2.getIllness().showList();
        System.out.print(human2.getFName() + "'s ");
        System.out.println(" concession is " + human2.getConcession());


        /*---it doesn't work
        //hospital.getCureList("w", "cold")/*.showList()*/;

        /*MyLinkedList aaa = hospital.getCureList("s");
        aaa.add(1, "illness");
        aaa.showList();------it works good------*/



    }
}
