package net.cnam.inf330;

public class InvalidFuelCapacityException extends Exception {
    public InvalidFuelCapacityException(){
        System.out.println("Invalid Fuel Capacity : must be a positive number");
    }
}
