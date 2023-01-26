/*
Write a program that starts with a line of text and then outputs that line of text
with the first occurrence of "hate" changed to "love". For example, a possible
sample output might be

The line of text to be changed is:
 I hate you.
 I have rephrased that line to read:
 I love you.

You can assume that the word "hate" occurs in the input. If the word "hate"
occurs more than once in the line, your program will replace only the first occurrence of "hate". Since we will not discuss input until Chapter 2, use a defined
constant for the string to be changed. To make your program work for another
string, you should only need to change the definition of this defined constant.

*/
package homework2;

public class Q5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Text: ");
        String text = scanner.nextLine();


        String newText = text.replaceFirst("hate", "love");

        System.out.println(newText);
    }
}
