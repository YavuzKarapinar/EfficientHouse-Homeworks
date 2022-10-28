package homework2;

public class Q2 {
    public static void main(String[] args) {

        int mid = mid(9,6,7);

        System.out.println(mid);

    }

    public static int mid(int a, int b, int c) {

        if((a >= b && a <= c) || (a <= b && b >= c))
            return a;

        if((a <= b && b <= c) || (a >= b && b >= c))
            return b;

        return c;
    }
}
