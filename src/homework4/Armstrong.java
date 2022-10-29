package homework4;

public class Armstrong {
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
        int sum;
        int digit = countDigits(a);

        for(sum = 0; a != 0; a /= 10) {
            sum += pow(a % 10, digit);
        }

        return sum;
    }

    public static int pow(int a, int digit) {
        int pow;
        int temp = digit;

        for(pow = 1; temp != 0; temp--) {
            pow *= a;
        }

        return pow;

    }

    public static int countDigits(int a) {

        int count;

        for(count = 0; a > 0; a /= 10) {
            count++;
        }

        return count;
    }
}
