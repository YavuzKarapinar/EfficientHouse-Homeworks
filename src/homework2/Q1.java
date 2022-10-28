package homework2;

public class Q1 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Sayilari giriniz: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        siralama(a, b, c);
    }

    public static void siralama(int a, int b, int c) {

        int higher = hangisiBuyuk(hangisiBuyuk(a, b), c);
        int lower = hangisiKucuk(hangisiKucuk(a, b), c);
        int middle = a + b + c - higher - lower;

        String middleLowerCheck = lower == middle ? "=" : "<";
        String middleHigherCheck = middle == higher ? "=" : "<";
        System.out.printf("%d%s%d%s%d", lower, middleLowerCheck, middle, middleHigherCheck, higher);

    }

    public static int hangisiBuyuk(int a, int b) {
        if(a >= b)
            return a;
        else
            return b;
    }
    public static int hangisiKucuk(int a, int b) {
        if(a <= b)
            return a;
        else
            return b;
    }


}
