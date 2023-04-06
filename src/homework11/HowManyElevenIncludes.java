package homework11;

public class HowManyElevenIncludes {
    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Enter number: ");
        long number = kb.nextLong();
        System.out.print("Which number do you want to search?");
        int wantedNumber = kb.nextInt();

        int includesNumber = includesWantedNumber(String.valueOf(number), String.valueOf(wantedNumber));

        System.out.printf("Includes %d elevens", includesNumber);
    }

    public static int includesWantedNumber(String number, String wantedNumber) {

        String str;
        int includedNumber = 0;

        for(int i = 0; i < number.length(); i++) {

            if(i != number.length() - 1) {
                str = String.valueOf(number.charAt(i) + number.charAt(i + 1));

                if(str.equals(wantedNumber)) {
                    includedNumber++;
                    System.out.printf("%s is in the %dth place%n", wantedNumber, i + 1);
                }
            }

        }
        return includedNumber;
    }

}

class Main {
    public static void main(String[] args) {
        HowManyElevenIncludes.run();
    }
}
