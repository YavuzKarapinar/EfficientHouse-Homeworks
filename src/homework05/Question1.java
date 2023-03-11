/*
The Babylonian algorithm to compute the square root of a positive number n is as follows:
 1. Make a guess at the answer (you can pick n/2 as your initial guess).
 2. Compute r = n / guess.
 3. Set guess = (guess +r) / 2.
 4. Go back to step 2 until the last two guess values are within 1% of each other.
Write a program that inputs a double for n, iterates through the Babylonian algorithm until the guess
is within 1% of the previous guess and outputs the answer
as a double to two decimal places. Your answer should be accurate even for large
values of n.
*/
package homework05;

public class Question1 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Number: ");
        double n = scanner.nextDouble();

        if(n > 0)
            System.out.printf("Number %.2f's square root is: %.2f", n, squareRoot(n));
        else
            System.out.println("Number is not positive");
    }

    public static double squareRoot(double n) {

        double guess = n/2;
        double r;

        while (true) {
            double temp = guess;
            r = n / guess;
            guess = (guess + r) / 2;

            if(temp - guess <= temp * 0.01)
                break;
        }

        return guess;
    }


}
