/*
Program will execute signum method and will return the input number's sign.
*/
package homework3;
public class Q3 {
    public static void main(String[] args) {
        display();
    }
    
    public static void display() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input number:");
        int number = scanner.nextInt();
        int numberSign = signum(number);

        System.out.println("Sign of number is: " + numberSign);
        
    }

    public static int signum(int number) {

        if (number > 0)
            return 1;
        else if (number < 0)
            return -1;

        return 0;
    }
}