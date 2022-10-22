package homework2;

public class Q3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Lütfen bir sayi giriniz:");
        int number = scanner.nextInt();
        int numberSign = signum(number);

        System.out.println("Sayının işareti: " + numberSign);


    }

    public static int signum(int number) {

        if(number > 0) // sayı 0'dan büyükse 1 döner
            return 1;
        else if(number < 0) // sayı 0'dan küçükse -1 döner
            return -1;

        return 0; // her iki koşul da sağlanmıyorsa 0 döner.
    }
}
