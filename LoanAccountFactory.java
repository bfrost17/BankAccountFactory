package bankingfactory;

public class LoanAccountFactory implements BankAccountFactory{
    @Override
    public BankAccount createAccount() {
        return new LoanAccount(0.10); // 10% interest rate for loans
    }
}
