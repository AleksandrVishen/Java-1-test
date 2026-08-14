public class AccountAnalytics {
    public static void main(String[] args) {
        int[] dailyExpenses = {1200, 450, 0, 3100, 890, 0, 5200};
        int activeDays = 0;
        int passiveDays = 0;
        int maxPayment = 0;
        int sum = 0;
        for (int expense : dailyExpenses) {
            sum += expense;
            if (maxPayment < expense) maxPayment = expense;
            if (expense != 0) activeDays += 1;
            else passiveDays += 1;
        }
        double avrPaymentActive = (double) sum / activeDays;
        System.out.println("Количество дней с продажами: " + activeDays + ". Количество дней без продаж: " + passiveDays +
                ". Всего потрачено: " + sum + ". Максимальная продажа: " + maxPayment + ". Средняя выручка в активные дни: " + avrPaymentActive + ".");
    }
}
