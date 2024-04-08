package src.lang.immutable.test;

public class ImmuableMyDate {
    private final int year, month, day;

    public ImmuableMyDate(int year, int month, int day) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public ImmuableMyDate withYear(int newYear){
        return new ImmuableMyDate(newYear, month, day);
    }
    public ImmuableMyDate withMonth(int newMonth){
        return new ImmuableMyDate(year, newMonth, day);
    }
    public ImmuableMyDate withDay(int newDay){
        return new ImmuableMyDate(year, month, newDay);
    }



    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
