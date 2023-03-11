/*
Program will take an input number an the countDigits method will take this argument and then it will return this number's digits.
*/
package homework04;

public class Example1 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = kb.nextInt();

        System.out.printf("%d -> total digits count: %d", val, countDigits(val));
    }

    public static int countDigits(int val)
    {
        int count;

        for(count = 0; val > 0; val /= 10) {
            ++count;
        }


        return count;
    }
}
