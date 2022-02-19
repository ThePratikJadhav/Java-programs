import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayDateTime {
    public static void main(String[] args) {
        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);
        int min = time.get(Calendar.MINUTE);
        int day = time.get(Calendar.DAY_OF_MONTH);
        int month = time.get(Calendar.MONTH) + 1;
        int year = time.get(Calendar.YEAR);

        System.out.println("The current time is \t" + hour + ":" + min);
        System.out.println("Today's date is \t" + month + "/" + day + "/"
                + year);

        if (hour < 12)
            System.out.println("Good Morning!");
        else if (hour < 17 && !(hour == 12))
            System.out.println("Good Afternoon");
        else if (hour == 12)
            System.out.println("Good Noon");
        else
            System.out.println("Good Evening");
    }
}
