package Day2Assignment;

abstract class Account {

    double amount;
    double interestRate;

    abstract double calculateInterest() throws InvalidInputException;
}
