package homework10;

public class Phone {
    public String phoneNumber;
    public BankApp bankApp;

    Phone(String newPhoneNumber)
    {
        phoneNumber = newPhoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void call(Customer customer)
    {
        System.out.printf("(%s) - (%s) calling... %n", customer.getName(), customer.getPhone().getPhoneNumber());
    }
}