package homework5;

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
