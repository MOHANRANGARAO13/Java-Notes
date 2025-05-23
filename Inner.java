import java.lang.String;
import java.sql.SQLOutput;

class A
{
    public void show()

    {
        System.out.println("in Show");
    }

    // class B
    // {
    //     public void config()
    //     {
    //         System.out.println("in config");
    //     }
    // }
}


public class Inner 
{
    public static void main(String a[])
    {
        A obj = new A()          // This entire program is Anonymous Inner Class.
        {
            public void show()
            {
                System.out.println("in new Show");
            }
        };
        obj.show();
        // A.B obj1 = obj.new B();
        // obj1.config();   
    }
}
