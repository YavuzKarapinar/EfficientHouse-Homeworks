/*
Program will execute middle method and will print the median of the 3 numbers on the screen.
*/
package homework3;
public class Q2 {
    public static void main(String[] args) {

        int mid = middle(9,6,7);

        System.out.println(mid);

    }

    public static int middle(int a, int b, int c) {

        if((a >= b && a <= c) || (a <= b && b >= c))
            return a;

        if((a <= b && b <= c) || (a >= b && b >= c))
            return b;

        return c;
    }
}