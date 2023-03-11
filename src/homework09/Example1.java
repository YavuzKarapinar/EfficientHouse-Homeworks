package homework09;

public class Example1 {
    public static void main(String[] args)
    {
        Sample s , k;

        s = new Sample(10, true);
        k = new Sample(20, false);

        System.out.println(s.x);
        System.out.println(s.b);
        System.out.println("-----------------------------------");
        System.out.println(k.x);
        System.out.println(k.b);
    }
}

class Sample {
    int x;
    boolean b;

    public Sample(int newX, boolean newB) {
        x = newX;
        b = newB;
    }
}