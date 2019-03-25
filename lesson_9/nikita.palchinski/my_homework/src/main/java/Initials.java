public class Initials implements Lantern {
    private Integer power;
    private String state;
    private Integer batteries;

    public void setNumofBat(Integer batteries) {
        this.batteries = batteries;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getColor() {
        if(batteries == 1)
            return "white";
        if (batteries == 2)
            return "red";
        if(batteries == 3)
            return "blinking";
        return "";
    }

    public Integer getPower() {
        return this.power;
    }

    public Integer getNumofBat() {
        return this.batteries;
    }

    public String getState() {
        if(batteries > 0 && batteries < 4)
            return this.state;
        else
            return "off";
    }
}