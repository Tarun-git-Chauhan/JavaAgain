package oopsII.udemy.nested_clazzes.generic_classes;
// here in this class we will take the input from the user becuase in this class we will
// implement the generic method so that we can understand it.

public class InputAndReturn {
    // first we will declare the genreic method
    // like <T> then take the <T> value and then perform some in returns
    // so the uer can enter anything like Integer,Float,, etc
    public <T> void enterData(T value){
        System.out.println("Entered Data is recieved with the help of the Generic method: ");
        System.out.println(value);
        System.out.println("Type of the data you entered : "+ value.getClass().getSimpleName());
        System.out.println("Thank you :)");
    }
}
