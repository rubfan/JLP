public class LampImpl implements Lamp {
    public void battery(int colour) {
        switch (colour) {
            case 1:
                System.out.println("White");
                break;
            case 2:
                System.out.println("Red");
                break;
            default:
                System.out.println("flash");
                break;
        }
    }

    public String turnOnTheLamp() {
        return "turn on";
    }

    public String turnOffTheLamp() {
        return "turn off";
    }
}
