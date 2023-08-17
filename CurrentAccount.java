package bankingfactory;

public class CurrentAccount implements BankAccount{
    @Override
    public void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    private double interestRate;
    public CurrentAccount(double interestRate){
        this.interestRate = interestRate;
    }
}
