import java.time.LocalTime;

public class Lantern {
    public static boolean sensorOfDaylight;
    public int battery = 3;
    private Lightning lightning;

    public int getBattery() {
        switch (lightning) {
            case RED:
                System.out.println("Battery charge is " + (battery - 2));
                break;
            case WHITE:
                System.out.println("Battery charge is " + (battery--));
                break;
            case BLINK:
                System.out.println("Battery is discharged");
                break;
            default:
                System.out.println("Lantern is turn-off");
        }
        return battery;
    }

    public void setLightning(Lightning lightning) {
        this.lightning = lightning;
    }

    public static boolean setSensorOfDaylight() {
        LocalTime on = LocalTime.MIDNIGHT.plusHours(6);
        LocalTime off = LocalTime.MIDNIGHT.plusHours(20);
        if (LocalTime.now().isAfter(on) && LocalTime.now().isBefore(off)) {
            sensorOfDaylight = false; //sensor turns-off the lantern
        } else {
            sensorOfDaylight = true;//sensor turns-on the lantern
        }
        return sensorOfDaylight;
    }

    public static void main(String[] args) {
        System.out.println(setSensorOfDaylight());
    }
}

