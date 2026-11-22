import java.util.Scanner;

// compound interest calculator
//learning some basic math in java.

public class compoundinterest {
    static void main(String[] args) {

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        Scanner infograb = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        principal = infograb.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        rate = infograb.nextDouble() / 100;

        System.out.print("Enter how many times compounded per year: ");
        timesCompounded = infograb.nextInt();

        System.out.print("Enter the # years : ");
        years = infograb.nextInt();

        infograb.close();

        amount = principal*Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d year(s) is: $%.1f", years, amount);
    }
}
