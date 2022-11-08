package homework5;

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
