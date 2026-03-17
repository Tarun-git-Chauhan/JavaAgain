package oopsII.udemy.nested_clazzes.generic_classes;

import java.util.Scanner;

public class Main {
    //    here we will check about the generic classes
    public static void main(String[] args) {

        // testing basix Example
//        basicExample();
//        pairsTest();
//        inputAndReturn();

        // testing the bounded generics
        boundedTest();

    }

    public static void basicExample() {
        // checking the BasicExampeClass

        BasicGenericExample<Integer> trial = new BasicGenericExample<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Integer: ");
        if (sc.hasNextInt()) {
            trial.setValue(sc.nextInt());
            System.out.println("Value Stored and displayed with the help of Generic Class: ");
            System.out.println(trial.getValue());
        } else {
            System.out.println("Please enter an integer");
        }
         /*Compiler will throw this kind of error if the user enter the input except than Integer.
        Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at oopsII.udemy.nested_clazzes.generic_classes.Main.main(Main.java:11)


	*/
    }

    static void pairsTest() {
        // Pair.java
        // in this class we have two placeholder K for the key and V for the value
        /*Pair<String,Integer> pair1 = new Pair<>("Happy",23);
        Pair<String,Integer> pair2 = new Pair<>("Tarun",22);
        Pair<String,Integer> pair3 = new Pair<>("Varun",14);
        for(int i =1; i<=3; i++){
            Pair checkpoint = (Pair)"pair"+i;
            System.out.println(checkpoint.aboutKey());
        }*/
        // in this one we will create the arrays
        Pair<String, Integer>[] pairs = new Pair[3];
        pairs[0] = new Pair<>("Happy", 23);
        pairs[1] = new Pair<>("Assu", 22);
        pairs[2] = new Pair<>("Shivam", 24);

        for (Pair<String, Integer> p : pairs) {
            System.out.println(p.aboutKey());

        }
    }

    // checking the InputAndReturn
    public static void inputAndReturn() {
        System.out.println("Enter your Any data: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        InputAndReturn inputAndReturn = new InputAndReturn();
        inputAndReturn.enterData(input);
        inputAndReturn.enterData(100);
        inputAndReturn.enterData(1000.23);

    }

    // testing on the bounded generics
    public static void boundedTest() {
        BoundedGenTest numbers = new BoundedGenTest();
        Scanner input = new Scanner(System.in);


            System.out.println("Enter an four numbers with space befoer pressing enter: ");
//            numbers.printNumbers(input.nextLine()); // this will show me the error :'printNumbers(T)' in 'oopsII.udemy.nested_clazzes.generic_classes.BoundedGenTest' cannot be applied to '(java.lang.String)'
            numbers.printNumbers(input.nextInt());
            numbers.printNumbers(input.nextDouble());
            numbers.printNumbers(input.nextLong());
            numbers.printNumbers(input.nextShort());


    }
}



