public interface Hospital {
    void setHospital(Integer number, String address);
    String getHAddress();
    Integer getHNumber();
    Integer getCountOfFreeHRooms();
    void getCurePrice();
    void getCureList();
    MyLinkedList getCureList(String mode);
    MyLinkedList paid();
}