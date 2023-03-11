package homework9;

class Main {
    public static void main(String[] args) {
        Dealer.run();
    }
}

class Dealer {

    static Phone iPhoneX, note11, iPhone11;
    public static void run() {
        iPhoneX = new Phone(20, 9, 6.3, "M1", 4, false, 128, 10000);
        note11 = new Phone(20, 9, 6.3, "Qualcomm", 6, true, 128, 6900);
        iPhone11 = new Phone(20, 7, 6, "M1", 4, false, 256, 10000);

        Person yavuz = new Person("Yavuz", 1000);
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while(true) {
            System.out.println("Which phone do you want to buy? (1- iPhoneX, 2- Note 11, 3- iPhone 11, 0- Exit)");
            iPhoneX.info();
            note11.info();
            iPhone11.info();

            int choice = kb.nextInt();
            if(choice == 0)
                break;

            makingChoice(choice, yavuz);

        }

    }

    public static void makingChoice(int choice, Person p) {
        switch (choice) {
            case 1:
                if(hasEnoughMoney(p, iPhoneX)) {
                    p.phone = iPhoneX;
                    System.out.println("You successfully bought the phone");
                }
                    break;
            case 2:
                if(hasEnoughMoney(p, note11)) {
                    p.phone = note11;
                    System.out.println("You successfully bought the phone");
                }
                break;
            case 3:
                if(hasEnoughMoney(p, iPhone11)) {
                    p.phone = iPhone11;
                    System.out.println("You successfully bought the phone");
                }
                break;
        }
    }

    public static boolean hasEnoughMoney(Person p, Phone phone) {
        return p.money > phone.cost;
    }
}

class Person {
    String name;
    double money;
    Phone phone;

    public Person(String n, double m) {
        name = n;
        money = m;
    }

}

public class Phone {

    int height;
    int width;
    double inch;

    String processor;
    double ram;
    boolean isAndroid;
    double memory;

    double cost;

    public Phone() {

    }

    public Phone(int newHeight, int newWidth, double newInch, String p, double r, boolean isA, double m, double c) {
        height = newHeight;
        width = newWidth;
        inch = newInch;
        processor = p;
        ram = r;
        isAndroid = isA;
        memory = m;
        cost = c;
    }

    public Phone(int newHeight, int newWidth, double newInch) {
        height = newHeight;
        width = newWidth;
        inch = newInch;
    }

    public Phone(String p, double r, double m, boolean isA) {
        processor = p;
        ram = r;
        memory = m;
        isAndroid = isA;
    }

    public Phone(int c) {
        cost = c;
    }

    public void callSomeone(Person p) {
        System.out.print(p.name + " is called!");
    }

    public void info() {
        System.out.printf("Height: %d, Width: %d, Inch: %.1f%n", height, width, inch);
        System.out.printf("Processor: %s, RAM: %.1f, Memory: %.1f%n", processor, ram, memory);
        System.out.printf("OS: %s%n", isAndroid ? "Android" : "Apple");
        System.out.printf("How much is cost: %.2f%n", cost);
    }



}
