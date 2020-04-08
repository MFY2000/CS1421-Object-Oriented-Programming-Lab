import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


class Appointment{
    private int day;
    private int month;
    private int year;
    private String description;

    Appointment(){

    }

    Appointment(int day, int month, int year, String description){
        this.setData(day,month,year);
        this.setDescription(description);
    }

    public void setData(int day,int month,int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void occursOn (int day, int month, int year)
    {
        if((this.day == day) && (this.month == month) && (this.year == year)) {
            System.out.println("Your have an appointments for"+getDescription());
        }
    }

}

class Daily extends Appointment {

    Daily(int day, String description) {
        super();
        this.setDay(day);
        this.setDescription(description);
    }



    public void occursOn(int day) {
        if (super.getDay() == day)
            System.out.println("Your daily have an appointments for " + getDescription());
    }
}
class Monthly extends Appointment{

    Monthly( int day,int month,String description){
        super();
        this.setDay(day);
        this.setMonth(month);
        this.setDescription(description);
    }

    public void occursOn(int day ,int month){
        if(super.getDay() == day && super.getMonth() == month)
            System.out.println("Your have an appointments for " + getDescription());
    }
}

class OneTime extends Appointment{
    public OneTime(int day, int month, int year, String description){
        super(day, month, year, description);
    }

}


public class Practice_Tasks2{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);


        Appointment[] appointments = new Appointment [15];
        Daily[] daily = new Daily [5];
        Monthly[] monthly = new Monthly[5];
        OneTime[] oneTimes = new OneTime[5];

        //daily appointments list
        daily[0] =  new Daily (2, "teeth specialized.");
        daily[1] = new Daily (3,  "headache specialized.");
        daily[2] = new Daily (4,  "Brain specialized.");
        daily[3] = new Daily (5,  "Eye specialized.");
        daily[4] = new Daily (6,  "Bones specialized.");
//        monthly
        monthly[0] =  new Monthly(7, 1,  "Brush your teeth.");
        monthly[1] = new Monthly(8, 02,  "Brush your teeth.");
        monthly[2] = new Monthly(9, 03, "Brush your teeth.");
        monthly[3] = new Monthly (10, 4, "Brush your teeth.");
        monthly[4] = new Monthly (11, 5, "Brush your teeth.");
//      One time
        oneTimes[0] =  new OneTime(2, 10, 2018, "Brush your teeth.");
        oneTimes[1] = new OneTime(2, 10, 2018, "Brush your teeth.");
        oneTimes[2] = new OneTime(2, 10, 2018, "Brush your teeth.");
        oneTimes[3] = new OneTime (2, 10, 2018, "Brush your teeth.");
        oneTimes[4] = new OneTime (2, 10, 2018, "Brush your teeth.");

        int way;

        do{

            System.out.println("Enter the type of appointments you may have (1 <=> Daily), (2 <=> Monthly), (3 <=> OneTime) ,and(0 <=> Exit)");
            way = in.nextInt();
            if(way == 0){
                return;
            }
            int day = 0,month = 0,year = 0;

            System.out.print("Enter a date (day"+(way == 1 ?"":",month,year")+") to find in the list of appointments: \nDay: ");
            day = in.nextInt();
            if (way == 2){
                System.out.print("month: ");
                month = in.nextInt();
                if (way == 3){
                    System.out.print("year: ");
                    year = in.nextInt();
                }
            }

            int length = way == 1 ? daily.length : way == 2 ? monthly.length: oneTimes.length;

            for (int i = 0; i < length; i++){
                switch (way){
                    case 1:
                        daily[i].occursOn(day);
                        break;
                    case 2:
                        monthly[i].occursOn(day, month);
                        break;
                    case 3:
                        oneTimes[i].occursOn(day,month,year);
                        break;
                }
            }
        }while(way != 0);
    }
}