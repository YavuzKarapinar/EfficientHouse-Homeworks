/*
Write a program that starts with the string variable first set to your first name
and the string variable last set to your last name. Both names should be all lowercase. Your program should then create a new string that contains your full name in
pig latin with the first letter capitalized for the first and last name. Use only the pig
latin rule of moving the first letter to the end of the word and adding “ay.” Output
the pig latin name to the screen. Use the substring and toUpperCase methods
to construct the new name.

For example, given

 first = "walt";
 last = "savitch";

the program should create a new string with the text “Altway Avitchsay” and print it.
*/
package homework1;

public class Q3 {
    public static void main(String[] args) {
        
        String first = "walt", last = "savitch";
        char firstChar = first.charAt(0);
	    char lastChar = last.charAt(0);


        first = first.substring(1);
        first = first + firstChar + "ay";
        last = last.substring(1);
        last = last + lastChar + "ay";

        
        first = first.toUpperCase();
        firstChar = first.charAt(0);
        first = first.substring(1);
        first = first.toLowerCase();
        first = firstChar + first;

        
        last = last.toUpperCase();
        lastChar = last.charAt(0);
        last = last.substring(1);
        last = last.toLowerCase();
        last = lastChar + last;


        String fullName = first + " " + last;
        System.out.println(fullName);
    }    
}