package net.cnam.inf330;

import javafx.beans.InvalidationListener;

public class BigPlane extends Plane {
    public BigPlane(int tick, String name, boolean isFlying, int fuelCapacity) throws InvalidFuelCapacityException {
        super(tick, name, isFlying, fuelCapacity);
    }

    @Override
    public void fly() {
        this.fuelCapacity-=2;
    }
/*
    @Override
    public void addListener(InvalidationListener invalidationListener) {

    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {

    }
    */
}
