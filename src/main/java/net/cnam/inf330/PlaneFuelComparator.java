package net.cnam.inf330;

import java.util.Comparator;

public class PlaneFuelComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

    public Plane compare(Plane plane1, Plane plane2) {
        if (plane1.getFuelCapacity() > plane2.getFuelCapacity())
            return plane2;
        else
            return plane1;
    }


}
