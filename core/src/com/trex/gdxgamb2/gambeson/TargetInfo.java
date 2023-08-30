package com.trex.gdxgamb2.gambeson;


public class TargetInfo {
    String name;
    Unit sender;
    Unit reciever;

    public TargetInfo(){

    }

    public TargetInfo(String name, Unit sender, Unit reciever){
        this.name = name;
        this.sender = sender;
        this.reciever = reciever;
    }
}


