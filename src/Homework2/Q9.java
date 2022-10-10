package Homework2;

public class Q9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Feet: ");
        int feet = scanner.nextInt();
        System.out.println("Inch: ");
        int inch = scanner.nextInt();
        System.out.println("Pound: ");
        int pound = scanner.nextInt();

        feet -= 5;
        inch = inch + (feet * 12);
        pound = pound + (inch * 5);

        System.out.println(pound);
    }
}
