/*

Using interfaces, you can specify similar behaviors for possibly disparate classes. Governments
and companies worldwide are becoming increasingly concerned with carbon footprints (annual
releases of carbon dioxide into the atmosphere) from buildings burning various types of fuels for
heat, vehicles burning fuels for power, and the like.
Many scientists blame these greenhouse gases for the phenomenon called global warming.
Create three small classes unrelated by inheritance—classes Building, Car and Bicycle.
Draw a UML diagram and give each class some unique appropriate attributes and behaviors that
it does not have in common with other classes.
Write an interface releaseCarbonFootprint with a getCarbonFootprint() method. Have each of
your classes implement that interface, so that its getCarbonFootprint() method calculates an
appropriate carbon footprint for that class (surf the web and find out how to calculate different
carbon footprints).
For Building: (Add Carbon footprints in the result of Natural Gas and Electricity consumption)
Due to Natural Gas Consumption :
Value of therms of natural gas the building consumes, multiply by a emission factor of 11.7
Due to Electricity Consumption:
Carbon foot print (in kg)= [consumption of energy] x emission factor =
Latest emission factor for electricity consumption is 0.82
For Car:
For Diesel: Fuel Consumption per Km in Litre x 2640 g/l / 100
For Petrol: Fuel Consumption per Km in Litre x 2392 g/l / 100
For LPG: Fuel Consumption per Km in Litre x 1665 g/l / 100 (per km)
For High Calorific CNG: Fuel Consumption per Km in Kg x 2252/100
For Low Calorific CNG:Fuel Consumption per Km in Kg x 2666/ 100
On average 271g of CO2 is released per KM
Bicycles do not require fuel in the same sense of cars and buses, so the ride does not release any
more carbon emissions. Food intake, and the energy which it produces to help a cyclist propel
their bike, is the final piece of a bike commute carbon footprint.
Cyclists on the average diet will add 16 g of CO2 per km ridden.
Write an application that creates objects of each of the three classes, places references to those
objects in ArrayList, then iterates through the ArrayList, polymorphically invoking each object’s
getCarbonFootprint() method. For each object, print some identifying information and the
object’s carbon footprint

*/
import java.util.ArrayList;
import java.util.Scanner;

interface CarbonFootprint{
    double getCarbonFootprint();
}


class Bike implements CarbonFootprint{
    private double yearlyMiles;
    private final int caloriesPerMile = 34;

    public Bike( double miles ){
        this.setYearlyMiles(miles);
    }

    public double getYearlyMiles(){
        return yearlyMiles;
    }

    public void setYearlyMiles( double miles ){
        yearlyMiles = miles;
    }

    public String toString(){
        return ("Bike\nYearly miles are: "+ getYearlyMiles());
    }

    public double getCarbonFootprint(){
        return (yearlyMiles * caloriesPerMile);
    }
}

class Building implements CarbonFootprint{
    private double averageMonthlyKwh;
    private final int months = 12;

    public Building( double monthlyConsumption ){
        this.setAverageMonthlyKwh(monthlyConsumption);
    }

    public void setAverageMonthlyKwh( double monthlyConsumption ){
        averageMonthlyKwh = monthlyConsumption;
    }

    public double getAverageMonthlyKwh(){
        return averageMonthlyKwh;
    }

    public String toString(){
        return ("Building\nthe monthly consumption is: "+getAverageMonthlyKwh());
    }

    public double getCarbonFootprint(){
        return getAverageMonthlyKwh() * months;
    }
}

class Car implements CarbonFootprint{
    private double averageYearlyMiles;
    private double averageMPG;
    private final int kgCO2PerMile = 9;

    public Car( double miles, double MPG ){
        this.setAverageMPG(MPG);
        this.setAverageYearlyMiles(miles);
    }

    public void setAverageYearlyMiles( double miles ){ averageYearlyMiles = miles; }
    public void setAverageMPG( double MPG ){ averageMPG = MPG; }
    public double getAverageYearlyMiles(){ return averageYearlyMiles; }
    public double getAverageMPG(){ return averageMPG; }

    public String toString(){
        return ("Car\nAverage yearly miles is "+ getAverageYearlyMiles()+"\nAverage MPG is "+ getAverageMPG() );
    }

    public double getCarbonFootprint(){
        return (( getAverageYearlyMiles() * getAverageMPG() ) * kgCO2PerMile );
    }
}

public class Practice_Tasks1 {
    public static void main( String[] args ){
        ArrayList <CarbonFootprint> categories;
        categories = new ArrayList< CarbonFootprint >(3);
        int carbon = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Miles travel by the Bike: ");
        categories.add( new Bike( scan.nextDouble() ));

        System.out.print("Enter the monthlyConsumption(Natural Gas and Electricity consumption) of Building: ");
        categories.add( new Building( scan.nextDouble() ));

        System.out.print("Enter the Miles and MGP for the car: ");
        categories.add( new Car(  scan.nextDouble(),  scan.nextDouble() ));

        System.out.println(" Data of each object:\n ");
        for( CarbonFootprint currentObject : categories ){
            carbon +=  currentObject.getCarbonFootprint();
            System.out.println(currentObject.toString()+"\n Carbon footprint is "+ currentObject.getCarbonFootprint()+"\n");
        }

        System.out.println("Total carbonfoot print: "+carbon);
    }
}

