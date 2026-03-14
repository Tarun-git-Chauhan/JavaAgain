package oops;

//this class declares and object of type Vehicles
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle("minivan");
        int range;

        // assign values to fields in minivan
//        minivan.passengers = 5;
//        minivan.fuelCap = 100;
//        minivan.mpg = 21;
//
//        // compute the range assuming a full tank of gas
//        range = minivan.fuelCap * minivan.mpg;
//        System.out.println("Minivan can carry "+ minivan.passengers+" passengers with the fuel range of "+ range);
        
        // now we will check whether the intanceof feature of the java
        checkInstance(minivan, Vehicle.class);


    }
    public static void checkInstance(Object obj, Class<?> clazz){
        System.out.println("Here we will check if the "+  obj +" is the object of the " +clazz.getSimpleName());
        if(clazz.isInstance(obj))
        {
            System.out.println(obj+" is the object of "+clazz.getSimpleName()+" class");
        }
        else
        {
            System.out.println(obj+" is not the object of "+clazz.getSimpleName()+" class ");
        }
    }
}
