package oopsII;

public class Cat extends Animal {
    Cat(String name){
        super(name);
//        type = Cat.class.getSimpleName();
    }
    public void aboutMe(){
        System.out.println("My name is " + name);
        System.out.println("Type: " + getClass().getSimpleName());
    }
    @Override
    public void sound() { // this is a abstract method
        System.out.println("I am meowing ... meow.. meow");
    }
    @Override
    public void eat(){
        System.out.println("I am eating a cat food");
    }

}
