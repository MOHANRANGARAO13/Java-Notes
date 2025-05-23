import java.lang.String;

interface A
{
    int age=35;
    String area="Nellore";

    void show();
    void config();
}

class B implements A
{
   public void show()
   {
        System.out.println("in Show");
   }
   public void config()
   {
        System.out.println("in config");
   }
}

public class Interface 
{
    public static void main(String[] args) 
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);  
    }
}
