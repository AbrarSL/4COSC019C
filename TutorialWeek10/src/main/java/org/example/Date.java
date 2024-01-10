package org.example;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (day > 31 || day < 1) {
            return;
        }

        this.day = day;
    }

    public void addDays(int days) {
        int newDay = this.day + days;
        int newMonth = this.month + (newDay / 31);
        int newYear = this.year + (newMonth / 12);

        newDay = newDay % 31;
        newMonth = newMonth % 12;

        this.setDay(newDay);
        this.setMonth(newMonth);
        this.setYear(newYear);
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month > 12 || month < 1) {
            return;
        }

        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year > 2079 || year < 1980) {
            return;
        }

        this.year = year;
    }

    public String getDate() {
        return String.format(
                "%02d/%02d/%02d",
                this.day,
                this.month,
                this.year
        );
    }

    public void printDate() {
        System.out.printf(
                "%d/%d/%d%n",
                this.day,
                this.month,
                this.year
        );
    }

    @Override
    public String toString() {
        return String.format("Date [day = %02d, month = %02d, year = %04d]", this.day, this.month, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!getClass().isInstance(obj))
            return false;

        Date other = (Date) obj;

        return (this.getYear() == other.getYear() &&
                this.getMonth() == other.getMonth() &&
                this.getDay() == other.getDay());
    }
}
