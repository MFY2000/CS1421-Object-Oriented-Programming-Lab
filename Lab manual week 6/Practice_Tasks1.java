
/**
 * IAL Saatchi & Saatchi (Pakistani large advertising firm) have approached the students of MAJU
 (especially the OOP students) to design and create the future episodes of Commander Safeguard
 animated series. They have given you general information about some characters. Now you have
 to understand the characters properly and design a system which clearly represents the nature of
 many characters.
 The information from IAL Saatchi & Saatchi is as below:
 We have many characters in our series.
 Each character has a name.
 Every character can move and can speak.
 Germs are one kind of character in our series.
 The difference is that every germ has a disease.
 The germ can fire a disease and/or can spread the disease.
 There are some special germs that can fly.
 The characters other than Germs are human.
 Every human can wash hands.
 There are basically two types of Humans; Protectors
 Protector includes Commander Safeguard along with his team that may contain some special kids
 and doctors.
 Using information given above design some classes using the concept of inheritance to get the
 contract of being the animator of world known animated series.
 */
class character{
    private String name;
    private boolean move;
    private boolean speak;


    public character(String name,boolean move,boolean speak){
        this.setName(name);
        this.setMove(move);
        this.setSpeak(speak);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMove(boolean move) {
        this.move = move;
    }
    public void setSpeak(boolean speak) {
        this.speak = speak;
    }
    // Getter start
    public String getName(){
        return name;
    }
    public boolean getmove() {
        return move;
    }
    public boolean getspeak() {
        return speak;
    }

    public void function(){
        System.out.print(getName());
        System.out.print(" is can"+(getmove()?" ":"n't ")+ "move, ");
        System.out.print("is can"+(getspeak()?" ":"n't ")+ "Speaking ");
    }

}

class germs extends character{
    private String disease;
    private boolean canFly;

    public germs(String name,boolean move,boolean speak,String disease,boolean canFly){
        super(name,move,speak);
        this.setCanFly(canFly);
        this.setDisease(disease);
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    // getter
    public String getDisease(){
        return disease;
    }
    public String getCanFly() {
        return("this germs can"+( canFly ? "n't " : " ")+ "fly");
    }

    public String spreadDisease(boolean can){
        return("this germs can "+(can?"spread":"Shoot")+ " Disease");
    }
    public void function(){
        super.function();
        System.out.print(" , "+spreadDisease(disease.length() >= 4));
        System.out.print(" ,and "+getCanFly()+"\n");

    }

}

class Humans extends character{
    private int washhand;

    public Humans(String name,boolean move,boolean speak,int washhand){
        super(name,move,speak);
        this.setWashhand(washhand);
    }

    public void setWashhand(int washhand) {
        this.washhand = washhand;
    }

    public int getWashhand() {
        return washhand;
    }

    public String kindHuman() {
        boolean temp = this.getWashhand() < 5;
        CommanderSafeguard h1 = new CommanderSafeguard();
        return ("There are basically two types of Humans and he is "+(temp ? "": "not")+" Protectors"+(temp ? h1.worker():""));
    }

    public void function(){
        super.function();
        System.out.print(" , "+kindHuman());

    }

    private class CommanderSafeguard {
        public String worker() {
            return ("Congru you are a member of Commander Safeguard and know you have to point other yo wash hand");
        }
    }
}

public class Practice_Tasks1{
    public static void main(String[] args) {
        germs n1 = new germs("cbska", true, false, "disease", true);
        n1.function();


        Humans n2 = new Humans("Fahad", true, true, 12);
        n2.function();

    }
}