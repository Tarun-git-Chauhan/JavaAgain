package oopsII.udemy.nested_clazzes.zoo_system;
/*
Java Practice Problem — Nested Classes Playground
Create a program called ZooSystem.
The goal is to practice:
Static Nested Class
Inner Class
Local Class
Anonymous Class
*
* */
public class ZooSystem {
    // static Nested Class
    static class ZooRules{
        // method to display the Rules
        void displayRules(){
            System.out.println("""
                    Zoo Rules:
                    1. Do not feed animals
                    2. Keep the environment clean
                    
                    """);
        }
    }

    // creating an innerclass
    class Animal{
        private String name;
        private String sound;
        Animal(String name, String sound){
            this.name = name;
            this.sound = sound;
        }
        void makeSound(){
            System.out.println(name+" says "+ sound);
        }
    }

    // now creating a localClass
    void startZooTour(){
        // creating a local class
        class TourGuide{
            void giveIntroduction(){
                System.out.println("Welcom to Tarun's Zoo! Enjoy the tour.");
            }
        }
        TourGuide tourGuide = new TourGuide();
        tourGuide.giveIntroduction();
    }

    // now we will make the anonymous class
    interface Show{
        void perform();

    }
}
