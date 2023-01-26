/*
Program will take an input number and it will display this number's digits.
*/
package homework4;

public class Example6 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = abs(kb.nextInt());

        if (val != 0)
            System.out.printf("%d -> total digits count: %d", val, countDigits(val));
        else
            System.out.println("Invalid input (now)");
    }

    public static int countDigits(int val)
    {
        int count;

        for(count = 0; val > 0; val /= 10) {
            count++;
        }

        return count;
    }

    public static int abs(int x)
    {
        return x < 0 ? -x : x;
    }
}
