import java.time.LocalTime;

public class Lantern {
    public static boolean sensorOfDaylight;
    public int battery = 3;
    private Lightning lightning;

    public Lantern() {
    }

    public int getBattery() {
        switch(this.lightning) {
        case RED:
            System.out.println("Battery charge is " + (this.battery - 2));
            break;
        case WHITE:
            System.out.println("Battery charge is " + this.battery--);
            break;
        case BLINK:
            System.out.println("Battery is discharged");
            break;
        default:
            System.out.println("Lantern is turn-off");
        }

        return this.battery;
    }

    public void setLightning(Lightning lightning) {
        this.lightning = lightning;
    }

    public static boolean setSensorOfDaylight() {
        LocalTime on = LocalTime.MIDNIGHT.plusHours(6L);
        LocalTime off = LocalTime.MIDNIGHT.plusHours(20L);
        if (LocalTime.now().isAfter(on) && LocalTime.now().isBefore(off)) {
            sensorOfDaylight = false;
        } else {
            sensorOfDaylight = true;
        }

        return sensorOfDaylight;
    }

    public static void main(String[] args) {
        System.out.println(setSensorOfDaylight());
    }
}
