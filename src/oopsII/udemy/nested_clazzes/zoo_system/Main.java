package oopsII.udemy.nested_clazzes.zoo_system;

// we will only test
public class Main {
    public static void main(String[] args) {
        // testing the static class
        ZooSystem.ZooRules rules = new ZooSystem.ZooRules();
        rules.displayRules();

        // testing the innerclass
        // atleast two animals
        ZooSystem.Animal animal1 = new ZooSystem().new Animal("Lion","Roar");
        ZooSystem.Animal animal2 = new ZooSystem().new Animal("Dog","Bruh");
        // idk i was tryingh to make two object together
        /* with something like
        * Zoosystem.Animal animals = new {
        *   ("Lion","Roar"), ("Dog", "Bruh")
        * }*/

        // making the sound
        animal1.makeSound();
        animal2.makeSound();
        // showing the local class
        ZooSystem zooSystem = new ZooSystem();
        zooSystem.startZooTour();

        // working on the anonymous
        // i have to learn about the anonymous class
        ZooSystem.Show dolphineShow = new ZooSystem.Show() {
            @Override
            public void perform() {
                System.out.println("The dolphin show is starting!");
            }
        };
        dolphineShow.perform();

    }
}
