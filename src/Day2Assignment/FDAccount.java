package Day2Assignment;


class FDAccount extends Account {

    int noOfDays;
    int age;

    FDAccount(double amount, int noOfDays, int age) throws InvalidInputException {

        if (amount < 0)
            throw new InvalidInputException("Invalid Amount");

        if (noOfDays < 0)
            throw new InvalidInputException("Invalid Number of days. Please enter correct values.");

        this.amount = amount;
        this.noOfDays = noOfDays;
        this.age = age;
    }

    @Override
    double calculateInterest() {

        boolean isSenior = age >= 60;

        if (amount < 10000000) {   // Below 1 crore

            if (noOfDays >= 7 && noOfDays <= 14)
                interestRate = isSenior ? 5.0 : 4.5;
            else if (noOfDays <= 29)
                interestRate = isSenior ? 5.25 : 4.75;
            else if (noOfDays <= 45)
                interestRate = isSenior ? 6.0 : 5.5;
            else if (noOfDays <= 60)
                interestRate = isSenior ? 7.5 : 7.0;
            else if (noOfDays <= 184)
                interestRate = isSenior ? 8.0 : 7.5;
            else
                interestRate = isSenior ? 8.5 : 8.0;

        } else {   // Above 1 crore

            if (noOfDays <= 14)
                interestRate = 6.5;
            else if (noOfDays <= 29)
                interestRate = 6.75;
            else if (noOfDays <= 45)
                interestRate = 6.75;
            else if (noOfDays <= 60)
                interestRate = 8;
            else if (noOfDays <= 184)
                interestRate = 8.5;
            else
                interestRate = 10.0;
        }

        return (amount * interestRate) / 100;
    }
}