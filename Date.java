public class Date{
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void set_month(int month){
        this.month = month;
    }

    public int get_month(){
        return month;
    }

    public void set_day(int day){
        this.day = day;
    }

    public int get_day(){
        return day;
    }

    public void set_year(int year){
        this.year = year;
    }

    public int get_year(){
        return year;
    }

    public void displayDate(){
        System.out.printf("Date is %d/%d/%d%n", get_month(), get_day(), get_year());


    }
}