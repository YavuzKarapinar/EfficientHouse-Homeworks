package homework3;

 /*
    150 tl ve üzeri indirimlerde fiyatı verilen ürüne belirli miktarda indirim yapılmasını sağlayan algoritma
 */

public class IndirimliUrun {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Lütfen indirim yapılacak ürünün fiyatını giriniz: ");
        double product = scanner.nextInt();

        double discountedProduct = discount(product, 75, 20);

        System.out.printf("Ürünün son fiyatı: %.2f", discountedProduct);

    }

    public static double discount(double product, int minPrice, int percent) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Ürün giriniz: (Exit: 0)");
        int products, sum = 0;

        while((products = scanner.nextInt()) > 0) {
            sum += products;
        }

        if(sum > minPrice) {
            return product - (product*percent)/100.;
        }

        return product;
    }
}
