import java.util.Scanner;

// learning if-else here.
public class weightconverter {
    static void main() {

        double weight;
        double newWeight;
        String stringChoice;
        int choice;

        System.out.println("Weight conversion program.");
        System.out.println("======================");
        System.out.println("1: Convert lbs to kgs.");
        System.out.println("2: Convert kgs to lbs");
        System.out.println("======================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose an option ");
        stringChoice = scanner.nextLine();

        if(stringChoice.equals("1")){
            choice = 1;
        } else if (stringChoice.equals("2")) {
            choice = 2;
        }
        else{
            choice = 3;
        }


        if(choice == 1){
            System.out.print("enter the weight in lbs. ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in kgs: %.2f", newWeight);

        } else if (choice == 2) {
            System.out.print("enter the weight in kgs. ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in lbs: %.2f", newWeight);

        }
        else if(choice == 3){
            System.out.println("Something went wrong!");
        }

        scanner.close();
    }
}