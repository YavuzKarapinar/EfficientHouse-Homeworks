package homework2;

public class Q2 {
    public static void main(String[] args) {
        int mid = mid(9,6,7);
        System.out.println(mid);

    }

    public static int mid(int sayi1, int sayi2, int sayi3) {

        if((sayi1 >= sayi2 && sayi1 <= sayi3) || (sayi1 <= sayi2 && sayi2 >= sayi3)) // 1. sayının ortada olduğu koşullar
            return sayi1;
        if((sayi1 <= sayi2 && sayi2 <= sayi3) || (sayi1 >= sayi2 && sayi2 >= sayi3)) // 2. sayının ortada olduğu koşullar
            return sayi2;

        return sayi3; // 3. sayının ortada olduğu koşul

    }
}
