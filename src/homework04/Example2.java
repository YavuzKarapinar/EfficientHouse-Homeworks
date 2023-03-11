package homework04;

public class Example2 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("How many times you want to loop through:");
        int n = kb.nextInt();

        System.out.println("------------------");

        int i;
        for(i = 0; i < n; i++) {
            System.out.println(i);
        }

        System.out.printf("i = %d%n", i);

        System.out.println("How many times you want to loop through:");
        int n2 = kb.nextInt();

        System.out.println("------------------");

        int j;

        for(j = 1; j <= n2; j++) {
            System.out.println(j);
        }

        System.out.printf("j = %d", j);
    }
}
