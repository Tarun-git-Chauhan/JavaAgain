package oopsII.udemy.nested_clazzes.generic_classes;
/* 16-03-2026
* here we will try to use the basic generic classes example*/

public class BasicGenericExample <T>{
    T value;
    // we can try to ask use to enter the number again

    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }

}

