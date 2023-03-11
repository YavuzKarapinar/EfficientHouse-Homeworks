/*
Program will execute the sort method and will print 3 numbers smallest to largest.
*/
package homework03;
public class Q1 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        sort(a, b, c);
    }

    public static void sort(int a, int b, int c) {

        int higher = biggerOne(biggerOne(a, b), c);
        int lower = smallerOne(smallerOne(a, b), c);
        int middle = a + b + c - higher - lower;

        String middleLowerCheck = lower == middle ? "=" : "<";
        String middleHigherCheck = middle == higher ? "=" : "<";
        System.out.printf("%d%s%d%s%d", lower, middleLowerCheck, middle, middleHigherCheck, higher);

    }

    public static int biggerOne(int a, int b) {
        if(a >= b)
            return a;
        else
            return b;
    }
    public static int smallerOne(int a, int b) {
        if(a <= b)
            return a;
        else
            return b;
    }

}