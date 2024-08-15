package org.example.solid_principles.SRP.violation;


// Multiple responsibilities. Violating the SRP
public abstract class Automobile {
    // 1- its clearly that the Automobile is responsible for starting and stopping itself
    public abstract void start();
    public abstract void stop();

    // 2- An automobile is not responsible for changing its own tires, washing itself, or
    //    checking its own oil
    public abstract void changeTires();
    public abstract void wash();
    public abstract void checkOil();

    // 3- this one is tricky, it is the responsibility of the (driver) to drive the automobile
    public abstract void drive();

    // 4- We must think that does the method getOil really mean
    //  - The getting the oil is something that the automobile should do
    public abstract int getOil();

}
