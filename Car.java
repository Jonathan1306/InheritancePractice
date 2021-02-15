//this is child class

package com.company;

public class Car extends Vehicle {
    public boolean isMoving;
    public int currentGear;
    public boolean isSteering;

    public Car(boolean isMoving, int currentGear, boolean isSteering) {
        this.isMoving = isMoving;
        this.currentGear = currentGear;
        this.isSteering = isSteering;
    }
    public void changeSpeed(int speed){
        UpdateSpeed(speed);
    }
}
