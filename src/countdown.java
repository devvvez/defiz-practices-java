import java.util.Scanner;

public class countdown {
    static void main(String[] args) throws InterruptedException {

        // learning the for loop

        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to start the countdown? ");

        int amount = scanner.nextInt();

        scanner.close();

        for(int i = amount; i >= 1; i--) {
            System.out.printf("%d seconds left.\n", i);
            Thread.sleep(1000);
        }
        System.out.println("Time's over!");
    }
}
