package com.company;
import java.util.ArrayList;
import java.util.Date;


class Programme{

}

class Organizer{
    ArrayList<Programme> programmes;

    public Organizer(ArrayList<Programme> programmes) {

    }

    public void bookVenue(){
        System.out.println("Venue Is book Successfully :)");
    }
}

class Administrator{
    private double limitShouldbe = 10000;

    boolean assessVenue(int capacity,boolean safe, boolean healthy){
        boolean valueof = false;
        if(safe && healthy && capacity < limitShouldbe){
            valueof = true;
        }
        return valueof;
    }

}
public class Test
{
    public static void main(String[] args)
    {
        Date athleteDate= new Date("February",1993,5);
        Date athlete2Date= new Date("November",1990,20);
        Date progDate= new Date("May", 2018,10);
        Programme programme= new Programme(1, "Kabaddi", progDate,"10:00 PM", "Pakistan");
        Programme programme1= new Programme(2, "Tennis", new Date("March",2019,2),"12:00","MAJU");
        Athletes[] athletes= new Athletes[2];
        athletes[0]= new Athletes("Sultan ","Lyari", athleteDate, programme);
        athletes[1]= new OverseasAthletes("Sania Mirza ", "Mumbai",athleteDate, programme1);
        ((OverseasAthletes)athletes[1]).applyForVisa(true);
        for(int i=0;i<athletes.length;i++) {

            System.out.println(athletes[i].toString());
            athletes[i].registerForEvent();
        }
        ArrayList<Programme> programmes= new ArrayList<Programme>();
        programmes.add(programme);
        programmes.add(programme1);

        Administrator admin= new Administrator();
        if(admin.assessVenue(15000, true, true))
        {
            Organizer organize= new Organizer(programmes);
            organize.bookVenue();
            organize.produceSchedule();
            organize.programCompleted();
            organize.produceResultsTable();
            admin.produceMedalTable();

        }
    }

}

public class Question4 {
}
