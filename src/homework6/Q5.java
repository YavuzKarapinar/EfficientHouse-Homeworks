/*
Even numbers can be sum of the 2 prime numbers. Program will take an even number
and it will display this number's 2 prime sum numbers.
*/
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

    public static String sumPrimes(int a) {
        for(int i = 2; i <= a; i++)
            
            if(isPrime(i))
                for(int j = a - i; j >= 2; j--)
                    
                    if(isPrime(j)) 
                        if(i+j == a) 
                            return i + " + " + j + " = " + a;
        
        return "Cannot found";
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

}
