package homework9;

public class TwoReferenceOneInstance {
    public static void main(String[] args)
    {
        A z;
        A y;

        z = new A(5, true);
        y = z;

        System.out.println(y.x);
        System.out.println(y.b);

        y.x = 10;
        y.b = false;

        System.out.println(z.x);
        System.out.println(z.b);
    }
}

class A {
    public int x;
    public boolean b;

    public A(int newX, boolean newB) {
        x = newX;
        b = newB;
    }
}