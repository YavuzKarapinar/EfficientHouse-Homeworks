/*
Program will count 2 to 99999 and will display prime numbers.
*/
package homework04;

public class IsPrime {
    public static void main(String[] args) {
        run();
    }

    public static void run()
    {
        for(long i = 2; i < 99999L; i++)
            if(isPrime(i))
                System.out.printf("%d is a prime number.%n", i);
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
}