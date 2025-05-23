import java.lang.String;

enum Laptops
{
    Sony(25000), Hp(30000), Dell, ThinkPad(28000);

    private int price;
    

    private Laptops() 
    {
        price = 10000;
    }

    private Laptops(int price) 
    {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class EnumLap 
{
    public static void main(String[] args) 
    {
        // Laptops lap = Laptops.Sony;
        // System.out.println(lap + " : " + lap.getPrice());
        
        for(Laptops lap : Laptops.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }   

    }
}
