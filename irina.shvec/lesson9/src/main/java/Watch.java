import java.time.LocalTime;

public class Watch {
    private String name;
    private String colour;
    private Lightning lightning;
    public static LocalTime time;

    public Watch(String name, String colour, Lightning lightning) {
        this.name = name;
        this.colour = colour;
        this.lightning = lightning;
    }
    public static void setTime(){
        time = LocalTime.now();
    }
}
