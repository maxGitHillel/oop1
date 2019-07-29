package com.hillel.oop;

public class TestWatch {

    public static void main(String[] args) {
        ElectricWatch electricWatch = new ElectricWatch(100, 100, "casio");

        Battery battery = new DischargeBattery(5, 5, "varta" ,10);
        electricWatch.setBattery(battery);

        electricWatch.run();

        System.out.println(electricWatch.getTime());

    }
}
