package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String name;

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = new Scanner(System.in).next();
        System.out.println("Hello, " + name + "!");
    }

    public static void congrats() {
        System.out.println("Congratulations, " + name + "!");
    }

    public static void loses() {
        System.out.println("Let's try again, " + name + "!");
    }
}
