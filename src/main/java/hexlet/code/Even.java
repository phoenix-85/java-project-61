package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Cli.*;

public class Even {
    public static void gameEven() {
        greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        boolean lose = false;

        for (var i = 1; i <= 3; i++) {
            var num = new Random().nextInt(99) + 1;
            System.out.println("Question: " + num);
            var answer = new Scanner(System.in).next();
            var rightAnswer = num % 2 == 0 ? "yes" : "no";
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                lose = true;
                break;
            }
        }

        if (lose) {
            loses();
        } else {
            congrats();
        }
    }
}
