package week_01.book.chapter01;

import java.util.Scanner;

//11 March 2026
// the program to convert to the binary from the decimal
public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int power = 1;
        while (power <= num/2) {
            power *= 2;
        }

        while (power > 0) {
            if( power > num ){
                System.out.print(0);
            }
            else{
                System.out.print(1);
                num = num - power;

            }
            power = power/2;

        }
    }
}
