package homework6;

public class Q4 { // hatalı
    public static void main(String[] args) {
        int heigth = 5, width = 5, counter = 0;
        for(int i = 0; i < 5; i++) {

            System.out.print("|");


            for(int j = 0; j < width; j++) {
                if(counter == j) System.out.print("*");
                else System.out.print(" ");
                counter++;
            }

            counter = 0;
            System.out.print("|");
            System.out.println();
        }
    }
}
