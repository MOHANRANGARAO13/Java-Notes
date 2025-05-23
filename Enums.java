

enum Status
{
    Running, Failed, Pending, Success; 
}

public class Enums 
{
    public static void main(String[] args) 
    {
        int i = 5;
        // Status s = Status.Success;
        // System.out.println(s.ordinal());
        Status[] ss = Status.values();
        // System.out.println(ss[0]);

        for(Status s : ss)
        {
            System.out.println(s + " : "+ s.ordinal());
        }
    }
}
