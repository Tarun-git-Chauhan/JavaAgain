package oopsII.udemy.nested_clazzes.generic_classes.lazy_day;
/*17 march,2026
* today we have a light day so we will read some thoery and now we will work on the topic we did it yesterday which was generics
*
* Task -01 : generic Class*/

class Box<T>{
    private T value;
    public Box(T value){
        this.value = value;
    }
    // getter and setters
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
