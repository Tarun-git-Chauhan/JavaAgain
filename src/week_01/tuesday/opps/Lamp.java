package week_01.tuesday.opps;

// 10 march 2026
// we will learn about the classes here
// we will make a class regarding the Lamp to make our momentum which will tell us about the lamp that its lights are
// on off

import java.util.Scanner;


public class Lamp {
    private boolean isOn = false;


    // so there will be input to turn off and turn on the switch then the user can ask if the ligh is on or off
    // method to take the input so that user can click the switch
    private boolean switchAction(){

        System.out.println("Do you want to click the switch: (Y/N) & Q to quite: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y'){
            System.out.println("Clicked on the switch");
            isOn = !isOn; // i am thinking that it will change it if i click the switch it will turn boolean
        } else if (ch == 'N' || ch == 'n') {
            System.out.println("No click");
            // do nothing

        }
        else if (ch == 'Q' || ch == 'q') {
            // do nothing quite
            System.exit(0);
        }
        else{
            System.out.println("Invalid input");
        }
//        sc.close();// this is was creting an error for the second input like no such element
        return isOn;
    }

    // now the method to ask the user to get the print of the Lamp light
    public void printResult(){
        if(switchAction()){
            System.out.println("Lamp is on");
        }
        else{
            System.out.println("Lamp is off");
        }
    }

    // now we have to create the instance of the

    public static void main(String[] args){
        int i = 0;
        Lamp lamp01 = new Lamp();

        while (i < 3) {
            lamp01.printResult();
            i++;
        }
    }


//    // getters and setters
//    public boolean isOn() {
//        return isOn;
//    }
//
//    public void setOn(boolean on) {
//        isOn = on;
//    }
}
