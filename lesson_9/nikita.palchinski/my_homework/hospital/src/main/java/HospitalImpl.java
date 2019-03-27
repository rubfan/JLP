public class HospitalImpl implements  Hospital{
    protected static Integer cofhr = 100;
    /*protected*/ static MyLinkedList cureList = new MyLinkedList();
    private static HumanImpl human = new HumanImpl();
    private Integer number;
    private int count;
    static MyLinkedList curePriceList = new MyLinkedList();
    private String address;
    public void setHospital(Integer number, String address) {
        this.number = number;
        this.address = address;
    }

    public String getHAddress() {
        return this.address;
    }

    public Integer getHNumber() {
        return this.number;
    }

    public Integer getCountOfFreeHRooms() {
        return this.cofhr;
    }

    public MyLinkedList getCurePrice() {
        for(int i = 0; i < this.cureList.getSize(); i ++){
            String[] hh = this.cureList.transform();
            if(this.cureList.transform()[i].contains(human.getFName() + " " + human.getLName()))
                count++;
        }
        this.curePriceList.add(human.getFName() + " " + human.getLName() + " " + (this.count * 10 - human.concession));
        return this.curePriceList;
    }

    public void getCureList() {
        this.cureList.showList();
    }
    public MyLinkedList getCureList(String mode){
        if(mode.equals("r")) this.cureList.showList();
        if(mode.equals("s")) return this.cureList;
        return null;
    }

    public String paid() {
        if(human.getMoney() >= (this.count * 10) - human.concession)
            return "You could pay for the cure.";
        else
            return "You could pay for the cure. You need " +
                    ((this.count * 10) - human.concession - human.getMoney());
    }

    /*public MyLinkedList getCureList(String mode, String illness){
        if(mode.equals("w")) this.cureList.remove(
                this.cureList.vSearch(illness));
        return this.cureList;
    }*/
}
