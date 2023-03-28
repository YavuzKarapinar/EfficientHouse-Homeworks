package homework11;


public class Interview {
    public static void main(String[] args) {

        //System.out.println(reverse("adakisikalipapilakisikada"));
        //System.out.println(isPalindrom("adakisikalipapilakisikada"));
        System.out.println(getLongestPalindrom("adakisikalipapilakisikada"));

    }

    public static String reverse(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);

        return rev;
    }

    public static boolean isPalindrom(String str) {
        return reverse(str).equals(str);
    }

    public static String getLongestPalindrom(String str) {

        int begin = 0;
        int end = str.length();
        String max = "";

        while (begin != end) {

            while (begin < end) {

                String temp = str.substring(begin, end--);

                if (isPalindrom(temp) && temp.length() > 1 && temp.length() > max.length())
                    max = temp;
            }

            begin++;
            end = str.length();
        }

        return max;
    }

}
