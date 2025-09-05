package hexlet.code;

import java.util.Random;
import java.util.StringJoiner;

import static hexlet.code.Engine.game;

public class Progression {
    private static final int const START_VALUE = 1;
    private static final int const END_VALUE = 99;
    private static final int const START_INCREMENT_VALUE = 1;
    private static final int const END_INCREMENT_VALUE = 9;
    private static final int const MIN_PROGRESSION_LENGTH = 5;
    private static final int const MAX_PROGRESSION_LENGTH = 11;

    public static void gameProgression() {
        var question = "What number is missing in the progression?";
        String[] problems = new String[MAX_ROUNDS];
        String[] solutions = new String[MAX_ROUNDS];

        for (int i = 0; i < MAX_ROUNDS; i++) {
            int num = new Random().nextInt(START_VALUE, END_VALUE);
            int inc = new Random().nextInt(START_INCREMENT_VALUE, END_INCREMENT_VALUE);
            int len = new Random().nextInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int index = new Random().nextInt(len);

            var str = new StringJoiner(" ");
            for (int j = 0; j < len; j++) {
                if (j == index) {
                    str.add("..");
                } else {
                    str.add(Integer.toString(num + j * inc));
                }
            }

            problems[i] = str.toString();
            solutions[i] = Integer.toString(num + index * inc);
        }

        game(question, problems, solutions);
    }
}
