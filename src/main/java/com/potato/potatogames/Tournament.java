package com.potato.potatogames;

import com.potato.potatogames.entities.Potato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Tournament {

    private Tournament() {
    }

    public static void play(List<Potato> contenders) {
        play(contenders, 1);
    }

    public static void play(List<Potato> contenders, int round) {
        Collections.shuffle(contenders, new Random(System.currentTimeMillis()));
        // partition
        int partition = contenders.size() / 2;
        List<Battle> battles = new ArrayList<>();

        for (int i = 0; i < partition; i++) {
            battles.add(new Battle(contenders.get(i), contenders.get(i + partition)));
        }

        List<Potato> winners = battles.parallelStream().map(Battle::getWinner).collect(Collectors.toList());

        if (winners.size() != 1)
            play(winners, round + 1);

    }

}
