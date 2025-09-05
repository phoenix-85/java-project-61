package hexlet.code;

import java.util.Random;

import static hexlet.code.Engine.*;

public class Gcd {
    private static final int START_VALUE = 20;
    private static final int END_VALUE = 79;

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b,a % b);
    }

    public static void gameGCD() {
        var question = "Find the greatest common divisor of given numbers.";
        String[] problems = new String[MAX_ROUNDS];
        String[] solutions = new String[MAX_ROUNDS];

        for (int i = 0; i < MAX_ROUNDS; i++) {
            int num1 = START_VALUE + new Random().nextInt(END_VALUE);
            int num2 = START_VALUE + new Random().nextInt(END_VALUE);
            problems[i] = num1 + " " + num2;

            solutions[i] = String.valueOf(gcd(num1, num2));
        }

        game(question, problems, solutions);
    }
}
