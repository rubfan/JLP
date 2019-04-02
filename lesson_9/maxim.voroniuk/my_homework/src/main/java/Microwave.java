public class Microwave {

    int power;
    int time;
    boolean doorIsOpen = true;
    boolean foodOff = true;

    public void setPower(int power) {
        this.power = power;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean insertFood(){
        foodOff = false;
        return true;
    }

    public void closeTheDoor(){
        doorIsOpen = false;
    }

    public void openTheDoor(){
        doorIsOpen = true;
    }

    public String doorState(){
        if(doorIsOpen){
            return "Open";
        }
        else {
            return "Close";
        }
    }

    public String whereIsTheFood(){
        if(foodOff){
            return "Outside";
        }
        else
        {
            return "Inside";
        }
    }

    public boolean cook(){
        if(doorIsOpen) {
            return false;
        }
        else if(foodOff){
            return false;
        }
        else {
            return true;
        }
    }
}
