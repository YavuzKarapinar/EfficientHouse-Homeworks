/*
Program wants to us to make a diamond with stars using nested loops.
*/
package homework06;

public class Q1 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input number: ");
        int n = scanner.nextInt();

        upperTriangle(n);
        lowerTriangle(n);
    }

    public static void upperTriangle(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
    public static void lowerTriangle(int n) {
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
