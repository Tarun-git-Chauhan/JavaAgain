package oopsII.programiz.collections.lists.arrayList;
// 18 March 2026, now we will learn about the ArrrayList today

/*Today i am thiining to work on the ArrayList which means we will learn about it
* Once Class we will create an ArrayList -- Create.java
* then we will perform the methods of the arraylist -- Methods.java
* what i was thinking first we will ask give user the menu what he want to do like he want to create an ArrayList. -- Menu.java
* because we will not only learn the concept also making a mini version of small project which mean mini mini  project
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static int index = 0;
    public static void main(String[] args) throws InterruptedException {
        // here we created an array so that we can track our lists created i wanted to use the Arraylist but array is fine for now
        Create[]lists = new Create[10];
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true) {
            showMenu();
            System.out.println("Enter choice:");
            choice = sc.nextInt();
//            System.out.println("check-01");
//            checkInput(choice);
            if (choice > 0) { // it means if the integer is greater than zero
                choiceAction(choice, lists);
            } else if (choice ==0) {
                break; // this is out breaking point of the program if the customer want to exit

            } else {
                System.out.println("Invalid choice.");
            }
//            System.out.println("check -04");
            Thread.sleep(1000);
        }

    }
    // method to decide on the choice
    public static void choiceAction(int choice, Create[] lists) {
//        int sizeOfList = 0;
//        String nameOfList= "ArrayList"; // it is better than null just for the UI
//        ArrayList<String> list = new ArrayList<>();

        // now we do have choice now we will make an actions on it

        // basic scanner
//        System.out.println("check-02");
        Scanner sc = new Scanner(System.in);
        // array for the lists


        switch (choice) {
            // case 0 already declared or covered into the main() function
            // getting an name
            case 1 -> {
                /*System.out.println("Enter the name of your ArrayList:");
                Scanner input = new Scanner(System.in);
               nameOfList = input.nextLine(); // here we will store the name of the list just to show the user
//                System.out.println("Enter the size of your ArrayList:");
//                sizeOfList = input.nextInt(); // why i am asking for it//
//
//                // now we  have to create the list
//                ArrayList userList = new ArrayList();
                System.out.println("Your ArrayList: " + nameOfList + " is created successfully.");*/

                // now we have to call use the Create.java
//                Create userList = new Create();  i dont think so we need to make an object

                // now we will use the Create.java to make an ease i learned it why not to use it.
                System.out.println("Enter the name of the ArrayList: ");
                String name = sc.nextLine();
                lists[index] = new Create(name); // here we created the list and stored the object into the lists
                System.out.println("list is created with the name of " + lists[index].getNameOfList());
                index++;
//                System.out.println("check-03");
            }
            // add()
            case 2 -> {
                System.out.println("Enter the name of the ArrayList you want to add: ");
                String input = sc.nextLine();
                for (int i = 0; i < index; i++) {
                    if (input.equals(lists[i].getNameOfList())) {
                        System.out.println("So, you want to add in the " + lists[i].getNameOfList());
                        System.out.println("Please Enter the element you want to add: ");
                        if (lists[i].add(sc.nextLine())) {
                            System.out.println("Element added successfully in the " + lists[i].getNameOfList());
                            System.out.println();
                            System.out.println();

                            break;
                        }
                    } else {
                        System.out.println("Sorry, we don't have a list at the moment.");
                    }
                }


            }
            // remove the elements
            case 3 -> {
                System.out.println("Enter the name of the ArrayList you want to modify: ");
                String input = sc.nextLine();
                for (int i = 0; i < index; i++) {
                    if (input.equals(lists[i].getNameOfList())) {
                        System.out.println("So, you want to add in the " + lists[i].getNameOfList());
                        System.out.println("Please Enter the element you want to add: ");
                        if (lists[i].remove(sc.nextLine())) {
                            System.out.println("Element removed successfully in the " + lists[i].getNameOfList());
                            System.out.println();
                            System.out.println();

                            break;
                        }
                    } else {
                        System.out.println("Sorry, we don't have a list at the moment.");
                    }
                }
            }
            case 4 -> {
                System.out.println("Enter the name of the ArrayList you want to check:");
                String input = sc.nextLine();
                for (int i = 0; i < index; i++) {
                    if (input.equals(lists[i].getNameOfList())) {
                        System.out.println("Element to check in the " + lists[i].getNameOfList()+": ");
                        if(lists[i].contains(sc.nextLine())){
                            System.out.println("The element is present in the " + lists[i].getNameOfList());
                        }
                        else {
                            System.out.println("The element is not present in the " + lists[i].getNameOfList());
                        }

                    }
                }
            }
            case 5 -> { // here to display the available classses
                System.out.println("Displaying the available lists");
                if(index == 0){
                    System.out.println("There is no list right now.");
                }else{
                    /*for(Create names: lists){
                        System.out.println(names.getNameOfList());
                    }*/ // this is causing an error
                    for(int i = 0; i < index; i++){ // don't use <= index it will give error i wasted 10 min not exactly wasted :)
                        System.out.println(lists[i].getNameOfList());
                    }
                }
            }
        }
    /*public static <T> void checkInput(T input) // here i am creating a generic
    {
        if (input.getClass().isInstance(Integer)) { // it means if the integer is greater than zero
            choiceAction(input);
        }  //this is out breaking point of the program if the customer want to exit

         else {
            System.out.println("Invalid choice.");
        }
    }*/
        // what i was thinking to use the generics so that we can verify what the user is inserting
        // but get failed to nope exactly fail but have to think more how but first i will make my basic model then i will
        // improvise in my project

    }
    public static void showMenu(){
        System.out.println("\n\n");
        System.out.println("Welcome to menu of ArrayList: ");
        System.out.println("0.- to exit.");
        System.out.println("1.- to create the ArrayList.");
        System.out.println("2.- to add the element in the ArrayList.");
        System.out.println("3.- to remove the element from the ArrayList.");
        System.out.println("4.- to check whether the element is present in the ArrayList.");
        System.out.println("5.- to display the lists.");


    }

}

// started coding for this project at the starting of my session. it took long enough me to build the working algorithm
// in the middle i changed the plans because everything was going in my mind which made it slow. next time i will use the paper as well.
// just only case 1 and 2 took timne becasue i was also building logic simultanously


