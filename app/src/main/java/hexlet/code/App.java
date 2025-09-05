package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Calc.gameCalc;
import static hexlet.code.Cli.greeting;
import static hexlet.code.Even.gameEven;
import static hexlet.code.Gcd.gameGCD;
import static hexlet.code.Prime.gamePrime;
import static hexlet.code.Progression.gameProgression;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        var choice = new Scanner(System.in).nextInt();

        switch (choice) {
            case 1 -> greeting();
            case 2 -> gameEven();
            case 3 -> gameCalc();
            case 4 -> gameGCD();
            case 5 -> gameProgression();
            case 6 -> gamePrime();
            default -> {}
        }

    }
}
