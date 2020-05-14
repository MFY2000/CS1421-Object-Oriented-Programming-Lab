import java.util.Scanner;

class Employes{
    private String firstname = null;
    private String lastname= null;
    private String socialsecuritynumber= null;

    Employes(String firstname,String lastname,String socialsecuritynumber){
        this.setfirstname(firstname);
        this.setlastname(lastname);
        this.setsocialsecuritynumber(socialsecuritynumber);
    }
    public String getFirstName() { return firstname; }
    public String getLastName() { return lastname; }
    public String getSocialSecurityNumber() { return socialsecuritynumber; }


    public void setfirstname(String firstname){ this.firstname = firstname; }
    public void setlastname(String lastname){ this.lastname = lastname; }
    public void setsocialsecuritynumber(String socialsecuritynumber){ this.socialsecuritynumber = socialsecuritynumber; }

    public String toString(){
        return firstname+"\n"+lastname+"\n"+socialsecuritynumber;
    }
}

class ComissionEmployee extends Employes{

    private double grosssales;
    private double comissionrate;

    public ComissionEmployee(String firstname, String lastname, String socialsecuritynumber, double grossSales, double comissionrate){
        super(firstname,lastname,socialsecuritynumber);
        this.setGrossSales(grossSales);
        this.setComissionRate(comissionrate);
    }


    public void setGrossSales(double grossSales){ this.grosssales = grossSales; }
    public void setComissionRate(double commissionRate){ this.comissionrate = commissionRate; }

    public double getGrossSales(){ return grosssales; }
    public double getComissionRate(){ return comissionrate; }
    public double earnings(){ return comissionrate * grosssales;}

    @Override
    public String toString(){ return super.toString()+"Gross Sales "+getGrossSales() +"\nComission rate "+getComissionRate()+"\n Earning: "+earnings();}
}

public class Question_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firtsname ,lastname,ssn;
        double grossSales ,comissionrate;

        System.out.print("Enter FirstName: ");
        firtsname = scan.nextLine();
        System.out.print("Enter LastName: ");
        lastname = scan.nextLine();
        System.out.print("Enter socialsecuritynumber: ");
        ssn = scan.nextLine();
        System.out.print("Enter grossSales: ");
        grossSales = scan.nextDouble();
        System.out.print("Enter comissionrate: ");
        comissionrate = scan.nextDouble();


        ComissionEmployee employee1 = new ComissionEmployee(firtsname ,lastname,ssn,grossSales ,comissionrate);
        System.out.print(employee1);
    }
}