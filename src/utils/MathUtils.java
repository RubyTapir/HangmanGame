package utils;

import java.util.Random;

public class MathUtils {
    public static int generateRandomNumber(int maxRange) {
        Random rand = new Random();

        return  rand.nextInt(maxRange);

    }
}
