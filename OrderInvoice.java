public class OrderInvoice {
    public static void main(String[] args) {
        String nameCustomer = "Александр";
        String nameGoods = "Клавиатура Keychron K2";
        int countGoods = 2;
        double price = 149.99;
        boolean hasExpressDelivery = true;
        double totalPrice = price * countGoods;
        String invoiceSummary = "Покупатель " + nameCustomer + " купил товар: " + nameGoods + " в количестве " + countGoods +
                " шт. по " + price + " у.е. Наличие экспресс доставки: " + hasExpressDelivery + ". Всего к оплате: " + totalPrice + " у.е.";
        System.out.println(invoiceSummary);
    }
}
