package Homework2;

public class Q2 {
    public static void main(String[] args) {
        int ticket, candyBar, gumball;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Ticket Amount: ");
        ticket = scanner.nextInt();

        candyBar = ticket / 10;
        ticket = ticket % 10;
        gumball = ticket / 3;
        ticket = ticket % 3;

        System.out.printf("Alabileceğin Candy Bar sayısı: %d, Gumball sayısı: %d, geriye kalan ticket sayısı: %d", candyBar, gumball, ticket);
    }
}
