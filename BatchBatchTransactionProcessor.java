public class BatchBatchTransactionProcessor {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Транзакция № 5: КРИТИЧЕСКАЯ ОШИБКА СЕТИ! Прерывание обработки пакета.");
                break;
            }

            if (i % 2 == 0) {
                System.out.println("Транзакция №" + i + ": Успешно обработана");
            } else {
                System.out.println("Транзакция №" + i + ": Пропущена");
            }
        }
        System.out.println("Обработка пакета завершена.");
    }
}
