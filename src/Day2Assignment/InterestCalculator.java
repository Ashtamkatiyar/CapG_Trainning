package Day2Assignment;


import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nSelect the option:");
            System.out.println("1. Interest Calculator –SB");
            System.out.println("2. Interest Calculator –FD");
            System.out.println("3. Interest Calculator –RD");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.println("Enter the Average amount:");
                        double sbAmount = sc.nextDouble();
                        System.out.println("Enter account type (Normal/NRI):");
                        String type = sc.next();
                        SBAccount sb = new SBAccount(sbAmount, type);
                        System.out.println("Interest gained: Rs. " + sb.calculateInterest());
                        break;

                    case 2:
                        System.out.println("Enter the FD amount:");
                        double fdAmount = sc.nextDouble();
                        System.out.println("Enter number of days:");
                        int days = sc.nextInt();
                        System.out.println("Enter your age:");
                        int age = sc.nextInt();
                        FDAccount fd = new FDAccount(fdAmount, days, age);
                        System.out.println("Interest gained: Rs. " + fd.calculateInterest());
                        break;

                    case 3:
                        System.out.println("Enter monthly amount:");
                        double mAmount = sc.nextDouble();
                        System.out.println("Enter months:");
                        int months = sc.nextInt();
                        System.out.println("Enter your age:");
                        int rdAge = sc.nextInt();
                        RDAccount rd = new RDAccount(mAmount, months, rdAge);
                        System.out.println("Interest gained: Rs. " + rd.calculateInterest());
                        break;

                    case 4:
                        System.exit(0);
                }

            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}