public class BankAccountApp {
    public static void main(String[] args) {


        BankAccount first = new DebitAccount("Klara", 5000);
        BankAccount second = new SavingsAccount("Artem", 6000, 10);
        printAccountSummary(first);
        printAccountSummary(second);

    }

    public static void printAccountSummary(BankAccount account) {
        System.out.println(account.getAccountType());
        account.printInfo();
    }
}
