package homework10;

public class Market {
    public static java.util.Scanner kb = new java.util.Scanner(System.in);

    public static void shopping(Customer customer, Customer friend) {

        int cost = getProduct();

        cost += buyForFriend(customer, friend);

        System.out.println("Total cost: " + cost + "$");

        System.out.println("How do you want to pay ? \n" +
                "Card or Cash");

        String paymentChoice = kb.nextLine();

        payment(paymentChoice, customer.getWallet(), cost);
    }

    public static int buyForFriend(Customer customer, Customer friend) {

        customer.getPhone().call(friend);

        System.out.println("Do you want something?");

        String yesOrNo = kb.nextLine();

        if (yesOrNo.equalsIgnoreCase("yes"))

            return getProduct();

        else
            System.out.println("Okay, bye!");

        return 0;
    }

    public static void payment(String paymentChoice, Wallet wallet, int cost) {

        if (paymentChoice.equalsIgnoreCase("card"))

            paymentWithCard(wallet.getCard(), cost);

        else if (paymentChoice.equalsIgnoreCase("cash"))

            paymentWithCash(wallet, cost);

        else
            System.out.println("Invalid Input");

    }

    public static void displayProducts() {
        System.out.println("Products");
        System.out.println("--------------------");
        System.out.println("1- Milk - 10");
        System.out.println("2- Bread - 5");
        System.out.println("3- Egg - 7");
        System.out.println("4- Apple - 3");
        System.out.println("5- Newspaper - 2");
        System.out.println("0- '-End shopping -> Go to Payment'");
        System.out.println("--------------------");
    }

    public static int getProduct() {
        int cost = 0;
        int count = 0;

        displayProducts();

        while (true) {
            int choice = Integer.parseInt(kb.nextLine());

            if (choice == 0)
                break;

            cost = costStatement(choice, cost);

            count++;
        }

        System.out.printf("%d products cost %d$%n", count, cost);
        return cost;
    }

    public static int costStatement(int choice, int cost) {

        switch (choice) {
            case 1:
                cost += 10;
                break;
            case 2:
                cost += 5;
                break;
            case 3:
                cost += 7;
                break;
            case 4:
                cost += 3;
                break;
            case 5:
                cost += 2;
                break;
            default:
                System.out.println("Invalid input. (0 - Exit)");
                return cost;
        }

        return cost;
    }

    public static void paymentWithCard(Card card, int cost) {

        for (int i = 3; 0 < i; i--) {

            System.out.print("password:");
            if (kb.nextLine().equals(card.getPassword())) {

                if (cardControl(card, cost))
                    break;

            } else {
                System.out.printf("Wrong password - Your remaining left %d%n", i - 1);
            }
        }
    }

    public static void paymentWithCash(Wallet wallet, int cost) {

        if (checkBalance(wallet.getCashMoney(), cost)) {

            wallet.setCashMoney(wallet.getCashMoney() - cost);
            System.out.println("Thanks for choosing us");
            System.out.printf("New Balance : %d", wallet.getCashMoney());

        } else
            System.out.println("You did not give enough money");
    }

    public static boolean cardControl(Card card, int cost) {

        if (checkBalance(card.getBalance(), cost)) {

            card.setBalance(card.getBalance() - cost);
            System.out.println("Successfully Paid");
            System.out.printf("Remaining Card Balance : %d%n", card.getBalance());

        } else
            System.out.println("Insufficient Balance");

        return true;
    }

    public static boolean checkBalance(int balance, int cost) {
        return balance >= cost;
    }

}