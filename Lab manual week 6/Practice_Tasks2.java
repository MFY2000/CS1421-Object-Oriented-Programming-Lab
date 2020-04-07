import java.util.ArrayList;
import java.util.Scanner;


public class Appointment{
    private int day;
    private int month;
    private int year;
    private String description;

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

    public String toString()
    {
        return "Your"+(occursOn(getDay(),getMonth(),getYear()) ? "","doesn't")+" have an appointments";
    }
}





public class Daily extends Appointment{

    private int[] daily;

    public Daily(int day, int month, int year, String description)
    {
        daily = new int[];
    }

    public boolean occursOn (int day)
    {
        daily.add(day);
        return true;
    }
}

public class Monthly extends Appointment{



    private ArrayList<Integer>monthly;

    public Monthly(int day, int month, int year, String description)
    {
        monthly = new ArrayList<Integer>();
    }

    public boolean occursOn (int month)
    {
        monthly.add(month);
        {
             String whatMonth = "" + monthly.size();
        }

        return true;
    }


import java.util.ArrayList;

public class OneTime extends Appointment{



    private ArrayList<Integer>oneTime;
    int oneAppointment;

    public OneTime(int day, int month, int year, String description)
    {
        oneTime = new ArrayList<Integer>();
    }

    public boolean occursOn (int day, int month, int year)
    {
        oneTime.add(oneAppointment);
        {
             String whatMonthDayYear = "" + oneTime.size();
        }

        return true;
    }



public class Practice_Tasks2{



    public static void main(String[] args){
        Appointment[] appointments = new Appointment [4];
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
