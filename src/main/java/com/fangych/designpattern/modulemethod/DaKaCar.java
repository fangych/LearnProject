package com.fangych.designpattern.modulemethod;

public class DaKaCar  extends CarMaker{

    @Override
    public  void makeBody(){
        System.out.println("制造大卡车车身");
    }

    @Override
    public  void paint(){
        System.out.println("大卡车喷漆");
    }
}
