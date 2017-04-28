package com.example.fujiwara.youareold;

import android.support.v7.app.AppCompatActivity;

import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Weeks;
import org.joda.time.Years;

/**
 * Created by Bruno Ramires on 27/04/2017.
 */

public class User extends AppCompatActivity implements Date {

    LocalDate birthDate;
    LocalDate currentDate = new LocalDate();

    boolean isFromTheFuture;

    int daysLived;
    int yearsLived;
    int monthsLived;
    int weeksLived;
    int secondsLived = 0;
    int minutesLived;
    int hoursLived;

    public User() {
    }

    @Override
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public void setBirthDate(int year, int month, int day) {

        LocalDate birthDate = new LocalDate(year, month, day);

        isFromTheFuture = birthDate.isAfter(currentDate);
        this.birthDate = birthDate;
    }

    public int getDaysLived() {
        return daysLived =
                Days.daysBetween(birthDate, currentDate).getDays();
    }

    public int getYearsLived() {
        return yearsLived =
                Years.yearsBetween(birthDate, currentDate).getYears();
    }

    public int getMonthsLived() {
        return monthsLived =
                Months.monthsBetween(birthDate, currentDate).getMonths();
    }

    public int getWeeksLived() {
        return weeksLived =
                Weeks.weeksBetween(birthDate, currentDate).getWeeks();
    }

//    public int getSecondsLived() {
//        return secondsLived =
//                Seconds.secondsBetween(birthDate, currentDate).getSeconds();
//    }

    public int getMinutesLived() {
        return minutesLived =
                Minutes.minutesBetween(birthDate, currentDate).getMinutes();
    }

    public int getHoursLived() {
        return hoursLived =
                Hours.hoursBetween(birthDate, currentDate).getHours();
    }
}