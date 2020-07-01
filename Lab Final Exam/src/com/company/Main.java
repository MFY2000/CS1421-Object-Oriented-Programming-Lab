package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

//
//class Atom{
//    private int proton;
//    private int electron;
//    private int neutron;
//
//    Atom(int proton,int electron,int neutron){
//        this.proton=proton;
//        this.electron=electron;
//        this.neutron=neutron;
//    }
//    public void setProton(int proton){
//        if(proton > 0)
//        {
//            this.proton=proton;
//        }
//        else
//        {
//            System.out.println("Enter above 0");
//        }
//    }
//    public int getProton(){
//        return proton;
//    }
//    public void setElectron(int electron){
//        if(electron > 0)
//        {
//            this.electron=electron;
//        }
//        else
//        {
//            System.out.println("Enter above 0");
//        }
//    }
//    public int getElectron(){
//        return electron;
//    }
//    public void setNeutron(int neutron){
//        if(neutron >= 0)
//        {
//            this.neutron=neutron;
//        }
//        else
//        {
//            System.out.println("Enter above 0");
//        }
//    }
//    public int getNeutron(){
//        return neutron;
//    }
//    public boolean Ision(){
//        if(electron != proton){
//            System.out.println(""+true);
//            return true;
//        }
//        else
//        {
//            System.out.println(""+false);
//            return false;
//        }
//    }
//    public int getAtomicMassNumber(){
//        System.out.println(""+(neutron+proton)+"A");
//        return (proton+neutron);
//    }
//
//}
//class FinalTask2{
//    public static void main(String[] args){
//        Atom Hydrogen = new Atom(1,1,0);
//        Hydrogen.Ision();
//        Hydrogen.getAtomicMassNumber();
//        Atom H = new Atom(2,1,4);
//        H.Ision();
//        H.getAtomicMassNumber();
//    }
//}
//
//
//
