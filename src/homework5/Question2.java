package homework5;

public class Question2 {
    public static void main(String[] args) {
        displayAndRun();
    }

    public static void displayAndRun() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Make a color pattern(It should be include just R,G and B): ");
        String pattern = scanner.nextLine();

        if(pattern.length() == 5)
            checkColors(pattern);
        else
            System.out.println("Your color pattern's lenght must be 5!");
    }

    public static void checkColors(String colorPattern) {

        for(int i = 0; i<colorPattern.length(); i++) {
            if(i != colorPattern.length() -1 && colorPattern.charAt(i) == colorPattern.charAt(i+1)) {
                System.out.println("Adjacent colors can not be the same!");
                return;
            }
        }

        System.out.println(colorPattern);

    }

}
