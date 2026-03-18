package oopsII.udemy.nested_clazzes.generic_classes.lazy_day;

class Pair<T,U> {
    // must include:
    // two variables
    // constructor
    // getters
    private T value; // names
    private U valueTwo; // age
    public Pair(T value, U valueTwo) {
        this.value = value;
        this.valueTwo = valueTwo;
    }
    public T getValue() {
        return value;
    }
    public U getValueTwo() {
        return valueTwo;
    }
    // now we want to print the pairs but this time i don't want to use any method i want to override the toStrign
    @Override
    public String toString() {
        return ("Name: "+ value+ " and age is : " + valueTwo);
    }


}
