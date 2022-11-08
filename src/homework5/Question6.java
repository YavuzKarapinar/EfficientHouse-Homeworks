package homework5;

public class Question6 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int day = 0;
        while (true) {

            day += 5;
            System.out.println(poundCalculator(day));

            System.out.print("Press 0 to exit: ");
            int choice = scanner.nextInt();
            if(choice == 0)
                break;
        }
    }

    public static int poundCalculator(int day) {
        int a = 0;
        int b = 10;

        for(int i = 0; i < day / 5; i++) {
            int temp;
            temp = a;
            a = b;
            b += temp;
        }
        return a;
    }
}
