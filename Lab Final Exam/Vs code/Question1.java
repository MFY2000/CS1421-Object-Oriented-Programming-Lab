/*

A car manufacturer uses Java software to track current vehicles being built. The UML diagram below shows an excerpt of the current software structure. You should assume the presence of other appropriate fields and methods. Each car can be built to one of three trim levels: base, luxury or sport. They can also be configured with an electric or petrol engine.
a.	Write a program to implement the given scenario.
b.	The manufacturer decides to offer a vehicle with a hybrid engine that is both an electric engine and a petrol engine. Make changes in code as well as UML (Draw the new UML) to achieve the effect of multiple inheritance for HybridEngine.
c.	Write a test class to test your system.

 */
import java.util.Scanner;

// an abstract class as a Structure class for the other engine
abstract class Engine{//starting of class

    //Local Varaible
    public int batterylevel;
    public boolean tanksExist;
    public int fuelTank;
    public String type;

    //Getter and Setter Starting
    public int getBatterylevel() {
        return batterylevel;
    }

    public void setBatterylevel(int batterylevel) {
        this.batterylevel = batterylevel;
    }

    public boolean isTanksExist() {
        return tanksExist;
    }

    public void setTanksExist(boolean tanksExist) {
        this.tanksExist = tanksExist;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Two abstract class used
    abstract void accelrate();
    abstract void getfuellevel();
}

class ElectricEngine extends Engine{
//    Constructor Starting
    public ElectricEngine(int batterylevel, boolean tanksExist) {
        this.setType("ElectricEngine");
        this.setBatterylevel(batterylevel);
        this.setTanksExist(tanksExist);
    }

//  Override methods
    public void accelrate(){
        if(batterylevel > 18){
            System.out.println("Accelrate increased as accelrater press because battery is charge: "+batterylevel);
        }
        else {
            System.out.println("Accelrate not increased as accelrater press because battery level is too low");
        }
    }

//  Override methods
    public void getfuellevel(){
        tanksExist = false;
        System.out.println("Fuel level is:"+batterylevel);
    }
}

class PetrolEngine extends Engine{
    //    Constructor Starting
    public PetrolEngine(int fuelTank, boolean tanksExist) {
        this.setType("PetrolEngine");
        this.setFuelTank(fuelTank);
        this.setTanksExist(tanksExist);
    }

    //  Override methods
    public void accelrate(){
        if(fuelTank > 0){
            System.out.println("Accelrate increased as accelrater press because it work on fuel in the car");
        }
        else {
            System.out.println("Accelrate not increased as accelrater press because no fuel in the car");
        }
    }

    //  Override methods
    public void getfuellevel(){
        tanksExist = false;
        System.out.println("Fuel level is:"+fuelTank);
    }
}

class HybirdEngine extends Engine {
    //Constructor
    public HybirdEngine(int batterylevel, boolean tanksExist, int fuelTank) {
        this.setBatterylevel(batterylevel);
        this.setTanksExist(tanksExist);
        this.setFuelTank(fuelTank);
        this.setType("HybirdEngine");
    }

    //  Override methods
    public void accelrate(){
        if(fuelTank > 0){
            System.out.println("Accelrate increased as accelrater press because it work on fuel");
        }
        else {
            System.out.println("Accelrate increased as accelrater press because now it work on battery");
        }
    }

    //  Override methods
    public void getfuellevel(){
        tanksExist = true;
        System.out.println();
        System.out.println("Fuel base fuel Tank on is:"+fuelTank);
        System.out.println("Fuel base on battery level is:"+batterylevel);
    }
}
// end of Engine
// Start of Car
abstract class Car{
    public Engine eng;//

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }


    Car(Engine eng){
        this.eng = eng;
    }

    abstract void gettrimlevel();
}

class BaseCar extends Car {
    BaseCar(Engine eng){
        super(eng);
    }
    public void gettrimlevel() {
        System.out.println("The Base car Engine: "+eng.type);
    }
}
class SportsCar extends Car{
    SportsCar(Engine eng){
        super(eng);
    }

    public void gettrimlevel() {
        System.out.println("The Sports car Engine: "+eng.type+" ,Battery: "+eng.batterylevel);
    }
}
class luxuryCar extends Car{
    luxuryCar(Engine eng){
        super(eng);
    }
    public void gettrimlevel() {
        System.out.println("The Sports car Engine: "+eng.type+" ,Battery: "+eng.batterylevel+"Fuel tank"+eng.fuelTank);
    }
}

class test{
    public void workingMethods(){
        Scanner scan = new Scanner(System.in);
        int temp;
        while (true){
            System.out.println("<<<<<<<<<<<<<<<<<<< Welcome to ABC Compouny >>>>>>>>>>>>>>>>>>>>");
            System.out.print("1 -> Veiw Car\n2 -> Veiw Engine\n0 -> Exit\nPress: ");
            temp = scan.nextInt();
            if(temp == 0){
                System.exit(1);
            }
            else if(temp == 1){
                System.out.println("\n\n\n\n");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<< Veiw Car >>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Select Car and Engine\nBase+HybirdEngine -> 1\nSports+HybirdEngine -> 2\nluxuryCar+HybirdEngine -> 3");
                temp = scan.nextInt();
                Engine engine = new HybirdEngine(100,true,100);
                Car car =  temp == 1 ? (new BaseCar(engine)) : temp == 2 ? (new SportsCar(engine)) : (new luxuryCar(engine));
                car.gettrimlevel();
            }
            else if(temp == 2){
                System.out.println("\n\n\n\n");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<< Veiw Engine >>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Select Car and Engine\nHybirdEngine -> 1\nPetrolEngine -> 2\nElectricEngine -> 3");
                temp = scan.nextInt();
                Engine engine = (temp == 1 ? new HybirdEngine(100,true,100): temp == 3 ?  new ElectricEngine(100,false): new PetrolEngine(100,true));
                engine.accelrate();
                engine.getfuellevel();
            }
            else {
                System.out.println("Wrong key press!");
            }
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
         test obj = new test();
         obj.workingMethods();
    }
}
