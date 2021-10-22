package Interest_Calculator;

import java.util.Scanner;

public class RdAccount extends Account{
    double interestRate;
    double amount;
    int noOfMonths;
    double monthlyAmount;
    int age;
    double general;
    double senior_citizen;
    int c = 1;
    public void calculateInterest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial amount:");
        amount = input.nextDouble();
        System.out.print("Enter No. of months:");
        noOfMonths = input.nextInt();
        System.out.print("Enter age of account holder:");
        age = input.nextInt();
        if(amount < 0){
            System.out.println("You entered invalid amount");
            c = 0;
        }
        else {
            if (noOfMonths < 0) {
                System.out.println("You entered invalid number of months");
                c = 0;
            } else {
                if (noOfMonths >= 0 && noOfMonths <= 6) {
                    general = 7.50;
                    senior_citizen = 8.00;
                } else if (noOfMonths >= 7 && noOfMonths <= 9) {
                    general = 7.75;
                    senior_citizen = 8.25;
                } else if (noOfMonths >= 10 && noOfMonths <= 12) {
                    general = 8.00;
                    senior_citizen = 8.50;
                } else if (noOfMonths >= 13 && noOfMonths <= 15) {
                    general = 8.25;
                    senior_citizen = 8.75;
                } else if (noOfMonths >= 16 && noOfMonths <= 18) {
                    general = 8.50;
                    senior_citizen = 9.00;
                } else if (noOfMonths >= 22) {
                    general = 8.75;
                    senior_citizen = 9.25;
                }
            }
            if(age <= 0){
                System.out.println("You entered invalid age");
                c = 0;
            }
            else {
                if (age < 60) {
                    interestRate = general;
                }
                else {
                    interestRate = senior_citizen;
                }
            }
        }
        if (c == 1) {
            System.out.println("Interest gained is:" + (amount * interestRate) / 100);
        }
    }

}
