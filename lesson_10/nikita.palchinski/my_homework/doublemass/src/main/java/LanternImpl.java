public class LanternImpl implements Lantern {
    private Integer power;
    protected Integer batteries;
    private State state;

    public void setNumofBat(Integer batteries) {
        this.batteries = batteries;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getColour() {
        if(batteries == 1)
            return "white";
        if (batteries == 2)
            return "red";
        if(batteries == 3)
            return "blinking";
        return null;
    }

    public Integer getPower() {
        return this.power;
    }

    public Integer getNumofBat() {
        return this.batteries;
    }

    public State getState() {
        if(batteries > 0 && batteries < 4)
            return this.state;
        else
            return State.OFF;
    }
}
