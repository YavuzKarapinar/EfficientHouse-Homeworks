package homework5;

public class Question5 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Cost of item: ");
        double item = scanner.nextDouble();

        interest(item);
    }

    public static void interest(double val) {
        double interest = 0.015;
        int months = 0;
        int monthlyPayment = 50;
        double sumOfInterests = 0;

        while(val > 0) {
            if(val < 49)
                monthlyPayment = val + (val * interest);

            sumOfInterests += val * interest;
            val = val - (monthlyPayment - (val * interest));

            months++;
        }

        System.out.printf("Sum Of Interests: %.2f%n", sumOfInterests);
        System.out.println("Total months: " + months);

    }
}
