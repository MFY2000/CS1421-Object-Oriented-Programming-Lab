package com.company;

interface  Engine{
    void accelrate();
    void getfuellevel();
}

class ElectricEngine implements Engine{
    public int batterylevel;
    public boolean tanksExist;
    public float fuelLevel;

    public void accelrate(){
        if(batterylevel > 18){
            System.out.println("Accelrate increased as accelrater press");
        }
    }

    public void getfuellevel(){

    }
}
class PetrolEngine implements Engine{
    public void accelrate(){
        System.out.println("Accelrate your car");
    }
    public void getfuellevel(){
        System.out.println("not good");
    }
}

class HybirdEngine implements Engine{
    ElectricEngine eng;
    PetrolEngine png;

    public void accelrate(){
        System.out.println("Highly power accleration");
    }
    public void getfuellevel(){
        System.out.println("it has both fuel");
    }
}

class Car {
    Engine eng;
    Car(Engine eng){
        this.eng = eng;
    }
    void gettrimlevel(){
        System.out.println("trimlevel is good");
    }
}

class BaseCar extends Car {
    BaseCar(Engine eng){
        super(eng);
    }
    public void gettrimlevel() {
        System.out.println("this is an base car");
    }
}
class SportsCar extends Car{
    SportsCar(Engine eng){
        super(eng);
    }
    public void gettrimlevel() {
        System.out.println("this is an sports car");
    }
}
class luxuryCar extends Car{
    luxuryCar(Engine eng){
        super(eng);
    }
    public void gettrimlevel() {
        System.out.println("this is an luxury  car");
    }
}
 class FinalTask1{
    public static void main(String[] args){
        Engine obj1 = new ElectricEngine();
        obj1.accelrate();
        obj1.getfuellevel();

        Engine e1 = new HybirdEngine();
        e1.accelrate();
        e1.getfuellevel();

        Car obj2 = new Car(obj1);
        obj2.gettrimlevel();

        Car obj3 = new BaseCar(obj1);
        obj3.gettrimlevel();
    }
}


public class Question1 {
    public static void main(String[] args) {
//        test.main(args);
    }
}
