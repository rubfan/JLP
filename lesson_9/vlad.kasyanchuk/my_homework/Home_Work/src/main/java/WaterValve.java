public class WaterValve {
    private boolean coldWater;
    private boolean hotWater;
    private boolean shower = false;


    public boolean turnOnColdWater (){
        coldWater = true;
        return true;
    }
    public boolean turnOffColdWater (){
        coldWater = false;
        return true;
    }
    public boolean turnOnHotWater (){
        hotWater = true;
        return true;
    }
    public boolean turnOffHotWater (){
        hotWater = false;
        return true;
    }
    public boolean turnOnWarmWater (){
        if (hotWater & coldWater == true ){
            return true;}
        else {
            return false;}
    }
    public boolean switchToShower(){
        if (turnOnHotWater()|| turnOnColdWater() || turnOnWarmWater() == true){
        return true;}
        else {
            return false;}
    }


}
