public class BankAccountApp {
    public static void main(String[] args) {

        BankAccount standardAccount = new BankAccount("Klara", 5000, false);
        SavingsAccount savingsAccount = new SavingsAccount("Artem", 6000, 5);

        printAccountSummary(standardAccount);
        printAccountSummary(savingsAccount);

        BankAccount polymorphicReference = savingsAccount;
        System.out.println(polymorphicReference.getAccountType());
        polymorphicReference.printInfo();

    }

    public static void printAccountSummary(BankAccount account) {
        System.out.println(account.getAccountType());
        account.printInfo();
    }
}
