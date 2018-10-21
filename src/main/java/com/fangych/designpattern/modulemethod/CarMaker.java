package com.fangych.designpattern.modulemethod;

public class CarMaker {


    public void makeCar(){
        makeCicle();

        makeBody();

        paint();
    }

    public void makeCicle(){
        System.out.println("制造车轮");
    }

    protected  void makeBody(){

    }

    protected void paint(){

    }
}
