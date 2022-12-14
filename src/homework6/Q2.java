package homework6;

public class Q2 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input seconds: ");
        long seconds = scanner.nextLong();

        if(seconds <= 0) {
            System.out.println("Sayı negatif veya 0 olamaz.");
            return;
        }

        displayDuration(seconds);

    }

    public static void displayDuration(long seconds) {
        long hours = seconds / 3600;
        seconds %= 3600;

        long minutes = seconds / 60;
        seconds %= 60;

        System.out.println(textOfDuration(hours, minutes, seconds));

    }

    public static String textOfDuration(long hours, long minutes, long seconds) {

        String hourText = hours != 0 ? hours + " saat " : "";
        String minuteText = minutes != 0 ? minutes + " dakika " : "";
        String secondText = seconds != 0 ? seconds + " saniye " : "";

        return hourText + minuteText + secondText;
    }
}
