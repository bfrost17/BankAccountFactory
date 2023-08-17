package bankingfactory;

public class CurrentAccountFactory implements BankAccountFactory{
    @Override
    public BankAccount createAccount() {
        return new LoanAccount(0.7); // %7 interest rate for loans
    }
}
