import java.util.Scanner;

//learning ternary operators here.

public class tempconv {
    static void main() {

        double temp;
        double newTemp;
        String unit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase().trim();

        scanner.close();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9 / 5) + 32;

        System.out.printf("The temperature is %.2f°%s", newTemp, unit);


    }
}
