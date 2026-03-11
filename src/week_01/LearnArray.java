package week_01;

import java.util.Arrays;
import java.util.Scanner;

//Date : 08 March 2026
// worked on the for each loop
public class LearnArray {
    public static void main(String[] args) {
        // creating and initializing the array
        int[] numbers = {223,4,5,6,7,23,22,2323};
        // loop throgh the array
        System.out.println("By using the For-each loop");
        /*for(int a : numbers){
            System.out.println(a);
            // this will print the numbers one by one in the new line always
        }

*/
        // printing the sum of the array
//        System.out.println("printing the sum of the numbers in the array: "+sumOfArray(numbers));
//        System.out.println("printing the average of the numbers in the array: "+averageOfArray(numbers));
//        System.out.println("Largest number in the array: "+largestNumber(numbers));
//        System.out.println("Smallest number in the array: "+smallestNumber(numbers));
//
//        System.out.println("To check the number please give us number: ");
        // now we will call two methods together
//        findNumber(numbers,getNumber());
        reverseArray(numbers);




    }
    // method to do the sum of the array
    public static int sumOfArray(int[] array){
        int sum = 0;
         for(int i: array){
             sum+=i;
         }
         return sum;
    }
    public static double averageOfArray(int[] array){
        // what if the array is empty then
        if(array.length==0) return 0;
        double sum = (double)sumOfArray(array);
        return sum/array.length;
    }
    // method to find the Largest number in the array
    public static int largestNumber(int[] array){
        if(array.length==0) return 0;
        int largest = array[0];
        for (int num: array) {
            if (num > largest) {
                largest = num;
//                System.out.println("check-01");
            }

        }
        return largest;
    }
    // method to find the smallestNumber in the array
    public static int smallestNumber(int[] array){
        if(array.length==0) return 0;
        int smallest = array[0];

        for (int num: array) {
            if (num < smallest || num == smallest) {
                smallest = num;
//                System.out.println("check 02");
            }
//            System.out.println("checking");
        }
        return smallest;
    }

    // method to get number from the user to check whether it is inthe array or not
    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        if(sc.hasNextInt()){
        return sc.nextInt();}
        else{
            System.out.println("Invalid Input");
            sc.close();
            return 0;
        }

    }
    // method to search for the number

    public static void findNumber(int[] array, int find){
       boolean found = false;
        for(int num: array){
            if(num == find){
               found = true;
               break;
            }
        }
        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }

  /*  // to reverse the array
    public static void reverseArray(int[] array){
        int[] reversedArrayDone = new int[array.length];
        for(int i=0; i<array.length; i++){ //0,1,2,3,4,5,6,7
            for(int j=array.length-1; j>=i; j--){ // 7,6,5,4,3,2,1,0
                reversedArrayDone[j] = array[i];
                System.out.println("i: "+ i);
                System.out.println("j: "+ j);
            }
        }
//        System.out.println(Arrays.toString(reversedArrayDone));
        // this one to print the array but we will use the for each loop
        for (int num: reversedArrayDone) {
            System.out.print(num +" ");
        }
    }

*/
    // Bro earlier the code had logical issue like looping
    public static void reverseArray(int[] array){
        int[] reversedArray = new int[array.length];

        for(int i=0; i<array.length; i++){
            reversedArray[i] = array[array.length-1-i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

}


