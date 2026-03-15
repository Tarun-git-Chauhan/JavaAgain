package oopsII.clazzes;


public class Dog extends Animal {


    public Dog(String name) {
       super(name);
//       type = Dog.class.getSimpleName();
    }
    public void aboutMe(){
        System.out.println("My name is : "+name);
        System.out.println("Type: "+ getClass().getSimpleName());
//        super.eat(); // I am using the super keyword so that i know-- I am using the method from the superclass.
    }
    @Override
    public void eat(){
        System.out.println("I am eating a dog food");
    }

    @Override
    public void sound() {
        System.out.println("I am barking .... Buh Buh");
    }

    // now we will learn about that dog can fly or not.



}
