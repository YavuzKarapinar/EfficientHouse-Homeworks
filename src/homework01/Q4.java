/*
A government research lab has concluded that an artificial sweetener commonly
used in diet soda pop will cause death in laboratory mice. A friend of yours is
desperate to lose weight but cannot give up soda pop. Your friend wants to know
how much diet soda pop it is possible to drink without dying as a result. Write a
program to supply the answer. The program has no input but does have defined
constants for the following items: the amount of artificial sweetener needed to kill
a mouse, the weight of the mouse, the starting weight of the dieter, and the desired
weight of the dieter. To ensure the safety of your friend, be sure the program uses
the weight at which the dieter will stop dieting, rather than the dieter’s current
weight, to calculate how much soda pop the dieter can safely drink. You may use
any reasonable values for these defined constants. Assume that diet soda contains
1/10th of 1% artificial sweetener. Use another named constant for this fraction.
You may want to express the percent as the double value 0.001. (If your program
turns out not to use a defined constant, you may remove that defined constant
from your program.)
*/
package homework01;

public class Q4 {
    public static void main(String[] args) {
	  
	  	double amountToKill = 0.1;
      	double mouseWeight = 2.5;
	  	double afterDiet = 85;
      	double beforeDiet = 150;
	  	final double PERCENT = 0.001;
        
	  	double sodaForSafeUse = ((amountToKill / mouseWeight) * afterDiet) / PERCENT;
        
	  	System.out.println("The number of sodas before you die is: " + sodaForSafeUse);
        
    }    
}