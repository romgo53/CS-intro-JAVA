/**
 * Represents a date in the Gregorian calendar
 *
 * @author Rom Amikam Waidergoren
 * @version 30.10.2022
 */

public class Date {
    private int _day;
    private int _month;
    private int _year;

    private static final int DEFAULT_DAY = 1;
    private static final int DEFAULT_MONTH = 1;
    private static final int DEFAULT_YEAR = 2000;
    private static final int FIRST_DAY_OF_MONTH = 1;
    private static final int FIRST_MONTH_OF_YEAR = 1;
    private static final int LAST_MONTH_OF_YEAR = 12;
    private static final int MIN_YEAR = 1000;
    private static final int MAX_YEAR = 9999;

    /**
     * Initialize the Date object with the given parameters.
     * validate that the given date is valid otherwise the date
     * will be initialized to 1/1/2000.
     *
     * @param day:   The date's day.
     * @param month: The date's month.
     * @param year:  The date's year.
     */
    public Date(int day, int month, int year) {
        _day = day;
        _month = month;
        _year = year;
        if (!isValidDate(day, month, year)) {
            _day = DEFAULT_DAY;
            _month = DEFAULT_MONTH;
            _year = DEFAULT_YEAR;
        }
    }

    /**
     * Copy constructor
     *
     * @param other: The Date object that will be copied.
     */
    public Date(Date other) {
        _day = other._day;
        _month = other._month;
        _year = other._year;
    }

    /**
     * @return the date's day
     */
    public int getDay() {
        return _day;
    }

    /**
     * @return the date's month
     */
    public int getMonth() {
        return _month;
    }

    /**
     * @return the date's year
     */
    public int getYear() {
        return _year;
    }

    /**
     * set the date's day, validate that the given day is valid
     * if not the day will not be changed.
     * @param day the new day to set.
     */
    public void setDay(int day) {
        if (isValidDate(day, _month, _year))
            _day = day;
    }

    /**
     * set the date's month, validate that the given month is valid
     * if not, the month will not be change.
     * @param month the new month to set.
     */
    public void setMonth(int month) {
        if (isValidDate(_day, month, _year))
            _month = month;
    }

    /**
     * set the date's year, validate that the given year is valid
     * if not valid, the year won't change.
     * @param year the new year to set.
     */
    public void setYear(int year) {
        if (isValidDate(_day, _month, year))
            _year = year;
    }

    /**
     * Checks if that the given Date is equals to another Date .
     *
     * @param other: The other Date object.
     * @return True if the dates are equals, false otherwise.
     */
    public boolean equals(Date other) {
        return this.calculateDate() == other.calculateDate();
    }

    /**
     * Checks if this Date is before another Date .
     *
     * @param other: The other Date object.
     * @return True if this date is before, false otherwise.
     */
    public boolean before(Date other) {
        return this.calculateDate() < other.calculateDate();
    }

    /**
     * Checks if this Date is after another Date.
     *
     * @param other: The other Date object.
     * @return True if this date is after, false otherwise.
     */
    public boolean after(Date other) {
        return other.before(this);
    }

    /**
     * Computes the date differences between this date
     * and the given one.
     *
     * @param other: The other Date object.
     * @return The number of dates between these two dates.
     */
    public int difference(Date other) {
        return Math.abs(this.calculateDate() - other.calculateDate());
    }

    // computes the day number since the beginning of the Christian counting of years of this object
    private int calculateDate() {
        int tempMonth = _month, tempYear = _year;

        if (_month < 3) {
            tempYear = _year - 1;
            tempMonth = _month + 12;
        }
        return 365 * tempYear + tempYear / 4 - tempYear / 100 + tempYear / 400 + ((tempMonth + 1) * 306) / 10 + (_day - 62);
    }

    /**
     * Generates a String that represents this Date.
     *
     * @return A String that represents the Date.
     */
    public String toString() {
        String dayString = _day < 10 ? "0" + _day : "" + _day;
        String monthString = _month < 10 ? "0" + _month : "" + _month;
        return dayString + "/" + monthString + "/" + _year;
    }


    /**
     * Computes the next day of this date/
     * for example: 01/01/2000 -> 02/01/2000
     *
     * @return a Date object that represents the next day.
     */
    public Date tomorrow() {
        if (isValidDate(_day + 1, _month, _year))
            return new Date(_day + 1, _month, _year);
        else if (isValidDate(1, _month + 1, _year))
            return new Date(1, _month + 1, _year);
        else
            return new Date(1, 1, _year + 1);
    }

    /**
     * Checks if the given year
     * is a leap year.
     *
     * @param year: The date's year.
     * @return True if the year is a leap year, false otherwise.
     */
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /**
     * Checks how many days are in the given month.
     *
     * @param month: The date's month.
     * @param year:  The date's year.
     * @return The number of days in the given month.
     */
    private static int daysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }

    /**
     * Checks if that the given date is valid.
     *
     * @param day:   The date's day.
     * @param month: The date's month.
     * @param year:  The date's year.
     * @return True if the date is valid, false otherwise.
     */
    private static boolean isValidDate(int day, int month, int year) {
        if (!(month >= FIRST_MONTH_OF_YEAR && month <= LAST_MONTH_OF_YEAR))
            return false;
        if (!(year >= MIN_YEAR && year <= MAX_YEAR))
            return false;
        return day >= FIRST_DAY_OF_MONTH && day <= daysInMonth(month, year);

    }
}
