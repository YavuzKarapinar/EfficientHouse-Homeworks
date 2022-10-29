package homework4;

public class IsPrime {
    public static void main(String[] args) {
        run();
    }

    public static void run()
    {

        for(int i = 2; i < 999999; i++)
            if(isPrime(i))
                System.out.printf("%d bir asal sayıdır.%n", i);
            else
                System.out.printf("%d bir asal sayı değildir.%n", i);
    }

    public static boolean isPrime(long a) {

        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
