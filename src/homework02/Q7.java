/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes,
and 51 seconds. Test your program with a different number of total seconds to
ensure that it works for other cases.
*/
package homework02;

public class Q7 {
    public static void main(String[] args) {
        int hours, minutes, seconds, total;
        java.util.Scanner kb = new java.util.Scanner(System.in);

        total = kb.nextInt();

        hours = total / 3600;
        minutes= (total % 3600)/60;
        seconds= total%60;
        System.out.printf("saat: %d, dakika: %d, saniye: %d", hours, minutes,seconds);
    }
}
