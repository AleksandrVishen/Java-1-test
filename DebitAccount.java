public class DebitAccount extends BankAccount {
    public DebitAccount(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    public String getAccountType() {
        return "DEBIT";
    }


}
