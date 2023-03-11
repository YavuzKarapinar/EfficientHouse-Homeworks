package homework10;

public class Customer {
    public String name;
    public Wallet wallet;
    public Phone phone;

    public Customer(String newName, Wallet newWallet, Phone newPhone )
    {
        name = newName;
        wallet = newWallet;
        phone = newPhone;
    }


    public String getName()
    {
        return name;
    }

    public Wallet getWallet()
    {
        return wallet;
    }

    public Phone getPhone()
    {
        return phone;
    }

    public static void goToMarket(Customer customer, Customer friend)
    {
        Market.shopping(customer, friend);
    }
}