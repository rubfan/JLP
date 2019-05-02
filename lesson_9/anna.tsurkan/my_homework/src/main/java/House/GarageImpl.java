package House;

public class GarageImpl implements Garage {

    private String owner;
    private boolean security;

    public void setSecurity(boolean security) {
        this.security=security; // 1-on, 0-off
    }

    public boolean getStateOfSecurity() {
        return security;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}
