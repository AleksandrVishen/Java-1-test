public abstract class BankAccount {

    private String ownerName;
    private double balance;
    private boolean blocked;
    private static int accountsCreated = 0;

    public abstract String getAccountType();

    public static int getAccountsCreated() {
        return accountsCreated;
    }

    public BankAccount(String ownerName, double balance, boolean blocked) {
        this.balance = balance;
        this.blocked = blocked;
        this.ownerName = ownerName;
        accountsCreated++;
    }

    public BankAccount(String ownerName, double balance) {
        this(ownerName, balance, false);
    }

    public BankAccount(String ownerName) {
        this(ownerName, 0.0, false);
    }


    public void deposit(double amount, String description) {
        if (amount > 0 && !blocked) {
            balance += amount;
            System.out.println(ownerName + ". Успешно пополнили на " + amount + ".");
            System.out.print(description);
        } else {
            System.out.println(ownerName + ". Нельзя пополнить. Проверьте сумму пополнения или блокировку.");
        }
    }

    public void deposit(double amount) {
        deposit(amount, "");
    }


    public boolean withdraw(double amount) {
        if (!blocked && amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(ownerName + ". Успешно вывели: " + amount + ".");
            return true;
        } else {
            System.out.println(ownerName + ". Нельзя вывести. Проверьте блокировку аккаунта или баланс.");
            return false;
        }
    }

    public void printInfo() {
        System.out.println("Имя владельца: " + ownerName + ". Текущий баланс: " + balance + ". Блокировка: " + blocked + ".");
    }

    public void unblock() {
        if (blocked) {
            this.blocked = false;
            System.out.println(ownerName + " разблокирован.");
        } else System.out.println(ownerName + " уже разблокирован.");
    }

    public void block() {
        if (!blocked) {
            this.blocked = true;
            System.out.println(ownerName + " заблокирован.");
        } else System.out.println(ownerName + " уже заблокирован.");
    }

    public boolean renameOwner(String newOwnerName) {
        if (newOwnerName == null || newOwnerName.trim().isEmpty()) {
            System.out.println("Некорректный ввод.");
            return false;
        } else {
            this.ownerName = newOwnerName;
            System.out.println("Имя владельца изменено на " + ownerName);
            return true;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return blocked;
    }


}
