package com.fangych.designpattern.modulemethod;

public class TestCarMaker {

    public static void main(String[] args) {
        CarMaker carMaker=new YueYeCar();
        carMaker.makeCar();

        CarMaker carMaker2=new DaKaCar();
        carMaker2.makeCar();
    }
}
