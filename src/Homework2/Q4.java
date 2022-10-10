package Homework2;

public class Q4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Amount to Kill: ");
        double amountToKill = scanner.nextDouble();
        System.out.println("Mouse Weight: ");
        double mouseWeight = scanner.nextDouble();
        System.out.println("Weight After Diet: ");
        double afterDiet = scanner.nextDouble();
        System.out.println("Weight Before Diet: ");
        double beforeDiet = scanner.nextDouble();

        final double PERCENT = 0.001; // sabit scanlemeye gerek yok

        double sodaForSafeUse = ((amountToKill / mouseWeight) * afterDiet) / PERCENT;

        System.out.println("Verilen kilo: " + (beforeDiet - afterDiet));
        System.out.println("Ölmeden içebileceğin soda sayısı: " + sodaForSafeUse);
    }
}
