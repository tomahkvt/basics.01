package com.company.java;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

class Bicycle implements Vehicle {

    int speed;
    int gear;
    private static final Logger logger = LogManager.getLogger(Bicycle.class);

    public Bicycle(){
        logger.info("Created Bicycle");
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
        logger.info("Set gear = " + gear);
    }

    public void setSpeed(int speed) {

        this.speed = speed;
        logger.info("Set speed = " + gear);
    }


    // to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
        logger.info("Speed up = " + increment);
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
        logger.info("Applied brakes = " + decrement);
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

    public int getSpeed() {
        return this.speed;
    }
}
