package net.cnam.inf330;

import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Class for implementing the planes operated by the simulation system.
 */
// TODO 3.a) Make Plane an abstract class that implements the IPlane interface
// TODO 6.a) Make Plane an Observable object
// FIXME Implement interface methods
public abstract class Plane implements IPlane
       // , Observable
{

    public static final int MAX_FUEL_CAPACITY = 5;

    private int creationTick;
    private String name;
    private boolean isFlying;
    protected int fuelCapacity;

    //private List<IObserver> observers;

    public Plane(int tick, String name, boolean isFlying, int fuelCapacity) throws InvalidFuelCapacityException {
        if(fuelCapacity < 0) {
            throw new InvalidFuelCapacityException();
        }else{
            this.creationTick = tick;
            this.name = name;
            this.isFlying = isFlying;
            this.fuelCapacity = fuelCapacity;
            //this.observers = new ArrayList<>();
        }
    }

    public void fly() {
        this.fuelCapacity--;
    }

    public void takeOff(int runway) {
        this.isFlying = true;
        System.out.println("Plane taking off from runway " + runway + " : " + this.name);
        //notifyObservers(state);
    }

    public void land(int runway) {
        this.isFlying = false;
        if (this.fuelCapacity == 0)
            System.out.println("Plane landing (emergency) on runway " + runway + " : " + this.name);
        else
            System.out.println("Plane landing on runway " + runway + " : " + this.name);
        //notifyObservers(state);
    }

    public void crash() {
        this.isFlying = false;
        System.out.println("Plane crashing : " + this.name);
        //notifyObservers(state);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCreationTick() {
        return creationTick;
    }

    public void setCreationTick(int creationTick) {
        this.creationTick = creationTick;
    }
/*
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String state) {
        for (IObserver o : observers)
            o.update(state);
    }

 */
}