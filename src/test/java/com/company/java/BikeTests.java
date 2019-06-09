package com.company.java;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class BikeTests {

    @Test
    public void TestBikeGear() {
        Bike bike = new Bike();
        bike.setGear(5);
        assertEquals(5, bike.getGear());
    }

    @Test
    public void TestBikeSpeed() {
        Bike bike = new Bike();

        bike.setSpeed(5);
        assertEquals(5, bike.getSpeed());
        bike.speedUp(2);
        assertEquals(7, bike.getSpeed());
        bike.applyBrakes(2);
        assertEquals(5, bike.getSpeed());
    }
}