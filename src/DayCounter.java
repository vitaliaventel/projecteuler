/**
 * Created by Vitalii Leshchenko on 09.08.2017.
 */

import java.util.Calendar;
import java.util.Date;

/**
 * You are given the following information, but you may prefer to do some research for yourself.
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

public class DayCounter {

    public static int sundaysBetweenDates(Date start, Date finish) {
        int sundays = 0;
        Calendar cal = Calendar.getInstance();
        while (!start.equals(finish)) {
            cal.setTime(start);
            cal.set(Calendar.HOUR, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            if ((cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) && (cal.get(Calendar.DAY_OF_MONTH) == 1)) {
                sundays++;
            }
            cal.add(Calendar.DATE, 1);
            start = cal.getTime();
        }
        return sundays;
    }
}
