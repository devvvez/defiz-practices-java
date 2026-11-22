import java.util.Scanner;

public class Cinemaifnest {
    static void main(String[] args) {

        // learning nested if statemnts.
        boolean isStudent;
        boolean isSenior;
        double price = 9.99;

        Scanner checker = new Scanner(System.in);

        System.out.print("Are you a student? ");
        String studentcheck = checker.nextLine().toLowerCase().trim();

        System.out.print("Are you a senior? ");
        String seniorcheck = checker.nextLine().toLowerCase().trim();

        checker.close();

        if (studentcheck.equals("true")){
            isStudent = true;
        } else if (studentcheck.equals("false")) {
            isStudent = false;
        }
        else{
            System.out.println("Something went wrong!");
            isStudent = false;
        }

        if (seniorcheck.equals("true")){
            isSenior = true;
        } else if (seniorcheck.equals("false")) {
            isSenior = false;
        }
        else{
            System.out.println("Something went wrong!");
            isSenior = false;
        }

        if(isStudent){
            if(isSenior){
                System.out.println("You get a student discount of 10%");
                System.out.println("You also get a senior discount of 10%");
                price *= 0.8;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 10%");
                price *= 0.9;
            }
        }

        System.out.printf("the price of a ticket is: $%.2f", price);



    }

}
