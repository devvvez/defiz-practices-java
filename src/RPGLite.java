import java.util.Scanner;
import java.util.Random;

// my first game! :D

public class RPGLite {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static void main() {

        int choice;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("*****************");
            System.out.println("Choose the option");
            System.out.println("*****************");
            System.out.println("*1. Start.      *");
            System.out.println("*2. Info.       *");
            System.out.println("*3. Quit.       *");
            System.out.println("*****************");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Starting...");
                    startGame();
                }
                case 2 -> {
                    System.out.println("informing you...");
                    inform();
                }
                case 3 -> {
                    System.out.println("Quitting...");
                    isRunning = false;
                }
                default -> System.out.println("Something went wrong!");
            }
        }
    }
    static void inform(){
        System.out.println("*****************");
        System.out.println("Ingame mechanics");
        System.out.println("Both you an your enemy have 90-110 health.");
        System.out.println("healing potion heals 30-50 health.");
        System.out.println("You make 20-40 damage.");
    }
    static void startGame(){
        int enemyHealth = random.nextInt(90, 111);
        int playerHealth = random.nextInt(90, 111);
        int healing = random.nextInt(30, 51);
        gameItself(enemyHealth, playerHealth, healing);
    }
    // holy spaghetti code :sob:
    static void gameItself(int enemyHealth, int playerHealth, int healing){

        boolean isBattling = true;

        while(enemyHealth > 0 && playerHealth > 0 && isBattling){

            int damage = random.nextInt(20,41);

            System.out.println("$$$$$$$$$$$$$$$$$");
            System.out.println("Choose the option");
            System.out.println("$1. Attack      $");
            System.out.println("$2. Heal        $");
            System.out.println("$3. Quit        $");
            System.out.println("$$$$$$$$$$$$$$$$$");
            System.out.println("Stats");
            System.out.printf("Your health %d\n", playerHealth);
            System.out.printf("Enemy health %d\n", enemyHealth);
            System.out.println("$$$$$$$$$$$$$$$$$");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> {
                    enemyHealth -= damage;
                    System.out.printf("You have attacked the Goblin! Goblin health: %d\n", enemyHealth);
                }
                case 2 -> {
                    playerHealth += healing;
                    System.out.printf("You have healed! Your health: %d\n", playerHealth);
                }
                case 3 -> {
                    isBattling = false;
                }
                default -> System.out.println("Something went wrong!");
            }

            if(enemyHealth <= 0){
                System.out.println("GGs! You won.");
            }
            else if(playerHealth <= 0){
                System.out.println("Better luck next time.");
            }

            if(!isBattling){
                break;
            }
            if(enemyHealth > 0) {
                playerHealth -= damage;
                System.out.printf("Goblin attacks you! Your health is %d\n", playerHealth);
            }
        }


    }

}
