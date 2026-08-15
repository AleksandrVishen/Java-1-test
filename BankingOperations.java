public class BankingOperations {
    public static void main(String[] args) {
        double depositAmount = 100000.0;
        double annualRatePercent = 12.5;
        int months = 6;
        double currentBalance = 5000.0;
        double requestedAmount = 6000.0;
        int[] cashbackHistory = {50, 200, 10, 450, 0};
        int minReward = 100;
        System.out.println("Доход :" + calculateInterest(depositAmount, annualRatePercent, months));
        System.out.println("Возможно снять?: " + isWithdrawalPossible(currentBalance, requestedAmount));
        for (int i = 0; i < cashbackHistory.length; i++) {
            System.out.println("Для параметра " + (i + 1) + " значение равно " + cashbackHistory[i] + ".");
        }
        applyCashbackBonus(cashbackHistory, minReward);
        System.out.println("После бонуса:");
        for (int i = 0; i < cashbackHistory.length; i++) {
            System.out.println("Для параметра " + (i + 1) + " значение равно " + cashbackHistory[i] + ".");
        }

    }

    public static double calculateInterest(
            double depositAmount,
            double annualRatePercent,
            int months) {

        return depositAmount * (annualRatePercent / 100) * (months / 12.0);
    }

    public static boolean isWithdrawalPossible(
            double currentBalance,
            double requestedAmount) {
        return requestedAmount > 0 && requestedAmount <= currentBalance;
    }

    public static void applyCashbackBonus(
            int[] cashbackHistory,
            int minReward) {
        for (int i = 0; i < cashbackHistory.length; i++) {
            if (cashbackHistory[i] < minReward) cashbackHistory[i] = minReward;
        }
    }
}
