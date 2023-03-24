package homework11;

public class HowManyElevenIncludes {
    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Enter number: ");
        long number = kb.nextLong();
        System.out.print("Which number do you want to search?");
        int wantedNumber = kb.nextInt();

        int includesNumber = includesSpecificNumber(number, wantedNumber);

        System.out.printf("Includes %d elevens", includesNumber);

    }

    public static int includesSpecificNumber(long number, int wantedNumber) {
        int includesNumber = 0;

        String len = "" + number;
        int place = len.length() - 1;

        while (place >= 0) {

            long temp = number;

            temp %= 100;

            number /= 10;

            if(wantedNumberCheck(temp, wantedNumber)) {
                includesNumber++;
                System.out.println("Eleven in the " + place + "th place");
            }

            place--;
        }

        return includesNumber;
    }

    public static boolean wantedNumberCheck(long number, int wantedNumber) {
        return number == wantedNumber;
    }

}

class Main {
    public static void main(String[] args) {
        HowManyElevenIncludes.run();
    }
}
