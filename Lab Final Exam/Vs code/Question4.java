import java.util.ArrayList;
import java.util.Random;


/*
Question # 4:                                                                                                                    Marks: 20

Sports World is an Events Management Company that organizes the running of major sporting games, such as the Commonwealth Games.
They have hired you to design a system to manage their tasks, you are required to design a few components as a sample first. The entire process is done in the following way:

●	Before being used to host a sporting event, venues are assessed by an Administrator who checks that they are for fit for purpose.
boolean assessVenue(int capacity,boolean safe, boolean healthy)

If the venue can hold more than 10,000 people, the Administrator conducts additional health and safety checks to ensure that the venue is safe.
e the games begin, a Team of Organizers are appointed to run the day-to-day operations, including booking successfully assessed/safety-checked venues (bookVenue())so only if the venues are approved, the organizers will perform their tasks. The organizers then produce a schedule produceSchedule() that shows a list of all the programs.  Hint: Use ArrayList
●	System also has a Programme that lists the progId, progName, date(type Date), time and location of each sporting event
●	At this point, Athletes can register for an event by giving their name, address, dateOfBirth of type Date and their program. Program should also calculateAge() of Athlete
●	Date includes day, month and year.
●	Some OverseasAthletes need to applyForVisa() and the system needs to record whether they were successful.
●	At the end of each event, organizer produceResults() that records the positions of each athlete. For now, the method should just print a statement.
●	 Once all the events are completed, organizer declares the programCompleted(), the Administrator checks the Table of Results for accuracy and produceMedalTable(). For now, the method should just print a statement.

The test file is given to you. This file should run without errors after you have implemented the above scenario.
 */

// Programme class
class Programme{
    // local Varaible
    public int progId;
    public String progName;
    public Date date;
    public String time;
    public String Location;

    // Constructor
    public Programme(int progId, String progName, Date date, String time, String Location) {
        this.progId = progId;
        this.progName=progName;
        this.date=date;
        this.time=time;
        this.Location=Location;
    }

    //Setter and Getter
    public int getProgId() {
        return progId;
    }
    public void setProgId(int progId) {
        this.progId = progId;
    }
    public String getProgName() {
        return progName;
    }
    public void setProgName(String progName) {
        this.progName = progName;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }

//   getting the output
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
}

// Organizer class
class Organizer{
    // Local Varaible
    ArrayList<Programme> programmes;

    //Constructor
    public Organizer(ArrayList<Programme> programmes) {
        this.programmes = programmes;
    }

    // Methods
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

//    Setter and Getter
    public ArrayList<Programme> getProgrammes() {
        return programmes;
    }
    public void setProgrammes(ArrayList<Programme> programmes) {
        this.programmes = programmes;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
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

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

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

public class Question4{
    public static void main(String[] args) {
        Test.main(args);
    }
}
