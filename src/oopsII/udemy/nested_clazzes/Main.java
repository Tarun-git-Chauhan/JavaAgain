package oopsII.udemy.nested_clazzes;

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass nestedObject = new OuterClass.NestedClass();
        nestedObject.display(); // here we created and display the access of the nested class

        // to use the Inner class we have to use the object of the OuterCLass then through it we have to create an instance

//        OuterClass outerObject = new OuterClass();
//        outerObject.display();
        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass(); // this is new for me where i am learning about the new and new
        innerObject.display();



    }
}
