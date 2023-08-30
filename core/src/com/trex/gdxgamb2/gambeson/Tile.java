package com.trex.gdxgamb2.gambeson;

public class Tile {
    String name;
    String[] tags;

    //EffectTrigger[] effectTriggers?


    //For interesting tiles
    public Tile(String name, String[] tags){
        this.name = name;
        this.tags = tags;
    }

    //For bland tiles
    public Tile(String name){
        this.name = name;
    }
}
