package homework4;

public class Example7 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = kb.nextInt();

        System.out.printf("%d -> sum of digits = %d%n", val, sumDigits(val));
    }

    public static int sumDigits(int val)
    {
        int sum;

        for(sum = 0; val > 0; val /= 10) {
            sum += val%10;
        }

        return sum;
    }
}
