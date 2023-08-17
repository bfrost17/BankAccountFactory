package bankingfactory;

public class Main {
    public static void main(String[] args) {
        BankAccountFactory loanFactory = new LoanAccountFactory();
        BankAccountFactory savingsFactory = new SavingsAccountFactory();
        BankAccountFactory currentFactory = new CurrentAccountFactory();

        BankAccount loanAccount = loanFactory.createAccount();
        BankAccount savingsAccount = savingsFactory.createAccount();
        BankAccount currentAccount = currentFactory.createAccount();

        loanAccount.setInterestRate(0.07);

        System.out.println("Loan Account Interest Rate: " + loanAccount.getInterestRate());
        System.out.println("Savings Account Interest Rate: " + savingsAccount.getInterestRate());
        System.out.println("Current Account Interest Rate: " + currentAccount.getInterestRate());
    }
}
