package homework5;

public class Question6 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int iterator = 0;
        while (true) {

            System.out.print("\nIf you want to increase the population press the 1: ");
            int choise = scanner.nextInt();

            iterator += 5;
            if(choise == 1)
                fibonacci(iterator);
            else
                break;

        }

    }

    public static void fibonacci(int iteration) {
        int a = 0;
        int b = 10;

        for(int i = 0; i < iteration; i += 5) {
            int temp;
            temp = a;
            a = b;
            b += temp;
            System.out.printf("%d ", a);
        }
    }
}