package src.lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        int random1 = random.nextInt(10);
        System.out.println("0 - 9 = " + random1);
    }
}
