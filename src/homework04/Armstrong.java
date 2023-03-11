/*
Program will count 0 to 1000000 and find which number is an armstrong number.
*/
package homework04;
public class Armstrong {
    public static void main(String[] args) {
        display();
    }

    public static void display() {

        for(int i = 0; i < 999999; i++)
            if(isArmStrong(i))
                System.out.printf("%d is an armstrong number.%n", i);
    }

    public static boolean isArmStrong(int a) {
        return a == findArmstrong(a);
    }

    public static int findArmstrong(int a) {
        int sum = 0;
        int digit = countDigits(a);

        do {

            sum += pow(a % 10, digit);
            a /= 10;

        }
        while (a != 0);

        return sum;
    }

    public static int pow(int a, int digit) {
        int pow = 1;
        int temp = digit;

        do {
            pow *= a;
            temp--;
        } while(temp != 0);

        return pow;

    }

    public static int countDigits(int a) {

        int count = 0;

        do {
            a /= 10;
            count++;
        }
        while (a > 0);

        return count;
    }
}