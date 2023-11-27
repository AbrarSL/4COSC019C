public class Date {
    private int day = 1;
    private int month = 1;
    private int year = 1980;

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

    @Override
    public String toString() {
        return String.format("Date [day = %02d, month = %02d, year = %04d]", this.day, this.month, this.year);
    }
}