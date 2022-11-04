package homework5;

public class Question7 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while(true) {

            System.out.print("First number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Last number: ");
            int lastNumber = scanner.nextInt();

            for(int i = firstNumber; i < lastNumber; i++)
                if(isArmStrong(i))
                    System.out.printf("%d sayısı bir armstrong sayıdır.%n", i);

            System.out.print("Want to exit press 0");
            int exitNumber = scanner.nextInt();
            if(exitNumber == 0)
                break;
        }


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
