package com.company;
import java.util.ArrayList;
import java.util.Random;


class Programme{
    @Override
    public String toString() {
        return "Programme{" +
                "progId=" + progId +
                ", progName='" + progName + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }

    public int progId;
    public String progName;
    public Date date;
    public String time;
    public String Location;

    public Programme(int progId, String progName, Date date, String time, String Location) {
        this.progId = progId;
        this.progName=progName;
        this.date=date;
        this.time=time;
        this.Location=Location;
    }


}

class Organizer{
    ArrayList<Programme> programmes;

    public Organizer(ArrayList<Programme> programmes) {
        this.programmes = programmes;
    }

    public void bookVenue(){
        System.out.println("Venue Is book Successfully :)");
    }

    public void produceSchedule() {
        System.out.println("All the produce Schedule is Successful");
    }

    public void programCompleted() {
        System.out.println("The whole program Complete Successful");
    }

    public void produceResultsTable(){
        System.out.println("Recording the positions of each athlete");
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

    public void produceMedalTable() {
        System.out.println("For now, the method should just print a statement.");
    }
}

class Athletes{
    String name;
    String place;
    Date date;
    Programme programme;
    int Age;

    public Athletes(String name, String place, Date date, Programme programme) {
        this.name = name;
        this.place = place;
        this.date = date;
        this.programme = programme;
        calculateAge();
    }

    public void calculateAge(){
        Age = date.Year - 2020;// for getting the age
    }

    public void registerForEvent() {
        System.out.println("Successfully Register for the event:)");
    }
    public String toString(){
        return "name = "+name+"\n" +"place = "+place+"\n" +"date = "+date+"\n" +"programme = "+programme+"\n" +"Age="+Age;
    }

}

class OverseasAthletes extends Athletes{
    Random rand = new Random();
    public OverseasAthletes(String name, String place, Date date, Programme programme) {
        super(name,place,date,programme);
    }

    public void applyForVisa(boolean i){
        System.out.println("Apply for Visa and "+(i?"":"not ")+"Succesfull get it");
    }
}

class Date{
    int Day;
    int Year;
    String Month;

    public Date( String month,int year,int day) {
        Day = day;
        Year = year;
        Month = month;
    }


    @Override
    public String toString() {
        return "Date{" +
                "Day=" + Day +
                ", Year=" + Year +
                ", Month='" + Month + '\'' +
                '}';
    }
}


class Test
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
