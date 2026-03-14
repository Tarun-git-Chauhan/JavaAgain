package oopsII;

public class Main {
    public static void main(String[] args) {
        // here we will create the object of the Dod class and then try to call the method of it with the name
      testDog();
      System.out.println();
      testCat();
    }

    public static void testDog(){
        // here we will run this method to sort out the things
        Dog labrador = new Dog("Ricky");
        labrador.aboutMe();
        labrador.eat();
        labrador.sound();
//        labrador.eat();
    }
    public static void testCat(){
        Cat pussy = new Cat("Lucy");
        pussy.aboutMe();
        pussy.eat();
        pussy.sound();
    }

}
