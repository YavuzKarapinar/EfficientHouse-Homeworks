/*
Program will take an input number and it will display this number's prime factor numbers.
*/
package homework06;

public class Q3 {

    public static void main(String[] args) {
        display();
    }

    public static void display() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        primeFactor(number);

    }

    public static void primeFactor(int number) {
        if(number < 2) {
            System.out.println("The number cannot be lower than 2.");
            return;
        }

        System.out.print(number +": ");
        for(int i = 2; i <= number; i++)
            while(number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
    }

}
