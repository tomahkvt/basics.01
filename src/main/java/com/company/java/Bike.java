package com.company.java;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


class Bike implements Vehicle {
    private static final Logger logger = LogManager.getLogger(Bike.class);
    private int speed;
    private int gear;

    public Bike(){
        logger.info("Created Bike");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        logger.info("Set speed = " + speed);
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
        logger.info("Set gear = " + gear);
    }

    // to change gear
    @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){

        speed = speed + increment;
        logger.info("Speed up = " + increment);
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;
        logger.info("Applied brakes = " + decrement);
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}
