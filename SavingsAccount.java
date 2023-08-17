package bankingfactory;

class SavingsAccount implements BankAccount {
    private double interestRate;

    public SavingsAccount(double interestRate) {
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
