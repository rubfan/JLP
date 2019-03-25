import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Usage {
    public static void main(String[] args) {

        Set<String> answers = new HashSet<String>();
        answers.add("on");
        answers.add("off");

        Initials lighter = new Initials();
        Scanner sc = new Scanner(System.in);

        System.out.println("Set the state of lantern: ");
        String state;
        do
            state = sc.nextLine();
        while(!answers.contains(state));
        lighter.setState(state);

        System.out.println("Set the power of lantern: ");
        int power = sc.nextInt();
        lighter.setPower(power);

        System.out.println("Set batteries: ");
        Integer batteries = sc.nextInt();
        lighter.setNumofBat(batteries);


        if(lighter.getState().equals("on") && (batteries != 0)) {
            System.out.println("Lighter has a " +
                    lighter.getColor() +
                    " light with power " +
                    lighter.getPower() + ".");
        }
        else
            System.out.println("Lighter is off.");
    }

}

