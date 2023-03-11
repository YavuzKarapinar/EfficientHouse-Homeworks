/*
It is difficult to make a budget that spans several years, because prices are not stable.
If your company needs 200 pencils per year, you cannot simply use this year’s price
as the cost of pencils two years from now. Because of inflation, the cost is likely to
be higher than it is today. Write a program to gauge the expected cost of an item in
a specified number of years. The program asks for the cost of the item, the number
of years from now that the item will be purchased, and the rate of inflation. The
program then outputs the estimated cost of the item after the specified period.
Have the user enter the inflation rate as a percentage, such as 5.6 (percent). Your
program should then convert the percent to a fraction, such as 0.056 and should
use a loop to estimate the price adjusted for inflation.
*/
package homework05;

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
