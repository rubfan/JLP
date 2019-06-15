public interface Human {
    void setName(String firstName, String lastName);
    void setHealthState(String state);
    void setMoney(Integer money);
    void setPresention(Presention presention);
    Presention getPresention();
    void setIllness(String illness);
    void setConcession(Integer concession);
    void comeToHospital();
    void leaveTheHospital();
    void price();
    String getFName();
    String getLName();
    String getHealthState();
    Integer getMoney();
    MyLinkedList getIllness();
    int getConcession();
}

