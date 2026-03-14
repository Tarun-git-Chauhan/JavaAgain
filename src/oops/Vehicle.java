package oops;

class Vehicle {
    String name;
    int passengers = 0; // number of passengers
    int fuelCap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon
    // creating the constructor because i want to print the name in the print statement
    Vehicle(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
// t