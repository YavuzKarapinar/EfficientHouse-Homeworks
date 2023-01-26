/*
Write a program for calculating the simple interest on a loan when the initial principal amount (princi_amnt) is $1000, 
the initial interest rate (int_rate) is 5.0%,
and the number of years (no_of_yrs) is 5. Use suitable data types to declare these
variables. Simple interest is calculated using the following equation:
 
Simple interest = (Principal amount * Interest rate * Number of years) / 100

*/
package homework1;

public class Q6 {
    public static void main(String[] args) {
        
        double principalAmount = 1000;
	    double interestRate = 5;
        double numbersOfYears = 5;
	    double simpleInterest;

        simpleInterest = (principalAmount * interestRate * numbersOfYears) / 100;
        System.out.println(simpleInterest);
    }    
}