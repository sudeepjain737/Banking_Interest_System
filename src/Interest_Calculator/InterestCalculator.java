package Interest_Calculator;



import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (n!=4){
            System.out.println("Select the option:");
            System.out.println("1. Interest Calculator –SB");
            System.out.println("2. Interest Calculator –FD");
            System.out.println("3. Interest Calculator –RD");
            System.out.println("4. Exit");
            n = input.nextInt();
            if (n == 1) {
                SbAccount s1 = new SbAccount();
                s1.calculateInterest();
            } else if (n == 2) {
                FdAccount f1 = new FdAccount();
                f1.calculateInterest();
            } else if (n == 3) {
                RdAccount r1 = new RdAccount();
                r1.calculateInterest();
            } else if (n == 4) {
                System.out.println("You have successfully exited");
                break;
            }
            else
                System.out.println("You Entered a invalid Number");
        }
    }
}
