public class BankAccountApp {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Klara", 8000, 25);
        BankAccount bankReference = savingsAccount;
        InterestBearing interestReference = savingsAccount;

        bankReference.deposit(8000);
        System.out.println(interestReference.getAnnualRatePercent());
        System.out.println(interestReference.calculateYearlyInterest());
        printInterestInfo(savingsAccount);

    }

    public static void printAccountSummary(BankAccount account) {
        System.out.println(account.getAccountType());
        account.printInfo();
    }

    public static void printInterestInfo(
            InterestBearing interestBearing) {
        System.out.println(interestBearing.getAnnualRatePercent());
        System.out.println(interestBearing.calculateYearlyInterest());
    }
}
