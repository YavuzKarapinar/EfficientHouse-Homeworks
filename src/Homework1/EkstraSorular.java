package Homework1;

import java.util.Scanner;

public class EkstraSorular {
    public static void main(String[] args) {
        /* 1. soru
        * -Klavyeden elma girilene kadar alinan yazilarin arasinda - karakteri olacak
        sekilde birlestirimis bir String olusturan programi yaziniz.
        Ornek: ankara, istanbul, izmir, zonguldak girildiginde
        ankara-istanbul-izmir-zonguldak yazisi elde edilmelidir.
        * */ // döngüsüz bunu nasıl yaparız?

        /* 2. soru
        * Parametresi ile aldigi bir yazinin ilk harfi buyuk heri kalanlari kucuk olacak
	    sekilde bir yazi donduren capitalize isimli metodu yazinin ve test ediniz.
	    Girilen yazi: bugun hAVA cOk Guzel -> Bugun hava cok guzel
	    * */

        String metin, yeniMetin;
        Scanner scan = new Scanner(System.in);
        metin = scan.nextLine();

        metin = metin.toUpperCase();
        char temp = metin.charAt(0);
        metin = metin.toLowerCase();
        metin = metin.substring(1);
        yeniMetin = temp + metin;
        // ilk karakteri atamayı sor
        System.out.println(yeniMetin);

        /* 3. soru
        *
        * */


    }
}
