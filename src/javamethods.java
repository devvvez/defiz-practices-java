// learning java methods!!!

import java.util.Scanner;

public class javamethods{
    static void main() {

        String firstName;
        String lastName;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your first name? ");
        firstName = scanner.nextLine().trim();

        System.out.print("What's your last name? ");
        lastName = scanner.nextLine().trim();

        scanner.close();

        System.out.println("Your full name is: " + namegiver(firstName, lastName));

    }
    static String namegiver(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}