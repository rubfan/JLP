public class FluffyToy {
    private String type;
    private String colour;
    public int bottom = 1;
    private boolean interactivity;

    public FluffyToy(String type, String colour) {
        this.type = "Bunny";
        this.colour = "WHITE";
    }

    public int getBottom() {
        return bottom;
    }

    public boolean setInteractivity(boolean interactivity) {
        if (bottom == 0) {
            interactivity = false;
        } else {
            interactivity = true;
        }
        return interactivity;
    }

    public void pushBottom() {
        System.out.println("Toy says: MAMA");
    }
}
