package pharmacy;

public class Pharmacy {

    int price;

    Pharmacy(Name name){
        switch(name){
            case CORVALOL: price = 25; break;
            case MUKALTIN: price = 40; break;
            case PATCH:    price = 10; break;
            case BANDAGE:  price = 15;
        }
    }

    public String sellDrugs(){
        String s;
        if(price == 25){
            s = "НА! Не нервничай";
        }else if(price == 40){
            s = "НА! Не кашляй";
        }else if(price == 10 || price == 15){
            s = "Не натирай";
        }else s = "ты не болен";
        return s;
    }


}
