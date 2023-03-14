package homework11;

public class HowManyElevenIncludes {
    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Enter number: ");
        long number = kb.nextLong();

        int includesEleven = howManyElevenIncludes(number);

        System.out.printf("Includes %d elevens", includesEleven);

    }

    public static int howManyElevenIncludes(long number) {
        int includesEleven = 0;

        String len = "" + number;
        int place = len.length() -1;

        while (place >= 0) {

            long temp = number;

            temp %= 100;
            //System.out.println("Temp: " + temp);

            number /= 10;
            //System.out.println("Number: " + number);

            if(temp == 11) {
                includesEleven++;
                System.out.println("Eleven in the " + place + "th place");
            }

            place--;

        }

        return includesEleven;
    }

}

class Main {
    public static void main(String[] args) {
        HowManyElevenIncludes.run();
    }
}
