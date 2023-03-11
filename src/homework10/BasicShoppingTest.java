package homework10;

public class BasicShoppingTest {
    public static void run()
    {
        Customer customer = new Customer("Eren", new Wallet(new Card("1234", 1000), 1000), new Phone("536 999 99 99"));
        Customer friend = new Customer("Tuncay", new Wallet(new Card("1122", 5000), 2000), new Phone("536 1111 11 11"));

        Customer.goToMarket(customer, friend);


    }
}