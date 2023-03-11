/*
A designer is trying to create a new pattern of five stripes using three colors. These
colors and their codes are mentioned in the table below.

Color Character Code
Red R
Green G
Blue B

The designer has to keep in mind that no two adjacent stripes are of the same color.
For example, RRGBR is an invalid pattern, but RGBRB is valid.
Write a program that accepts a sequence of five colors as input from the designer to
form the pattern. At each selection the designer makes, the program should check if
the input is from among the available set of colors. Also, the program should check
that adjacent colors are not the same. At the end, the program should display the
final stripe pattern created.
*/
package homework05;

public class Question2 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int counter = 0;
        String sequence = "";
        String oldChar = "";

        while (counter < 5) {
            System.out.print("Input a character: ");
            String character = scanner.next();

            sequence = sequence + pattern(character, oldChar);
            System.out.println(sequence);

            oldChar = character;
            counter++;
        }
    }

    public static String pattern(String character, String oldChar) {

        if(!character.equalsIgnoreCase("r") && !character.equalsIgnoreCase("g") && !character.equalsIgnoreCase("b"))
            return "";
        else {
            if(!oldChar.equals(character)) {
                return character;
            } else
                return "";
        }
    }
}
