import java.util.Scanner;

//learning string methods.

public class Emailthing {
    static void main(String[] args) {

        String email;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your email: ");
        email = scanner.nextLine().trim();

        scanner.close();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.printf("Your email is %s\n", email);
            System.out.printf("Your username is %s\n", username);
            System.out.printf("Your domain is %s", domain);
        }
        else{
            System.out.println("You don't have @ in your email address!");
        }

    }
}