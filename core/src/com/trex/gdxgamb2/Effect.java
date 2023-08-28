package com.trex.gdxgamb2;

public class Effect {
    String name;
    String[] tags;

    Effect(String name){
        this.name = name;
    }

    Effect(String name, String[] tags){
        this.name = name;
        this.tags = tags;
    }
}
