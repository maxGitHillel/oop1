package com.hillel.oop;

public class DischargeBattery extends Battery implements Dischargeable{
    public DischargeBattery(int width, int height, String name, int capacity) {
        super(width, height, name, capacity);
    }

    @Override
    public int getCharge(int value) {
        return 0;
    }
}
