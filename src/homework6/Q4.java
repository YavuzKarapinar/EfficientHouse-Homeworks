/*
Program will taken input heigth and input width and it will display rebounded star with stars in loops.
For example:
|*    |
| *   |
|  *  |
|   * |
|    *|
|   * |
|  *  |
| *   |
|*    |
| *   |
*/
package homework6;

public class Q4 { 
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input length and width: ");
        int heigth = scanner.nextInt();
        int width = scanner.nextInt();

        reboundedStar(heigth, width);

    }

    public static void reboundedStar(int heigth, int width) {
        boolean right = false;
        int counter = 0;

        for(int i = 0; i < heigth; i++) {

            System.out.print("|");


            if(!right) {
                makingStar(counter, width);
                counter++;
            }
            if(counter == width)
                right = true;

            if(right) {
                makingStar(counter, width);
                counter--;
            }

            if(counter == 0)
                right = false;

            System.out.print("|");
            System.out.println();
        }
    }

    public static void makingStar(int counter, int width) {
        for (int j = 0; j < width; j++) {
            if (counter == j) System.out.print("*");
            else System.out.print(" ");
        }
    }
}
