public class HospitalImpl implements  Hospital{
    protected static Integer cofhr = 100;
    static MyLinkedList cureList = new MyLinkedList();
    static HumanImpl human = new HumanImpl();
    private Integer number;
    protected static MyLinkedList paid;
    protected static int count;
    static MyLinkedList curePriceList = new MyLinkedList();
    private String address;
    public void setHospital(Integer number, String address) {
        this.number = number;
        this.address = address;
    }

    public String getHAddress() {
        return address;
    }

    public Integer getHNumber() {
        return number;
    }

    public Integer getCountOfFreeHRooms() {
        return cofhr;
    }

    public void getCurePrice() {
        curePriceList.showList();
    }

    public void getCureList(){
        cureList.showList();
    }
    public MyLinkedList getCureList(String mode){
        if(mode.equals("r"))
            cureList.showList();
        if(mode.equals("s"))
            return cureList;
        return null;
    }

    public MyLinkedList paid() {
        return paid;
    }

    /*public MyLinkedList getCureList(String mode, String illness){
        if(mode.equals("w")) this.cureList.remove(
                this.cureList.vSearch(illness));
        return this.cureList;
    }*/
}