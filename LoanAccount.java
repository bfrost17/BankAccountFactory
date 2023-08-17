package bankingfactory;

public class LoanAccount implements BankAccount{
    private double interestRate;

    public LoanAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}

