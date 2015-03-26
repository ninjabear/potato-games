package com.potato.potatogames;

import com.potato.potatogames.entities.Potato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Battle {

    private Potato a, b;

    public Battle(Potato a, Potato b) {
        this.a = a;
        this.b = b;
    }

    public Potato getWinner() {

        List<Potato> p = new ArrayList<Potato>();
        p.add(a);
        p.add(b);

        Collections.shuffle(p);

        Potato first = p.get(0);
        Potato second = p.get(1);

        int firstHp = first.getHp(),
                secondHp = second.getHp();

        boolean firstWins = false;

        for(;;) {
            secondHp -= first.getAtk();

            if (secondHp<=0)
            {
                return first;
            }

            firstHp -= second.getAtk();

            if (firstHp<=0)
            {
                return second;
            }
        }
    }


}
