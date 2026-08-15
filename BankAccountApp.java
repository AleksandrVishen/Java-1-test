public class BankAccountApp {
    public static void main(String[] args) {

        System.out.println(BankAccount.getAccountsCreated());
        BankAccount firstAcc = new BankAccount("Klara", 5000, false);
        System.out.println(BankAccount.getAccountsCreated());
        BankAccount secondAcc = new BankAccount("Rich", 80000);
        BankAccount thirdAcc = new BankAccount("Poor");
        System.out.println(BankAccount.getAccountsCreated());

        firstAcc.deposit(500);
        firstAcc.deposit(500, "Возврат долга");

        secondAcc.deposit(500, "Возврат долга");

        thirdAcc.block();
        thirdAcc.deposit(500);
        thirdAcc.deposit(500, "Возврат долга");


    }
}
