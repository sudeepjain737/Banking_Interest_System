package Interest_Calculator;

import java.util.Scanner;

public class SbAccount extends Account{
    double interestRate;
    double amount;
    String AccountType;
    int c = 0;
    public void calculateInterest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial amount:");
        amount = input.nextDouble();
        input.nextLine();
        System.out.println("1. Press 1 for NRI");
        System.out.println("2. Press 2 for NORMAL");
        int n = input.nextInt();
        if (amount < 0) {
            System.out.println("You entered invalid amount");
            c = 1;
        } else {
            if (n == 1) {
                interestRate = 6.00;
            } else if (n == 2) {
                interestRate = 4.00;
            } else {
                System.out.println("You entered invalid option");
                c = 1;
            }
        }
        if (c == 0) {
            System.out.println("Interest gained is:" + (amount * interestRate) / 100);
        }
    }
}
