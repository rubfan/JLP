package lighter;

public class Torch {

    private String s;

        public String whiteLight(Integer battery){
            if(battery == null){
                s = "wrong input";
            }else if(battery < 1){
                s = "need more batteries";
            }else s = "white light!";
            return s;
        }

        public String redLight(Integer battery){
            if(battery == null){
                s = "wrong input";
            }else if(battery < 2){
                s = "need more batteries";
            }else s = "red light!";
            return s;
        }

    public String blink(Integer battery){
        if(battery == null){
            s = "wrong input";
        }else if(battery < 3){
            s = "need more batteries";
        }else s = "blinking";
        return s;
    }



}
