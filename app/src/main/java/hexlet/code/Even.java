package hexlet.code;

import java.util.Random;

import static hexlet.code.Engine.game;

public class Even {
    private static final int const START_VALUE = 1;
    private static final int const END_VALUE = 99;

    public static void gameEven() {
        var question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] problems = new String[MAX_ROUNDS];
        String[] solutions = new String[MAX_ROUNDS];

        for (var i = 0; i < MAX_ROUNDS; i++) {
            int num = new Random().nextInt(START_VALUE, END_VALUE);
            problems[i] = Integer.toString(num);
            solutions[i] = (num % 2 == 0) ? "yes" : "no";
        }

        game(question, problems, solutions);
    }
}
