package oopsII.udemy.nested_clazzes;
/*Here we will learn abou the nested class from the udemy course we wil be working on the Java core and the spring boot later*/

import java.io.IO;

public class OuterClass {
    // this is the example of the static nested class
    static class NestedClass {
        public void display() {
            System.out.println("Displaying "+ getClass().getSimpleName());
        }
    }
    public void display() {
        System.out.println("Displaying "+ getClass().getSimpleName());
    }

    // now we have to use the nested classs which is not the static
    class InnerClass {
        public void display() {
            System.out.println("Displaying "+ getClass().getSimpleName());
        }
    }
}
