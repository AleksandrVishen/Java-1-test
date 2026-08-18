public class BankAccountApp {
    public static void main(String[] args) {

        System.out.println(BankAccount.getAccountsCreated());
        BankAccount firstAcc = new BankAccount("Klara", 5000, false);
        SavingsAccount saveMoneyAcc = new SavingsAccount("Artem", 6000, 5);
        saveMoneyAcc.deposit(6000);
        System.out.println(saveMoneyAcc.getBalance());
        System.out.println(saveMoneyAcc.calculateYearlyInterest());
        System.out.println(BankAccount.getAccountsCreated());
    }
}
