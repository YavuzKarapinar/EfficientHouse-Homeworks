package Homework2;

public class Q6 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Principal Amount: ");
        double principalAmount = scanner.nextDouble();
        System.out.println("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        System.out.println("Numbers of Years:");
        double numberOfYears = scanner.nextDouble();
        double simpleInterest;

        simpleInterest = (principalAmount * interestRate * numberOfYears) / 100;

        System.out.println(simpleInterest);
    }
}
