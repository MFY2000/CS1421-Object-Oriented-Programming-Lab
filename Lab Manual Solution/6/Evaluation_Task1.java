import java.util.Scanner;

class product{
    protected int productId;
    protected String name;

    product(int productId,String name){
        this.name = name;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public String display(){
        return ("name of product: "+name+"(ID: "+productId+")\n");
    }    
}

class UtilityProducts extends product{
    protected int discount;
    protected int prize;

    UtilityProducts(int productId,String name,int discount,int prize){
        super(productId,name);
        this.discount = discount;
        this.prize = prize - (prize*discount);
    }

    public int getPrize() {
        return prize;
    }
    
    public int getDiscount() {
        return discount;
    }

    public String display(){
        return (super.display()+"discount on product:"+getDiscount()+"%   new prize(After discount): "+getPrize()+")\n");
    }
    
}

class FoodProducts extends product{
    protected String dateOfExpiry;

    FoodProducts(int productId,String name,String dateOfExpiry){
        super(productId,name);
        this.dateOfExpiry = dateOfExpiry;
    }
    
    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public String display(){
        return (super.display()+"this product may used before:"+getDateOfExpiry());
    }    
}

public class Evaluation_Task1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int way;

        do{
            System.out.println("Enter the Ways you wants to see the code (1 <=> Hard code), (2 <=> User Input), and(0 <=> Exit)");
            way = scan.nextInt();
            switch (way) {
                case 0:
                    break;
                case 1:
                    System.out.println("So you wants to see hard coded task\n");
                    product p1 = new product(001, "Tooth Paste");
                    System.out.println(p1.display());
            
                    UtilityProducts p2 = new UtilityProducts(002, "Soap", 10, 120);
                    System.out.println(p2.display());
            
                    FoodProducts p3 = new FoodProducts(003, "Cake", "20-07-2020");
                    System.out.println(p3.display());
                    break;
                case 2:
                System.out.println("So you wants to see User Input task\n");

                int productId,discount, prize;
                String name,dateOfExpiry;

                System.out.print("Enter the product ID(Simple product): ");
                productId = scan.nextInt();
        
                System.out.print("Enter the name for (ID:"+productId+"): ");
                name = scan.nextLine();
        
                product p1_ = new product(productId, name);
                System.out.println(p1_.display());
        

                System.out.print("\n\nEnter the product ID(Utility product): ");
                productId = scan.nextInt();
        
                System.out.print("Enter the name for (ID: "+productId+"): ");
                name = scan.nextLine();

                System.out.print("Enter the prize for ("+name+"): ");
                prize = scan.nextInt();

                System.out.print("Enter the discount for (prize: "+prize+"): ");
                discount = scan.nextInt();
        
                UtilityProducts p2_ = new UtilityProducts(productId, name, discount, prize);
                System.out.println(p2_.display());
        
                
                System.out.print("\n\nEnter the product ID(Food product): ");
                productId = scan.nextInt();
        
                System.out.print("Enter the name for (ID: "+productId+"): ");
                name = scan.nextLine();

                System.out.print("Enter the Expiry date for ("+name+"): ");
                dateOfExpiry = scan.nextLine();

                FoodProducts p3_ = new FoodProducts(productId, name, dateOfExpiry);
                System.out.println(p3_.display());

            }
        }while(way != 0);
    }
}