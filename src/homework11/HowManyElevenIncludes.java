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

            if(wantedNumberCheck(number, wantedNumber)) {
                includesNumber++;
                System.out.println(wantedNumber + " in the " + place + "th place");
            }

            number /= 10;

            place--;
        }

        return includesNumber == 0 ? -1 : includesNumber;
    }

    public static boolean wantedNumberCheck(long number, int wantedNumber) {
        long digit = (long) Math.pow(10, countDigits(wantedNumber));

        return number % digit == wantedNumber;
    }

    public static int countDigits(int a) {

        int count = 0;

        do {
            a /= 10;
            count++;
        }
        while (a > 0);

        return count;
    }

}

class Main {
    public static void main(String[] args) {
        HowManyElevenIncludes.run();
    }
}
