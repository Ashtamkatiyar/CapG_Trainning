package Day2Assignment;

class RDAccount extends Account {

    int noOfMonths;
    double monthlyAmount;
    int age;

    RDAccount(double monthlyAmount, int noOfMonths, int age) throws InvalidInputException {

        if (monthlyAmount < 0 || noOfMonths < 0)
            throw new InvalidInputException("Invalid Input");

        this.monthlyAmount = monthlyAmount;
        this.noOfMonths = noOfMonths;
        this.age = age;
    }

    @Override
    double calculateInterest() {

        boolean isSenior = age >= 60;

        if (noOfMonths == 6)
            interestRate = isSenior ? 8.0 : 7.5;
        else if (noOfMonths == 9)
            interestRate = isSenior ? 8.25 : 7.75;
        else if (noOfMonths == 12)
            interestRate = isSenior ? 8.5 : 8.0;
        else if (noOfMonths == 15)
            interestRate = isSenior ? 8.75 : 8.25;
        else if (noOfMonths == 18)
            interestRate = isSenior ? 9.0 : 8.5;
        else
            interestRate = isSenior ? 9.25 : 8.75;

        return (monthlyAmount * noOfMonths * interestRate) / 100;
    }
}