package homework5;

public class Question3 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {

            System.out.print("Choose the process(Earth: e, Moon: m, Exit: q)");
            String earthOrMoon = scanner.next();

            if(!earthOrMoon.equalsIgnoreCase("e") && !earthOrMoon.equalsIgnoreCase("m"))
                break;

            System.out.print("Mass of car: ");
            double mass = scanner.nextDouble();

            weight(mass, earthOrMoon);

        }
    }

    public static void weight(double mass, String earthOrMoon) {
        double result;

        if(earthOrMoon.equalsIgnoreCase("e")) {
            result = (mass) * (9.81);
            System.out.printf("Weight of the car is on the Earth: %.2fN %n", result);

        }
        if(earthOrMoon.equalsIgnoreCase("m")) {
            result = ((mass) * (9.81)) / 6;
            System.out.printf("Weight of the car is on the Moon: %.2fN %n", result);
        }
    }
}
