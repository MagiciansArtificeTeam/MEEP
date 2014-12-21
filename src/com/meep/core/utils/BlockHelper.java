package com.meep.core.utils;

import java.util.Random;

/**
 * Created by James on 21/12/2014.
 */
public class BlockHelper {
    public static String[] BLOCKSIDES = new String[] {"Bottom", "Top", "North", "South", "West", "East"};
    public static String[] OPP_BLOCKSIDES = new String[] {"Top", "Bottom", "South", "North", "East", "West"};

    public static int random(int maxValue) {
        int random = 0;
        do {
            Random rand = new Random();
            random = rand.nextInt(maxValue);
        } while (random == 0);
        return random;
    }
}
