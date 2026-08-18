public class SavingsAccount extends BankAccount {
    private double annualRatePercent;

    public SavingsAccount(String ownerName, double balance, double annualRatePercent) {
        super(ownerName, balance);
        this.annualRatePercent = annualRatePercent;
    }

    public double getAnnualRatePercent() {
        return annualRatePercent;
    }

    public double calculateYearlyInterest() {
        return getBalance() * annualRatePercent / 100.0;
    }

    @Override
    public String getAccountType() {
        return "SAVINGS";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Годовая ставка: " + annualRatePercent + "%");
    }

}
