import java.lang.String;
import java.lang.Integer;
public class HumanImpl implements Human {

    protected /*static*/ String firstName, lastName, illness;
    static String state;
    protected static Integer money;
    private Integer countt = 0;
    protected Presention presention = Presention.NOT_IN_HOSPITAL;
    protected int concession;
    private HospitalImpl hospital = new HospitalImpl();
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHealthState(String state) {
        int s = hospital.cureList.getSize();
        String[] hh = hospital.cureList.transform();
        for(int i = 0; i < s; i ++){
            if(hh[i].contains(this.getFName() + " "
                    + this.getLName()))
                this.countt++;
        }
        for (int i = 0; i < this.countt; i++)
        {
            System.out.print("+");
        }
        this.state = state;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public void setPresention(Presention presention) {
        this.presention = presention;
    }

    public Presention getPresention() {
        return presention;
    }

    public void setIllness(String illness) {
        this.illness = illness;
        hospital.cureList.add(illness + " - " + this.firstName
                + " " + this.lastName);
        this.countt++;
        //hospital.cureList.showList();
    }

    public void setConcession(Integer concession) {
        this.concession = concession;
    }

    public void comeToHospital() {
        if(hospital.cofhr > 0 && getPresention() == Presention.NOT_IN_HOSPITAL) {
            hospital.cofhr--;
            setPresention(Presention.IN_HOSPITAL);
        }
        else
        System.out.println("(S)He is already in hospital\n");
        //System.out.println(hospital.cofhr);
    }

    public void leaveTheHospital() {
        if(hospital.cofhr < 100 && getPresention() == Presention.IN_HOSPITAL) {
            setPresention(Presention.NOT_IN_HOSPITAL);
            hospital.cofhr++;
        }
        else
            System.out.println("(S)He has already left the hospital\n");
    }

    public void price() {
        HospitalImpl.curePriceList.add(this.firstName + " " + this.lastName + " " + (this.countt * 10 - this.concession));
        //paid();
        //curePriceList.add(human.getFName() + " " + human.getLName() + " " + (count * 10 - human.concession));

    }

    public String getFName() {
        return this.firstName;
    }

    public String getLName() {
        return this.lastName;
    }

    public String getHealthState() {
        if((hospital.cureList.getSize() != null)
                && (hospital.cureList.getSize() <= 2))
            return this.state + " - not too bad";
        if(hospital.cureList.getSize() > 2)
            return this.state + " - very bad";
        return this.state;
    }

    /*public void paid(){
        if(this.money >= ((this.countt * 10) - this.concession))
            HospitalImpl.paid.add("You could pay for the cure.");
        else
            HospitalImpl.paid.add("You could pay for the cure. You need " +
                    ((this.countt * 10) - this.concession - this.money));
    }*/

    public Integer getMoney() {
        return this.money;
    }

    public MyLinkedList getIllness() {
        return hospital.getCureList("s");
    }

    public int getConcession() {
        return concession;
    }
}

