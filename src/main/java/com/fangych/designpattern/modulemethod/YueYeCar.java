package com.fangych.designpattern.modulemethod;

public class YueYeCar extends CarMaker {

    @Override
    public  void makeBody(){
        System.out.println("制造越野车车身");
    }


    @Override
    public void paint(){
        System.out.println("越野车喷漆");
    }
}
