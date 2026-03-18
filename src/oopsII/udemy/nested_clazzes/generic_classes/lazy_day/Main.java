package oopsII.udemy.nested_clazzes.generic_classes.lazy_day;

import java.util.ArrayList;
import java.util.List;

// 17 march 2026
public class Main {
    public static void main(String[] args) {
        final int run = 2;
        switch (run) {
            case 1:
                testBox();
                break;
            case 2:
                testPair();
                break;
        }
    }
    static void testBox(){
        Box<Integer> boxSize = new Box<>(23); // here we created the object in the integer
        Box<String> boxName = new Box<>("Tuesday"); // here we created object in the string format

        // now testing
        System.out.println("The box size is " + boxSize.getValue());
        // now i want to change the value of the box size
        boxSize.setValue(46);
        System.out.println("The box new size is " + boxSize.getValue());

        // now we will touch the name of hte box
        System.out.println("The box name is " + boxName.getValue());
        // now we will change
        boxName.setValue("Monday");
        System.out.println("The box new name is " + boxName.getValue());
    }
    static void testPair(){
        // we test the Pair with one String and their age but i am thinking to use the arrays to modify the basics
        String[] names = {"Happy","Assu","Vandana","Shivam","Khushi","Anee","Nikki","Vani"};
        Integer[] ages = {22,21,23,23,22,17,9,13};
        List<Pair<String,Integer>> pairs = new ArrayList<>();
        // now we have the inputs so we will run them into the Pair
        // also i am thinking can we use the foreach loop even though i like the for loop normal but i am just curious;
        // like can we declare two variable with respect to each array but in the same statement
        /*for((String name: names) && (Integer age: ages){
            Pair<String,Integer>
        }
            // i am setting the setters for it because you didnt ask for but i wasnt to add
            // but we need the List concept which we know but hven't done in the learning so we will not use it
            // i used the safari to get the syntax for the Lists

        * */
        for(int i = 0; i < names.length; i++){
//            Pair<String,Integer> pair = new Pair<>(names[i],ages[i]); // here we go
            pairs.add(new Pair<>(names[i],ages[i]));
        }
        System.out.println("The pairs are " );
        for(Pair<String,Integer> pair : pairs){
//            System.out.println(pair.toString()); // java already call the toString
            System.out.println(pair);
        }
    }
}
