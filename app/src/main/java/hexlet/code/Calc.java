package hexlet.code;

import java.util.Random;
import java.util.StringJoiner;

import static hexlet.code.Engine.game;

public class Calc {
    private static final int const START_VALUE = 1;
    private static final int const END_VALUE = 100;

    public static void gameCalc() {
        var question = "What is the result of the expression?";
        String[] problems = new String[MAX_ROUNDS];
        String[] solutions = new String[MAX_ROUNDS];

        String[] operators = {"+", "-", "*"};

        for (var i = 0; i < MAX_ROUNDS; i++) {
            int num1 = new Random().nextInt(START_VALUE, END_VALUE);
            int num2 = new Random().nextInt(START_VALUE, END_VALUE);
            String operator = operators[new Random().nextInt(operators.length)];

            problems[i] = new StringJoiner(" ")
                    .add(Integer.toString(num1))
                    .add(operator)
                    .add(Integer.toString(num2))
                    .toString();


            solutions[i] = String.valueOf(switch(operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                default -> num1 * num2;
            });
        }

        game(question, problems, solutions);
    }
}
