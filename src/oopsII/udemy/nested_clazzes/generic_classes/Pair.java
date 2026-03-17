package oopsII.udemy.nested_clazzes.generic_classes;

public class Pair <K,V>{
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    // getters for the private variables
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    // now we print the name and the age of the people registred
    public String aboutKey(){
        return (key+ " is "+value+ " old.");
    }

//    now we will use the main method here
}
