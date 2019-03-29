public interface Lantern {
    void setPower(Integer power);
    void setState(State state);
    void setNumofBat(Integer batteries);
    String getColour();
    Integer getPower();
    State getState();
    Integer getNumofBat();
}