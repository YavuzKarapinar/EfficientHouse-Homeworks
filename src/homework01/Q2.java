/*
The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next, 
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.
*/
package homework01;

public class Q2 {
    public static void main(String[] args) {
        
        int ticket = 128;
	    int candyBar;
	    int gumball;

        candyBar = ticket / 10;
        ticket = ticket % 10;
        gumball = ticket / 3;
        ticket = ticket % 3;
        System.out.printf("You can get %d piece of candy bars and %d piece of Gumballs and number of remaining ticket is: %d", candyBar, gumball, ticket);
    }    
}