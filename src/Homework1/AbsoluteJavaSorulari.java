package Homework1;

import java.util.Scanner;

public class AbsoluteJavaSorulari {
    public static void main(String[] args) {
        /*
        // 1. soru vücut kitle indeksi
        double kilogram, meter, bmi;

        kilogram = 60;
        meter = 1.7;

        bmi = kilogram / (meter * meter);

        System.out.printf("Vücut kitle indeksi: %.2f", bmi);
        */

        /*
        // 2. soru şeker sakız sorusu
        int ticket, candyBar, gumball;
        ticket = 128;

        candyBar = ticket / 10;
        ticket = ticket % 10;
        gumball = ticket / 3;
        ticket = ticket % 3;

        System.out.printf("Alabileceğin Candy Bar sayısı: %d, Gumball sayısı: %d, geriye kalan ticket sayısı: %d", candyBar, gumball, ticket);
        */

        /*
        // 3. soru

        String first = "walt", last = "savitch";
        char firstChar = first.charAt(0), lastChar = last.charAt(0);

        // first ve last'ın isimlerini istenilen şekle göre değiştirme altway avitchsay
        first = first.substring(1);
        first = first + firstChar + "ay";
        last = last.substring(1);
        last = last + lastChar + "ay";

        // first'ün ilk karakterini büyük yapma.
        first = first.toUpperCase();
        firstChar = first.charAt(0);
        first = first.substring(1);
        first = first.toLowerCase();
        first = firstChar + first;

        // last'ın ilk karakterini büyük yapma.
        last = last.toUpperCase();
        lastChar = last.charAt(0);
        last = last.substring(1);
        last = last.toLowerCase();
        last = lastChar + last;

        String fullName = first + " " + last;

        System.out.println(fullName);
        */

        /*
        // 4. soru
        double amountToKill = 0.1, mouseWeight = 2.5, afterDiet = 85, beforeDiet = 150;
        final double PERCENT = 0.001;
        double sodaForSafeUse = ((amountToKill / mouseWeight) * afterDiet) / PERCENT;
        System.out.println("Ölmeden içebileceğin soda sayısı: " + sodaForSafeUse);
        */

        /*
        // 5. soru
        String text = "I hate you";
        String newText = text.replaceFirst("hate", "love");

        System.out.println(newText);
        */

        /*
        // 6. soru
        double principalAmount = 1000, interestRate = 5, numberOfYears = 5, simpleInterest;

        simpleInterest = (principalAmount * interestRate * numberOfYears) / 100;

        System.out.println(simpleInterest);
         */

        /*
        // 7. soru
        int hours, minutes, seconds, total, temp;

        total = 50391;

        hours = total / 3600;
        minutes= (total % 3600)/60;
        seconds= total%60;
        System.out.printf("saat: %d, dakika: %d, saniye: %d", hours, minutes,seconds);
         */

        /*
        // 8. soru
        double time;
        System.out.println("This program calculates vehicle average speed given a time and distance traveled.");
        time = 20.5;
        double average_speed = DISTANCE / time;
        System.out.println("Car average speed is " + average_speed + " miles per hour.");
         */

        /*
        // 9. soru
        int feet = 6, inch = 5, pound = 110;
        feet -= 5;
        inch = inch + (feet * 12);
        pound = pound + (inch * 5);

        System.out.println(pound);
         */

        /*
        // 10. soru
        int colaCount, coffeeCount, miliGram = 10000;
        colaCount = miliGram / 34;
        coffeeCount = miliGram / 160;
        System.out.printf("12 Onsluk kolalardan %d adet içerseniz aşırı doz olur.%n", colaCount);
        System.out.printf("16 Onsluk kahvelerden %d adet içerseniz aşırı doz olur.", coffeeCount);
        */
    }
    public static final double DISTANCE = 180;

}
