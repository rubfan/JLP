public class MassiveMain {
    public static void main(String[] args){
        MassiveOperatorImplements array = new MassiveOperatorImplements();
        String[] arrayToCopy = {"meow", "a-a-a", "o-o-o", "moo", "chick-chick"};
        array.addMassive(arrayToCopy);
        array.addElement("semicolon");
        System.out.println(array.getSize());
    }
}

