package Interest_Calculator;

import java.util.Scanner;

public class FdAccount {
    double interestRate;
    double amount;
    int noOfDays;
    int ageOfACHolder;
    double general;
    double senior_citizen;
    int c = 1;
    public void calculateInterest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial amount:");
        amount = input.nextDouble();
        input.nextLine();
        System.out.print("Enter No. of days:");
        noOfDays = input.nextInt();
        System.out.print("Enter age of account holder:");
        ageOfACHolder = input.nextInt();
        if(amount<0){
            System.out.println("You entered invalid amount");
            c=0;
        }
        else {


            if (amount < 10000000) {
                if(noOfDays<=0){
                    System.out.println("You entered invalid number of days");
                    c=0;
                }
                else {
                    if (noOfDays >= 7 && noOfDays <= 14) {
                        general = 4.50;
                        senior_citizen = 5.00;
                    } else if (noOfDays >= 15 && noOfDays <= 29) {
                        general = 4.75;
                        senior_citizen = 5.25;
                    } else if (noOfDays >= 30 && noOfDays <= 45) {
                        general = 5.50;
                        senior_citizen = 6.00;
                    } else if (noOfDays >= 46 && noOfDays <= 60) {
                        general = 7.00;
                        senior_citizen = 7.50;
                    } else if (noOfDays >= 61 && noOfDays <= 184) {
                        general = 7.50;
                        senior_citizen = 8.00;
                    } else if (noOfDays >= 185 && noOfDays <= 365) {
                        general = 8.00;
                        senior_citizen = 8.50;
                    }
                    if(ageOfACHolder<=0){
                        System.out.println("You entered invalid age");
                        c=0;
                    }
                    else {
                        if (ageOfACHolder < 60) {
                            interestRate = general;
                        } else {
                            interestRate = senior_citizen;
                        }
                    }
                }
            }
            else {
                if (noOfDays >= 7 && noOfDays <= 14) {
                    interestRate = 6.50;
                }
                if (noOfDays >= 15 && noOfDays <= 29) {
                    interestRate = 6.75;
                }
                if (noOfDays >= 30 && noOfDays <= 45) {
                    interestRate = 6.75;
                }
                if (noOfDays >= 46 && noOfDays <= 60) {
                    interestRate = 8.00;
                }
                if (noOfDays >= 61 && noOfDays <= 184) {
                    interestRate = 8.50;
                }
                if (noOfDays >= 185 && noOfDays <= 365) {
                    interestRate = 10.00;
                }
            }
            if(c == 1) {
                System.out.println("Interest gained is:" + (amount * interestRate) / 100);
            }
        }
    }
}
