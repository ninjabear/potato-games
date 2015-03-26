package com.potato.potatogames.entities;

public class Potato {

    private int hp, atk;
    private String name;

    public Potato(int hp, int atk, String name) {
        this.hp = hp;
        this.atk = atk;
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return getName();
    }


}
