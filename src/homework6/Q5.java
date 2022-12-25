package homework6;

public class Q5 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int a = scanner.nextInt();

        if(isEven(a))
            System.out.println(sumPrimes(a));

    }
    public static boolean isPrime(long a) {
        if(a % 2 == 0)
            return a == 2;

        if(a <= 1)
            return false;

        for(long i = 3; i * i <= a; i += 2) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumPrimes(int a) {
        int j = 2, k = a / 2;

        for(int i = 0; i < a; i++) {

            while (j <= a / 2) {
                if(isPrime(j)) break;
                else j++;
            }

            while (k <= a) {

                if(isPrime(k)) break;
                else k++;
            }

            if(j > a / 2) {
                j = 2;
                continue;
            }

            if(k > a) {
                k = a / 2;
                continue;
            }


            if(j + k == a)
                return j + k;

            j++; k++;
        }

        return 0;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

}
