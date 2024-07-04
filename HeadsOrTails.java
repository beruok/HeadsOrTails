import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Who are you?\n> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("Tossing a coin...");

        for (int i = 1; i <= 3; i++) {
            boolean isHeads = random.nextBoolean();
            String result = isHeads ? "Heads" : "Tails";
            System.out.println("Round " + i + ": " + result);

            if (isHeads) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);

        if (headsCount > tailsCount) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost!");
        }
    }
}
