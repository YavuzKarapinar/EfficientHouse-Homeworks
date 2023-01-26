/*
Program will take numbers until we input 0 and then it will count positive input numbers and negative input numbers and then it will display
how many times we enter positive numbers and sum of this positive numbers and how many times we enter negative numbers and sum of this negative numbers.
*/
package homework4;

public class Example5 {
    public static void main(String[] args)
    {
        countPositiveAndNegatives();
    }

    public static void countPositiveAndNegatives() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Input numbers !!");

        int posSum = 0, negSum = 0;
        int posCount = 0, negCount = 0;

        for(int val; (val = kb.nextInt()) != 0;) {
            if (val > 0) {
                posSum += val;
                ++posCount;
            } else {
                negSum += val;
                ++negCount;
            }
        }

        display(posSum, posCount, negSum, negCount);
    }

    public static void display(int posSum, int posCount, int negSum, int negCount)
    {
        if (posCount > 0)
            System.out.printf("%d numbers of positive sum:%d%n", posCount, posSum);
        else
            System.out.println("You have not entered any Positive number");

        if (negCount > 0)
            System.out.printf("%d numbers of negative sum:%d%n", negCount, negSum);
        else
            System.out.println("You have not entered any Negative number");

    }
}
