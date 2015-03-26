package com.potato.potatogames;


import java.util.Random;

public class PotatoNameFactory {

    private PotatoNameFactory() {
    }

    public static String generatePotatoName() {
        return "Jarvis #" + new Random().nextInt();  // TODO make better
    }

}
