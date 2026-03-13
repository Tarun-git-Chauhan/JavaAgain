package week_01.book.chapter01.arrays;
/*12 March,2026
*
* this is the simulation of the dog to work on the famous model Self Avoiding random walk
*
* */

import java.util.Scanner;

public class SelfAvoidingWalk {
   public static void main(String[] args) {
        /*n = lattice size it means the coty size
        trials = number of the trials
        deadEnds = #trials resulting in the deadEnds
        a[][] intersections visited
        x,y = current position
        r = random number (0,1)
        * */
       System.out.print("Enter the lattice size: ");
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       System.out.print("Enter the #Trials: ");
       int trials = input.nextInt();
       int deadEnds = 0;
       for(int i = 0; i < trials; i++){
           boolean[][] a = new boolean[n][n];
           int x = n/2, y = n/2;
           while(x > 0 && x < n-1&& y > 0  && y < n-1){
               // check for the dead ends and make a random move
               a[x][y] = true;
               if(a[x][y] && a[x+1][y] && a[x][y-1] && a[x][y+1]){
                   deadEnds++;
                   break;
               }
               double r = Math.random();
               if(r<0.25){
                   if(!a[x+1][y]){
                       x++;
                   }
               }
               else if(r<0.5){
                   if(!a[x-1][y]){
                       x--;
                   }
               }
               else if(r<0.75){
                   if(!a[x][y+1]){
                       y++;
                   }
               }
               else {
                   if(!a[x][y-1]){
                       y--;
                   }
               }
           }
       }
       System.out.println(100*deadEnds/trials+"% dead ends");

    }

}
