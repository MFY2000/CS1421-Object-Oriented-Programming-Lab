import java.util.ArrayList;
import java.util.Scanner;


public class Appointment{
    private int day;
    private int month;
    private int year;
    private String description;

    Appointment(int day, int month, int year, String description){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);

    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

    boolean occursOn (int day, int month, int year)
    {
        if( (this.day == day) || (this.month == month) || (this.year == year))
            {
                return true;
            }
        else 
        {
            return false;
        }
    }

}





public class Daily extends Appointment{

    private int daily;

    public Daily(int day, int month, int year, String description){
        super(day, month, year, description);
    }

    public boolean occursOn (int day)
    {
        daily.add(day);
        return true;
    }
}

public class Monthly extends Appointment{
    private int monthly;

    public Monthly(int day, int month, int year, String description){
        super(day, month, year, description);    
    }

    public boolean occursOn (int month)
    {
        monthly.add(month);
        return true;
    }
}

public class OneTime extends Appointment{

    private int oneTime;
    int oneAppointment;

    public OneTime(int day, int month, int year, String description)
    {
        super(day, month, year, description);
    }

    public boolean occursOn (int day, int month, int year)
    {
        oneTime.add(oneAppointment);
        return true;
    }



public class Practice_Tasks2{
    public static void main(String args){
        Appointment appointments = new Appointment [4];
        appointments[0] = new Daily (2, 10, 2018, "Brush your teeth.");
        appointments[1] = new Monthly (2, 10, 2018, "Brush your teeth.");
        appointments[2] = new OneTime (2, 10, 2018, "Brush your teeth.");

        System.out.println("Enter a date (month, day, year) to list" + "appointments: ");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        for (int i = 0; i < appointments.length; i++){
            if (appointments[i].occursOn(month, day, year)){
                System.out.println(appointments[i]);
            }
        }
    }
 }
