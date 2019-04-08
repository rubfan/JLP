package House;

public class RoomImpl implements Room {

    int light;

    boolean clear;
    boolean flowers;

    public void cleanTheRoom() {
        clear=true;
    }
    public boolean checkTheCleaning(){
        return  this.clear;
    }

    public void setTheLight(int light) {    //1-turn on, 2 - turn off
        this.light=light;
    }

    public int getTheLight() {
        return this.light;
    }

    public Book getBook() {
        return Book.SHERLOCK_HOLMS;
    }
}
