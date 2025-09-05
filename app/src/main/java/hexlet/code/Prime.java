package hexlet.code;

import java.util.Random;

import static hexlet.code.Engine.game;

public class Prime {
    private static final int const START_VALUE = 1;
    private static final int const END_VALUE = 100;

    public static void gamePrime() {
        var question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] problems = new String[MAX_ROUNDS];
        String[] solutions = new String[MAX_ROUNDS];

        for (var i = 0; i < MAX_ROUNDS; i++) {
            int num = new Random().nextInt(START_VALUE, END_VALUE);

            String solution;
            if (num < 2) {
                solution = "no";
            } else if (num == 2) {
                solution = "yes";
            } else if (num % 2 == 0) {
                solution = "no";
            } else {
                var isPrime = true;
                for (int j = 3; j < Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                solution = (isPrime) ? "yes" : "no";
            }

            problems[i] = Integer.toString(num);
            solutions[i] = solution;
        }

        game(question, problems, solutions);
    }
}
