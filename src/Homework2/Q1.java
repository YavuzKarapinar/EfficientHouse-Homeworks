package Homework2;

public class Q1 {
    public static void main(String[] args) {
        double kilogram, meter, bmi;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Kilogram: ");
        kilogram = scanner.nextDouble();
        System.out.println("Meter: ");
        meter = scanner.nextDouble();

        bmi = kilogram / (meter * meter);

        System.out.printf("Vücut kitle indeksi: %.2f", bmi);
    }
}
