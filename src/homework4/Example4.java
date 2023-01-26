/*
Program will taken numbers until 0 and then it will display sum of the positive numbers and sum of the negative numbers.
*/
package homework4;

public class Example4 {
    public static void main(String[] args)
    {
        countPositiveAndNegatives();
    }

    public static void countPositiveAndNegatives()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter numbers (EXIT = 0):");

        int positive = 0, negative = 0;

        for(int val; (val = kb.nextInt()) != 0 ;) {
            if (val > 0)
                positive += val;
            else
                negative += val;
        }

        display(positive, negative);
    }

    public static void display(int positive, int negative)
    {
        if (positive > 0)
            System.out.printf("Sum of Positive numbers: %d%n", positive);
        else
            System.out.println("You have not entered any Positive number");

        if (negative < 0)
            System.out.printf("Sum of Negative numbers: %d%n", negative);
        else
            System.out.println("You have not entered any Negative number");
    }
}
