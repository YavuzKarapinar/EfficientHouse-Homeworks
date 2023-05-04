package homework12;

public class Capitalize {

    public static void main(String[] args) {

        String str = "Efficient House'a hosgeldin. Burasi Eren ve Akif hocamizin bilgilerini bize bahsettigi yer. Umarim sende keyif alirsin.";

        System.out.println(capitalizeParagraph(str));
    }

    public static String capitalizeParagraph(String str) {

        String result = "";
        int startIndex = 0, endIndex = 0;

        for(int i = 0; i < str.length(); i++) {

            if(endIndex == str.length() - 1)
                break;

            for(endIndex = startIndex; endIndex < str.length() && str.charAt(endIndex) != '.'; endIndex++);

            result += capitalize(str.substring(startIndex, endIndex + 1));

            startIndex = endIndex + 1;
        }

        return result;
    }

    public static String capitalize(String str)
    {
        int idx;

        for (idx = 0; idx < str.length() && !Character.isLetter(str.charAt(idx)); ++idx);

        return str.substring(0, idx) + Character.toUpperCase(str.charAt(idx)) + str.substring(idx + 1).toLowerCase();
    }

}
