package homework07;

public class Q1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        Dice dice;

        dice = new Dice();

        for (;;) {
            System.out.print("How many times do you want to throw the dices ? ");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            dice.throwDice(n);

        }
    }
}

class Dice {
    public double odds;

    public static int getEvenCount(int n)
    {
        java.util.Random r = new java.util.Random();
        int count = 0;

        for (int i = 0; i < n; ++i) {
            int d1 = r.nextInt(6) + 1;
            int d2 = r.nextInt(6) + 1;

            if (d1 % 2 == 0 && d2 % 2 == 0) {
                System.out.println(d1 + " " + d2);
                ++count;
            }
        }
        return count;
    }

    public void throwDice(int n)
    {
        odds = getEvenCount(n) / (double)n;

        System.out.println("odds: " + odds);
        System.out.println();
    }

}
