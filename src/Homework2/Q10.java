package Homework2;

public class Q10 {
    public static void main(String[] args) {
        // sorudaki değerlerin hepsi soru tarafından verilen değerler.
        int colaCount, coffeeCount, miliGram = 10000;
        colaCount = miliGram / 34;
        coffeeCount = miliGram / 160;
        System.out.printf("12 Onsluk kolalardan %d adet içerseniz aşırı doz olur.%n", colaCount);
        System.out.printf("16 Onsluk kahvelerden %d adet içerseniz aşırı doz olur.", coffeeCount);
    }
}
