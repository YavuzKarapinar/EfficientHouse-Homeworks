package Homework2;

public class Q5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Text: ");
        String text = scanner.nextLine();
        // text hate içermelidir.

        String newText = text.replaceFirst("hate", "love");

        System.out.println(newText);
    }
}
