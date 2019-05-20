package street;

public class Street {

    private TrafficLight colour;

    Street(TrafficLight colour){
        this.colour = colour;
    }

    public String cross(){
        String s;
        switch (colour){
            case RED:    s = "STOP!";     break;
            case YELLOW: s = "Prepare!";  break;
            case GREEN:  s = "GO!";       break;
            default:     s = "Undefined";
        }
        return s;
    }
}
