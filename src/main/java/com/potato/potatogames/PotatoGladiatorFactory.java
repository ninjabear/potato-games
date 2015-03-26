package com.potato.potatogames;

import com.potato.potatogames.entities.Potato;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PotatoGladiatorFactory {

    private PotatoGladiatorFactory() {
    }

    public static List<Potato> getSomePotatoGladiators(int tot) {
        ArrayList<Potato> potatoes = new ArrayList<>();
        for (int i = 0; i < tot; i++) {
            potatoes.add(newPotato());
        }

        return potatoes;
    }

    private static Potato newPotato() {
        Random generator = new Random();
        int hp = generator.nextInt(100);
        int atk = generator.nextInt(100);
        String name = PotatoNameFactory.generatePotatoName();
        Potato p = new Potato(hp, atk, name);

        return p;
    }

}
