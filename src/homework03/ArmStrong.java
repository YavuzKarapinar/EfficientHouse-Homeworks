package homework03;

public class ArmStrong {
    public static void main(String[] args) {
        display();
    }

    public static void display() {

        for(int i = 0; i < 999999; i++)
            if(isArmStrong(i))
                System.out.printf("%d sayısı bir armstrong sayıdır.%n", i);
    }

    public static boolean isArmStrong(int a) {
        return a == algorithm(a);
    }

    public static int algorithm(int a) {
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
