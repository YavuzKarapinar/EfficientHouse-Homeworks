package homework09.date;

public class DateUtil {

    public static void changeDate(Date d, int day, int month, int year)
    {
        //...

        d.day = day;
        d.month = month;
        d.year = year;
    }

    public static Date createDate(int day, int month, int year)
    {
        Date date;
        date = new Date(day, month, year);

        return date; // Date temp = date
    }

    public static void printDate(Date date) // Date date = birthDate;
    {
        System.out.printf("%02d/%02d/%04d%n", date.day, date.month, date.year);
    }
}

class Date {
    public int day;
    public int month;
    public int year;

    public Date(int newDay, int newMonth, int newYear) {
        day = newDay;
        month = newMonth;
        year = newYear;
    }

    //...
}