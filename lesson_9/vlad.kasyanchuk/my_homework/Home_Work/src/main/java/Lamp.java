public class Lamp {
    int battery;
    String name = "Lamp";
    String state [] = {"off", "white", "red", "blink"};

    public void setBattery(int i){
        if (i > 3){
            System.out.println("it not possible to insert more than three batteries");
                    }
        else {
            battery = i;
                    }
    }

    public int getBattery (){
        return battery;
    }

    public String setLight (){
        switch (battery){
            case (0):
                return state[battery];
            case (1):
                return state[battery];
            case (2):
                return state[battery];
            case (3):
                return state[battery];
        }
        return state[battery];
    }
    public void showLight(){
        System.out.println(setLight());
    }
}
