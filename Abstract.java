import java.lang.String;
abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Play Music");
    }
}

class Maruti extends Car
{  
    public void fly()
    {
        System.out.println("Flying.");
    }
    public void drive()
    {
        System.out.println("Driving..");
    }   
}

public class  Abstract
{
    public static void main(String[] args) 
    {
       Car obj = new Maruti();
       obj.drive();
       obj.playMusic();
       obj.fly();
    }
}