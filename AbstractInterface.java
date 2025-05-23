import java.lang.String;
import java.sql.SQLOutput;

abstract class A
{
    public abstract void show();
    public abstract void config();
}


public class AbstractInterface 
{
    public static void main(String a[])
    {
        A obj = new A()          // This entire program is Anonymous Inner Class.
        {
           public void show()
           {
                System.out.println("in Show");
           }

          
            public void config() 
            {
                System.out.println("in config");
            }
        };
        obj.show();
       
    }
}
