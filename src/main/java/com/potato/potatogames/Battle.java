
package com.potato.potatogames;

import com.potato.potatogames.entities.Potato;

public class Battle {
    
    private Potato a, b;

    public Battle(Potato a, Potato b) {
        this.a = a;
        this.b = b;
    }   
    
    public Potato getWinner()
    {
        return a;
    }
    
    
}
