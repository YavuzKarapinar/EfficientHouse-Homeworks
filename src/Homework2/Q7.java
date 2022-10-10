package Homework2;

public class Q7 {
    public static void main(String[] args) {
        int hours, minutes, seconds, total;

        total = 50391; // soruda verilen bir değer ondan dolayı scanner eklenmedi.

        hours = total / 3600;
        minutes= (total % 3600)/60;
        seconds= total%60;
        System.out.printf("saat: %d, dakika: %d, saniye: %d", hours, minutes,seconds);
    }
}
