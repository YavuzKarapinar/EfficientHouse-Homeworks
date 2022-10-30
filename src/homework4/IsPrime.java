package homework4;

public class IsPrime {
    public static void main(String[] args) {
        run();
    }

    public static void run()
    {
        for(long i = 2; i < 99999L; i++)
            if(isPrime(i))
                System.out.printf("%d bir asal sayıdır.%n", i);
    }

    public static boolean isPrime(long a) {
        if(a == 2)
            return true;
        else if(a % 2 == 0 || a <= 1)
            return false;

        for(long i = 3; i < a; i += 2) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
