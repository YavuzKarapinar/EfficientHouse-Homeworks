package homework4;

public class Example8 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        for(int val; (val = kb.nextInt()) != 0; ) {
            System.out.printf("%d -> reversed: %d%n", val, reversed(val));
            System.out.println("Number:");
        }

    }

    public static int reversed(int val) // 123
    {
        int result;

        for(result = 0; val != 0; val /= 10) {
            result = result * 10 + val % 10;
        }

        return result;
    }
}
