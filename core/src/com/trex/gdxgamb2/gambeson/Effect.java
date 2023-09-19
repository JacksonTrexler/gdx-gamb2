package com.trex.gdxgamb2.gambeson;

public class Effect {
    String name;
    String[] tags;

    Effect(){

    }

    Effect(String name){
        this.name = name;
    }

    Effect(String name, String[] tags){
        this.name = name;
        this.tags = tags;
    }
}
