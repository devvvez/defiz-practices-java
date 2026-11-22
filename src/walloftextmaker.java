
//learning nested loops in java

import java.util.Scanner;

public class walloftextmaker {
    static void main() {

        int rows;
        int columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol ");
        symbol = scanner.next().charAt(0);

        scanner.close();

        for (int j = 0; j < rows; j++) {
            System.out.println();
            for(int i = 0; i < columns; i++){
                System.out.print(symbol);
            }
        }

    }
}
