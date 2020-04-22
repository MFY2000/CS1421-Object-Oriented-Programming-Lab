/*
3 ‘SmartKids! Pakistan’ designs educational applications for children. They have hired you to
design an application ‘Animal Families’ that teaches kids about different types of animals (based
on animal families) and the difference in their behaviors etc. Basic hierarchy and description of
the animals is given below.
Each animal has the following attributes:
nameOfFood, LivesIn
Every animal performs the following actions:
eat(), makeNoise(), sleep(), move()
a. Using information given above design some classes using the OOP principles to design the
basic structure of application. Animal.java and Dog.java are given as a sample.
- Your solution must inherit as much as possible from the super classes.
- Be sure to use abstract classes and abstract methods wherever appropriate

b. Create a driver file in which
· Create an ArrayList named myAnimals of size n with Animal as declared type.
· The program should then take ‘type of Animal’ as input from the user n times and in each
iteration, instantiate index of list with entered type.
· Call all the overridden methods for each index of the list.
*/

import java.util.ArrayList;
import java.util.Scanner;

abstract class AnimalFamilies{
    public String nameOfFood;
    public boolean LivesIn;//Lived in group or non group
    public int typeEat;
    public String makeNoiseIntoVoice;
    public int timeSleep;
    public boolean moveOn;
    
    AnimalFamilies(String nameOfFood,boolean LivesIn, int typeEat, String makeNoiseIntoVoice, int timeSleep, boolean moveOn){
        this.nameOfFood = nameOfFood;
        this.LivesIn = LivesIn;
        this.typeEat = typeEat;
        this.makeNoiseIntoVoice = makeNoiseIntoVoice;
        this.timeSleep = timeSleep;
        this.moveOn = moveOn;
    }

    abstract void eat();
    abstract void makeNoise();
    abstract void sleep();
    abstract void move();
}

class Animal extends AnimalFamilies{

   Animal(String nameOfFood,boolean LivesIn, int timeEat, String makeNoiseIntoVoice, int timeSleep, boolean moveOn){
       super(nameOfFood,LivesIn,timeEat,makeNoiseIntoVoice,timeSleep,moveOn);
   }

    @Override
    void eat() {
        System.out.println("This Animal can eat: "+this.typeEat+" daily.");
    }

    @Override
    void makeNoise() {
        System.out.println("This Animal make Noise into Voice: "+this.makeNoiseIntoVoice);
    }

    @Override
    void sleep() {
        System.out.println("This Animal can sleep: "+this.timeSleep+" hours daily");
    }

    @Override
    void move() {
        System.out.println("This Animal can move: "+this.moveOn);
    }

}

public class Practice_Tasks3c {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lenght/n times of the Animal: ");

        int num = scan.nextInt();
        ArrayList<AnimalFamilies> typeOfAnimal = new ArrayList<AnimalFamilies>(num);

        String temp0,temp,temp1;//nameOfFood,Noise
        boolean temp2,temp3;//moveOn,LiveIn
        int temp4,temp5;//timeSleep,timeEat


        for (int i = 0; i < num; i++) {
//            typeOfAnimal
            System.out.print("Enter the name of Animal: ");
            temp0 = scan.nextLine();
            System.out.println("Enter the name of food "+temp0+" eats: ");
            temp = scan.nextLine();
            System.out.println("Enter that "+temp0+" Live in group/Ungroup (True/false): ");
            temp3 = scan.nextBoolean();
            
            System.out.println("Enter that "+temp0+" can make noise: ");
            temp1 = scan.nextLine();

            System.out.println("Enter that "+temp0+" can move(True/False): ");
            temp2 = scan.nextBoolean();

            System.out.println("Enter that "+temp0+" time eat: ");
            temp4 = scan.nextInt();

            System.out.println("Enter that "+temp0+" time Sleep: ");
            temp5 = scan.nextInt();

            typeOfAnimal.add(new Animal(temp,temp3,temp4,temp1,temp5,temp2)); 
            System.out.println("Now the Details is Save :)");
        }


        for (AnimalFamilies member : typeOfAnimal) {
            member.eat();
            member.makeNoise();
            member.sleep();
            member.move();
        }

        //end of code.
    }
}
//end of code.