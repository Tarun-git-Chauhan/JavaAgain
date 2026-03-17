package oopsII.udemy.nested_clazzes.generic_classes;
// here in this file we will learn about the bounded generics like the InputAndReturn allow anything


public class BoundedGenTest {
    public <T extends Number> void printNumbers(T numbers) {
        System.out.println("The number you entered is " + numbers);
        System.out.println("Type of the number is : "+ numbers.getClass().getSimpleName());
    }
}
