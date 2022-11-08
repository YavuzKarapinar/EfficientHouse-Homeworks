package homework5;

public class Question4 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Cost of Item: ");
        double cost = scanner.nextDouble();

        System.out.print("Number of Years: ");
        int years = scanner.nextInt();

        System.out.print("Rate of Inflation: ");
        double rate = scanner.nextDouble();

        System.out.printf("Your product's cost %.2f with %.2f inflation rate in %d years later.", costCalculation(cost, years, rate), rate, years);
    }

    public static double costCalculation(double cost, int years, double rate) {

        for (int i = 1; i <= years; i++)
            cost += (cost * rate/100);

        return cost;
    }

}
