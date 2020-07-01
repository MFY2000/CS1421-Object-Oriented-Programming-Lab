package com.company;
/*
Question # 2:

The atoms of different elements have different numbers of protons, neutrons and electrons. Electrons are negatively charged, protons are positively charged, and neutrons have no charge.
a) Write an atom class that contains:
(i) fields for storing the numbers of protons, neutrons and electrons with appropriate visibility;
(ii) setter and getter methods for manipulating these fields, ensuring that the minimum value for electrons and protons is 1, and the minimum value for neutrons is 0;
(iii) a constructor that initialises new objects of atom to be the smallest element (Hydrogen), for which the number of protons is 1, the number of neutrons is 0, and the number of electrons is 1.
b) Write a new method for the atom class called isIon() that will return true or false, depending upon whether the atom is an ion. An atom is an ion if it is charged (i.e., if the number of electrons ≠ the number of protons).
c) Write a new method for the atom class called getAtomicMassNumber that will calculate and return the atomic mass number of the atom. Atomic mass number of an atom (often denoted A) is defined as the number of protons plus the number of neutrons.

 */
import java.util.Scanner;

class Atom{
    private int proton;
    private int electron;
    private int neutron;

    Atom(int proton,int electron,int neutron) throws Exception {
        this.setElectron(electron);
        this.setNeutron(proton);
        this.setProton(proton);
    }
    public void setProton(int proton) throws Exception {
        if(proton > 1){
            throw new Exception("Proton must be greater than one");
        }
        else {
            this.proton = proton;
        }
    }
    public int getProton(){
        return proton;
    }
    public void setElectron(int electron) throws Exception {
        if(electron > 1){
            throw new Exception("electron must be greater than one");
        }
        else {
            this.electron=electron;
        }
    }
    public int getElectron(){
        return electron;
    }
    public void setNeutron(int neutron) throws Exception {
        if(neutron >= 0)
        {
            this.neutron=neutron;
        }
        else
        {
            throw new Exception("neutron must be greater than Zero");
        }
    }
    public int getNeutron(){
        return neutron;
    }
    public boolean Ision(){
        boolean valueis =  electron != proton ? true : false;
        return  valueis;

    }
    public int getAtomicMassNumber(){
        return (getProton()+getNeutron());
    }
    public String toString(){
        return ("The Atomic Mass is: "+getAtomicMassNumber()+"A\nThe ISION is: "+Ision());
    }

}
public class Question2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            do {
                System.out.print("Press\n 1 -> for sample Output\n 2 -> for Input data\n 0 -> Exit \nEnter: ");
                int key = scan.nextInt();
                int temp1,temp2,temp3;
                if (key == 1) {
                    // The sample of Hydrogen is / for hardcoded value
                    Atom Hydrogen = new Atom(1, 1, 0);
                    System.out.println(Hydrogen.toString());
                }
                else if(key == 2){
                    System.out.print("Enter the value of Proton: ");
                    temp1 = scan.nextInt();
                    System.out.print("Enter the value of Electron: ");
                    temp2 = scan.nextInt();
                    System.out.print("Enter the value of Neutron: ");
                    temp3 = scan.nextInt();

                    Atom sample = new Atom(temp1, temp2, temp3);
                    System.out.println(sample.toString());
                }
                else if(key == 0){
                    System.exit(1);
                }
            }while(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



