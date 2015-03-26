package com.potato.potatogames;

import com.potato.potatogames.entities.Potato;

import java.util.List;

public class Main {

    public static void usage() {
        System.out.println("Usage; app <potato count>");
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            usage();
            System.exit(1);
        } else if (args[0].matches("\\d+") == false) {
            System.out.println("Confused potato. Aborting");
            usage();
            System.exit(1);
        } else if (Integer.valueOf(args[0]) % 2 != 0) {
            System.out.println("Odd numbers of potatoes: " + args[0]);
            usage();
            System.exit(1);
        }

        // all good

        System.out.println("Potato Royale\n");


        List<Potato> players = PotatoGladiatorFactory.getSomePotatoGladiators(Integer.valueOf(args[0]));

        Tournament.play(players);
    }

}
