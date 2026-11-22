import java.util.Scanner;
import java.util.Random;

public class guessnumber {
    static void main() {

        int randomnum = 0;
        int guess = 0;
        int attempts = 0;
        boolean showHints = true;

        Random rannum = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("The number guessing game! :D");
        System.out.println("============================");
        System.out.print("What level do you choose? 1 - 10 / 2 - 25 / 3 - 50\n");
        System.out.print("It's 2 by default. ");
        String level = scanner.nextLine().trim();

        System.out.print("Show hints? [Y/n] ");
        String answer = scanner.nextLine().trim().toLowerCase();
        showHints = !answer.equals("n");

        switch(level){
            case "1" -> randomnum = rannum.nextInt(1, 11);

            case "3" -> randomnum = rannum.nextInt(1, 51);

            default -> randomnum = rannum.nextInt(1, 26);
        }


        while (guess != randomnum){

            System.out.print("Guess a number. ");
            guess = scanner.nextInt();
            attempts++;

            if(showHints){
                if(guess > randomnum){
                    System.out.println("Your guess is too high!");
                }
                else if(guess < randomnum){
                    System.out.println("Your guess is too low!");
                }
            }
        }
        scanner.close();

        System.out.println("Congrats! you won.");
        System.out.printf("It took you %d attempts", attempts);

    }
}