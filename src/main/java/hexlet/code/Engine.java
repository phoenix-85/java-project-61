package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int MAX_ROUNDS = 3;

    public static void game(String question, String[] problems, String[] solutions) {
        Cli.greeting();
        System.out.println(question);

        boolean lose = false;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + problems[i]);
            System.out.print("Your answer: ");
            var answer = new Scanner(System.in).next();

            if (answer.equals(solutions[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + solutions[i] + "'");
                lose = true;
                break;
            }
        }

        if (lose) {
            System.out.println("Let's try again, " + Cli.name + "!");
        } else {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }
}
