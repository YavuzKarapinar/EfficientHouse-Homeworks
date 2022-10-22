package homework2;

public class Q1 {
    public static void main(String[] args) {
        sayilariAl();
    }

    public static void sayilariAl() { //sayıları kullanıcıdan alma
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();
        siralama(sayi1, sayi2, sayi3); // ekrana yazmak için değerleri methoda verme
    }

    public static void siralama(int sayi1, int sayi2, int sayi3) { // ekrana yazma
        int higher = hangisiBuyuk(hangisiBuyuk(sayi1, sayi2), sayi3); // en buyuk değeri bulma
        int lower =hangisiKucuk(hangisiKucuk(sayi1, sayi2), sayi3); // en küçük değeri bulma
        int middle = hangisiKucuk(hangisiKucuk(sayi1, hangisiBuyuk(sayi2, sayi3)), higher); // ortanca değeri bulma
        System.out.printf("Kucuk: %d, Ortanca: %d Büyük: %d", lower, middle, higher);
    }

    public static int hangisiBuyuk(int sayi1, int sayi2) {
        if(sayi1 > sayi2) // büyük sayıyı bulma
            return sayi1;
        else
            return sayi2;
    }
    public static int hangisiKucuk(int sayi1, int sayi2) {
        if(sayi1 < sayi2) // küçük sayıyı bulma
            return sayi1;
        else
            return sayi2;
    }

}
