package oopsII;
/* 14 March 2026;
Here we will learn about the Java Inheritance:
* Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.

The new class that is created is known as subclass (child or derived class) and the existing class from where the child
 class is derived is known as superclass (parent or base class).

The extends keyword is used to perform inheritance in Java.
*
* */


public abstract class Animal {
    protected String name;
    protected String type;
    Animal(String name) {
        this.name = name;
    }


    public void eat(){
        System.out.println("eating....");
    }
    public abstract void sound();
//        System.out.println("making sound ...");
//        // so this method we will use to override becasue different animal different sounds
        /*I am making ths method abstract so that it is compulasary method*/

}
