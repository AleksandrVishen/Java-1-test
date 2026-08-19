public class BankClientApp {
    public static void main(String[] args) {
        BankClient first = new BankClient(100, "Александр");
        BankClient second = new BankClient(100, "Alex");
        BankClient third = new BankClient(200, "Александр");

        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(first.equals("not a client"));

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        System.out.println(third.hashCode());

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}
