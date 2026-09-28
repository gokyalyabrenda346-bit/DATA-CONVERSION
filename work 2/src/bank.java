import java.util.Scanner;
public class bank {
    static int deposit;
    static int rate;
    static double interest;
    static double total;
    static int wholeInterest;
        public static void calc () {
            Scanner key = new Scanner(System.in);
            System.out.println("Enter deposit");
            deposit = key.nextInt();
            System.out.println("Enter rate");
            rate = key.nextInt();
            interest = deposit * rate;
            total = deposit + interest;
            int wholeInterest = (int) interest;
            String depositAsString = Integer.toString(deposit);}
              public static void report () {
                System.out.println("Deposit: " + deposit);
                System.out.println("Rate: " + rate);
                System.out.println("Interest: " + interest);
                System.out.println("Total: " + total);
                System.out.println("WholeInterest: " + wholeInterest);
        }
        }

