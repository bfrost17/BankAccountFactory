package bankingfactory;

public class SavingsAccountFactory implements BankAccountFactory {
    @Override
    public BankAccount createAccount() {
        return new SavingsAccount(0.06); // 6% interest rate for savings
    }
}
