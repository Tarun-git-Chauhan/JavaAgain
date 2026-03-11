//Date for the day is 07 March 2026
package week_01;
import java.util.Scanner;
public class saturday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please : ");
        String name = new Scanner(System.in).next();
        System.out.println("Enter your age please : ");
        int age = sc.nextInt();
        System.out.println("Enter your height please : ");
        double height = sc.nextDouble();
        System.out.println("Enter your weight please : ");
        double weight = sc.nextDouble();

        System.out.println("Thank you\n\n");
        System.out.println("Your name is : "+ name+ " , age : "+ age+ " , height : "+ height+ " , weight : "+ weight);

    }
}