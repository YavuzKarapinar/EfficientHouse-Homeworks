package homework07;

public class Q2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        SameDice d = new SameDice();

        for (;;) {
            System.out.print("How many times do you want to throw the dices ? ");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            d.throwDice(n);

        }
    }
}

class SameDice {
    public double rate;

    public int getSameCount(int n) {

        java.util.Random r = new java.util.Random();
        int count = 0;

        for(int i = 0; i < n; i++) {
            int d1 = r.nextInt(6) + 1;
            int d2 = r.nextInt(6) + 1;

            if(d1 == d2) {
                System.out.println(d1 + " " + d2);
                ++count;
            }
        }
        System.out.println("Count: " + count);
        return count;
    }

    public void throwDice(int n) {
        rate = getSameCount(n) / (double)n;

        System.out.println("Rate: " + rate);
    }

}

