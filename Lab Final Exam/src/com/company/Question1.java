package com.company;

import java.util.Scanner;

abstract class Engine{
    public int batterylevel;
    public boolean tanksExist;
    public int fuelTank;
    public String type;

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

    abstract void accelrate();
    abstract void getfuellevel();
}

class ElectricEngine extends Engine{
    public ElectricEngine(int batterylevel, boolean tanksExist) {
        this.setType("ElectricEngine");
        this.setBatterylevel(batterylevel);
        this.setTanksExist(tanksExist);
    }

    public void accelrate(){
        if(batterylevel > 18){
            System.out.println("Accelrate increased as accelrater press because battery is charge: "+batterylevel);
        }
        else {
            System.out.println("Accelrate not increased as accelrater press because battery level is too low");
        }
    }

    public void getfuellevel(){
        tanksExist = false;
        System.out.println("Fuel level is:"+batterylevel);
    }
}

class PetrolEngine extends Engine{

    public PetrolEngine(int fuelTank, boolean tanksExist) {
        type = "PetrolEngine";
        this.fuelTank = fuelTank;
        this.tanksExist = tanksExist;
    }

    public boolean tanksExist;

    public void accelrate(){
        if(fuelTank > 0){
            System.out.println("Accelrate increased as accelrater press because it work on fuel in the car");
        }
        else {
            System.out.println("Accelrate not increased as accelrater press because no fuel in the car");
        }
    }

    public void getfuellevel(){
        tanksExist = false;
        System.out.println("Fuel level is:"+fuelTank);
    }
}

class HybirdEngine extends Engine {

    public HybirdEngine(int batterylevel, boolean tanksExist, int fuelTank) {
        this.setBatterylevel(batterylevel);
        this.setTanksExist(tanksExist);
        this.setFuelTank(fuelTank);
        this.setType("HybirdEngine");
    }

    public void accelrate(){
        if(fuelTank > 0){
            System.out.println("Accelrate increased as accelrater press because it work on fuel");
        }
        else {
            System.out.println("Accelrate increased as accelrater press because now it work on battery");
        }
    }

    public void getfuellevel(){
        tanksExist = true;
        System.out.println();
        System.out.println("Fuel base fuel Tank on is:"+fuelTank);
        System.out.println("Fuel base on battery level is:"+batterylevel);
    }
}

abstract class Car{
    Engine eng;

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

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp;
        while (true){
            System.out.println("<<<<<<<<<<<<<<<<<<< Welcome to ABC Compouny >>>>>>>>>>>>>>>>>>>>");
            System.out.print("1 -> Veiw Car\n2 -> Veiw Engine\n0 -> Exit");
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
            }

        }
    }
}
