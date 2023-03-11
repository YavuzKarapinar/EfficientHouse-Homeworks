/*
Weight is defined as the gravitational force acting on the mass of a body. The
weight of a body with a mass of 1kg on Earth can be calculated with the formula
given below. The weight is expressed in Newtons (N).

Weight on earth = (1 kg) * (9.81 m/s2) = 9.81 N
 The weight of the same body in N can be calculated with another formula:
Weight on moon = ((1 kg) * (9.81 m/s2)) / 6 = 1.64 N

Write a program that takes as input the mass of a car in kilograms and then prompts
the user to choose to calculate the car’s weight in Newtons either on Earth or on
the Moon. The program should allow the user to enter new values and output the
car’s weight on Earth or on the Moon till the user decides to exit. Use the double
data type to store the mass.
*/
package homework05;

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
