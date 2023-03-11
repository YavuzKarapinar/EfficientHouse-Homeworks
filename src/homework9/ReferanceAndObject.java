package homework9;

public class ReferanceAndObject {
    public static void main(String[] args)
    {
        B x, y, z;

        x = new B(10, true);
        y = new B(20, false);
        z = new B();

        z = x;

        System.out.println(z.a);
        System.out.println(z.b);

        z.a++;

        System.out.println(x.a);

        y = z;

        System.out.println(y.a);
        System.out.println(y.b);

        y.b = false;
        y.a--;

        System.out.println(x.a);
        System.out.println(x.b);

    }
}

class B {
    public int a;
    public boolean b;

    public B(int newA, boolean newB) {
        a = newA;
        b = newB;
    }

    public B() {

    }

}