package com.company.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleTests {

    @Test
    public void TestBicycleGear() {
        Bicycle bicycle = new Bicycle();
        bicycle.setGear(5);
        assertEquals(5, bicycle.getGear());
    }

    @Test
    public void TestBicycleSpeed() {
        Bicycle bicycle = new Bicycle();

        bicycle.setSpeed(5);
        assertEquals(5, bicycle.getSpeed());
        bicycle.speedUp(2);
        assertEquals(7, bicycle.getSpeed());
        bicycle.applyBrakes(2);
        assertEquals(5, bicycle.getSpeed());
    }
}