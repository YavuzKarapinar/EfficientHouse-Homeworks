package Homework2;

public class Q3 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Lütfen isim ve soyisim giriniz: ");
        String first = scanner.next();
        String last = scanner.next();
        char firstChar = first.charAt(0), lastChar = last.charAt(0);

        // first ve last'ın isimlerini istenilen şekle göre değiştirme altway avitchsay
        first = first.substring(1);
        first = first + firstChar + "ay";
        last = last.substring(1);
        last = last + lastChar + "ay";

        // first'ün ilk karakterini büyük yapma.
        first = first.toUpperCase();
        firstChar = first.charAt(0);
        first = first.substring(1);
        first = first.toLowerCase();
        first = firstChar + first;

        // last'ın ilk karakterini büyük yapma.
        last = last.toUpperCase();
        lastChar = last.charAt(0);
        last = last.substring(1);
        last = last.toLowerCase();
        last = lastChar + last;

        String fullName = first + " " + last;

        System.out.println(fullName);
    }
}
