package homework5;

public class Question3 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {

            System.out.print("Choose the process(Earth: 1, Moon: 2, Exit:Other numbers)");
            int process = scanner.nextInt();

            if(process != 1 && process != 2)
                break;

            System.out.print("Mass of car: ");
            double mass = scanner.nextDouble();

            System.out.printf("The weight of the car is %.2fN%n", weight(mass, process));

        }
    }

    public static double weight(double mass, double process) {
        double result;

        if(process == 1) {
            result = (mass) * (9.81);
            return result;
        } else if(process == 2) {
            result = ((mass) * (9.81)) / 6;
            return result;
        } else {
            return 0.;
        }
    }
}
