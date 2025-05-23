import java.lang.String;

class Computer
    {
        public  void code()
        {

        }
    }

class Laptop extends Computer
{
    public static final Laptop Sony = null;

    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop extends Laptop
{
    public void code()
    {
        System.out.println("code, compile, run, faster");
    }
}

class Developer
{
   public void devApp(Computer lap)
   {
        lap.code();
   }   
}

public class Lapinterface 
{
    public static void main(String[] args) 
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer Mohan = new Developer();
        Mohan.devApp(lap);

    }    
}
