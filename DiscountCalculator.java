public class DiscountCalculator {
    public static void main(String[] args) {
        double purchaseAmount = 12000.0;
        String customerStatus = "REGULAR";
        boolean isHoliday = true;

        int sale = 0;

        if (isHoliday) {
            sale += 5;
        }

        switch (customerStatus) {
            case "REGULAR" -> {
                if (purchaseAmount < 10000.0) {
                    sale += 5;
                } else sale += 10;
            }
            case "VIP" -> sale += 15;
            case "NEW" -> sale = sale;
        }

        double finalPrice = purchaseAmount * (1 - 0.01 * sale);

        System.out.println("Исходная сумма: " + purchaseAmount  + " у.е. Статус клиента: " + customerStatus + ". скидка: " + sale
                + "%. Сумма к оплате: " + finalPrice + " у.е.");

    }
}
