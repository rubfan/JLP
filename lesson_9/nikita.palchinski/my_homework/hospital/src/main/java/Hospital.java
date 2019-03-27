public interface Hospital {


    void setHospital(Integer number, String address);
    String getHAddress();
    Integer getHNumber();
    Integer getCountOfFreeHRooms();
    MyLinkedList getCurePrice();
    void getCureList();
    MyLinkedList getCureList(String mode);
    String paid();
    /*MyLinkedList getCureList(String mode, String illness);*/
}
