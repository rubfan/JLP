public interface Human {
    void setName(String firstName, String lastName);
    void setHealthState(String state);
    void setMoney(Integer money);
    void setIllness(String illness);
    void setConcession(Integer concession);
    void comeToHospital();
    void leaveTheHospital();
    String getFName();
    String getLName();
    String getHealthState();
    Integer getMoney();
    MyLinkedList getIllness();
    Integer getConcession();
}
