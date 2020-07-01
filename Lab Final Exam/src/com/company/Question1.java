package com.company;

abstract class Engine{
    public int batterylevel;
    public boolean tanksExist;
    public int fuelTank;
    public String type;

    abstract void accelrate();
    abstract void getfuellevel();
}

class ElectricEngine extends Engine{
    public ElectricEngine(int batterylevel, boolean tanksExist) {
        type = "ElectricEngine";
        this.batterylevel = batterylevel;
        this.tanksExist = tanksExist;
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
        this.batterylevel = batterylevel;
        this.tanksExist = tanksExist;
        this.fuelTank = fuelTank;
        type = "HybirdEngine";
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
        System.out.println("The Sports car Engine: "+eng.type+" ,Battery: "+eng.batterylevel);
    }
}

public class Question1 {
    public static void main(String[] args) {
        while (true){
            System.out.println("<<<<<<<<<<<<<<<<<<<Welcome to ABC Compouny >>>>>>>>>>>>>>>>>>>>");

            


            Engine obj1 = new ElectricEngine();
            obj1.accelrate();
            obj1.getfuellevel();

            Engine e1 = new HybirdEngine();
            e1.accelrate();
            e1.getfuellevel();

            Car obj2 = new BaseCar(obj1);
            obj2.gettrimlevel();

            Car obj3 = new BaseCar(obj1);
            obj3.gettrimlevel();
        }
    }
}
