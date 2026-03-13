package week_01.book.chapter01.conditionals_and_loops;
// 12 March,2026
/*
the program will flip the fairCoin with the possibility of 50-50 to HEad and Tail
*
*
* */

public class Flip {
    public static void main(String[] args) {

        System.out.println("Five Times Simulations of a Flip Coin: ");

        int count =0;
        while(count<5) {
            if (Math.random() < 0.5) {
                System.out.println("Head");
            } else {
                System.out.println("Tail");
            }
            count++;
        }
    }
}
/*
* I just turned off the help menu so that i can use these kind of the comments into my programs
*
* so in the code:
* this program uses Math.random() to simulate the flip of a coin.
* */
