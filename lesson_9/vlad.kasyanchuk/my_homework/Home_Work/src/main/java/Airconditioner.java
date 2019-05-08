public class Airconditioner {
    private int temperature;
    private boolean switchOnOff = false;

    public void turnOn(){
        switchOnOff = true;
    }
    public void turnOff(){
        switchOnOff = false;
    }
    public boolean heat (){
        if (switchOnOff == true){
            return true;
        }else{
            return false;
        }
    }
    public boolean cool(){
        if (switchOnOff == true){
            return true;
        }
        else{
            return false;
        }
    }
    public int setTemperature(int i){
        if ((i >= -10) && (i <= 30)){
        temperature = i;
        return temperature;
        }
        else{
            return temperature;
        }
    }
    public int increaseTemperature(){
        if (temperature != 30){
            temperature++;
            return temperature;
        }
        else{
            return temperature;
        }
    }
    public int decreaseTemperature(){
        if (temperature != -10){
            temperature--;
            return temperature;
        }
        else{
            return temperature;
        }
    }
}
