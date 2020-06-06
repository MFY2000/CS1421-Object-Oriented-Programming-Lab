package com.company;
import java.util.ArrayList;
import java.util.Scanner;

// A program of city Bus service in which the program give the bus seat to the Passenger


/*=============================================Comments============================================

This is the combination of All Pillars of oop
1)inheritance
2)Abstraction
3)Polymophism
3)Encapsulation
i use encapsulation as a access modifier

i have a absrtact class card to save the data of passage and hidden the declare

*/


public class CityBus {
    public static void main(String[] args)throws Exception{
        Trick manage = new Trick();
        manage.mainMenu();
    }
}


//passage Varaible are inside it
abstract class HiddenVaraible{
    String Name;
    String WhereTogo;
    char bus;
    HiddenVaraible(String Name, String WhereTogo, char bus){
        this.bus = bus;
        this.WhereTogo = WhereTogo;
        this.Name = Name;
    }
}

//passage Methods are inside it
interface HiddenMethod{
    public String toString();
}

// the main class of passage which is the arraylist of passage
class Passenger extends HiddenVaraible implements HiddenMethod{
    public Passenger(String name, String whereTogo, char bus) {
        super(name, whereTogo, bus);
    }

    @Override
    public String toString() {
        return Name+WhereTogo+bus;
    }
}


// work under the
class Trick {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Passenger> listOf = new ArrayList<>(50);
    private int AlreadyBookSeat;

    public void AlreadyBook() {
        AlreadyBookSeat = 30;
        for (int i = 0; i < AlreadyBookSeat; i++)
            listOf.add(new Passenger(" "+i,"KPT Underpass Side B Bus Stop",'A'));
    }

    public void mainMenu() throws Exception{
        AlreadyBook();
        int choice;

        while(true){

            System.out.println("===============================================");
            System.out.println("1. Book a Seat");
            System.out.println("2. Remaining Seat");
            System.out.println("3. Show Details of Passenger");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            if(choice == 0) {
                System.out.println("Exiting program, goodbye");
                break;
            }
            else if(choice == 1){
                System.out.println("The seat number "+(AlreadyBookSeat+1)+" is free Enter detials of Passenger");
                System.out.print("Enter the name of Passenger: ");
                String temp = input.next();
                System.out.print("Going towords KPT Underpass Side B Bus Stop(Yes => 1, No => 2): ");
                if (input.nextInt() == 2){
                    int num = (1/0);
                    System.out.println("Exiting program, goodbye"+num);
                    break;
                }
                System.out.print("Enter the bus no(A,B,C) : ");
                char temp3 = input.next().charAt(0);;
                listOf.add(new Passenger(temp,"KPT Underpass Side B Bus Stop",temp3));
                AlreadyBookSeat++;
                System.out.println("Succesfully add the Passenger to the list");
            }
            else if(choice == 2){
                System.out.print("Enter the seat no of the Passenger: ");
                int no = input.nextInt();
                if (no >= AlreadyBookSeat) {
                    System.out.println("Exiting program, goodbye");
                    break;
                }

                System.out.println(listOf.get(no).toString());

                System.out.print("Enter the new name of "+listOf.get(no).Name+": ");
                listOf.get(no).Name = input.next();
                System.out.print("Going towords KPT Underpass Side B Bus Stop(Yes => 1, No => 2): ");
                if (input.nextInt() == 2){
                    System.out.println("Exiting program, goodbye");
                    break;
                }
                System.out.print("Enter the bus no(A,B,C) to change "+listOf.get(no).bus+":");
                listOf.get(no).bus = input.next().charAt(0);;
            }
            else if(choice == 3){
                for (int i = 0; i < AlreadyBookSeat; i++) {
                    System.out.println(listOf.get(i).toString());
                }
            }



        }
    }
}

