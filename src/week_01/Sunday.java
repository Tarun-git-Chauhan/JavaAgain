package week_01;
// Date : 08 March 2026
//exercise #02
/*
* get input from the user and detect whether the number is even or odd and also print the number
*
* */

import java.util.Scanner;


public class Sunday {

    // int this method we will count the number of even numbers
    public static void printCounters(int invalidCounter, int evenCounter, int oddCounter, int totalNumberChecked){
        System.out.println("\n\n\n");
        System.out.println("check-04");

        System.out.println("Counters");
        System.out.println("Total Number Checked "+totalNumberChecked);
        System.out.println("Total Even number "+evenCounter);
        System.out.println("Total Odd number "+oddCounter);
        System.out.println("Total Invalid inputs "+invalidCounter);
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        int number=0;
        System.out.println("check-01");
        Scanner sc = new Scanner(System.in);

        // counters
        int invalidCounter=0;
        int evenCounter =0;
        int oddCounter =0;
        int totalNumberChecked=0;


        do{
            System.out.print("Enter the number please to find out even or odd and 0 to (quite) : ");
//            number = sc.nextInt(); // this line is risky because it will only except integer what if someone add someother datatypes
            if(sc.hasNextInt()){
                number = sc.nextInt();
                System.out.println("check-02");
                if(number ==0){break;}
                if((number%2)==0) {
                    System.out.println("The number is EVEN, "+ number);
                    evenCounter++;
                }
                else{
                    System.out.println("The number is ODD, "+ number);
                    oddCounter++;
                }
                totalNumberChecked++;

            }
            else{
                System.out.println("Invalid input");
                System.out.println("check-03");
                invalidCounter++;
                sc.next(); // clear the bad input
            }
           printCounters(invalidCounter, evenCounter, oddCounter, totalNumberChecked);

        }while(true);
        System.out.println("Thank you for playing this mini game :)");
        sc.close();

    }
}
