
enum Status
{
    Running, Failed, Pending, Success; 
}

public class EnumIfSwitch
{
    public static void main(String[] args) 
    {
        Status s = Status.Success;
        
    switch(s)
    {
        case Running:
            System.out.println("");
            break;

    
        case Pending:
            System.out.println("Please Wait");
            break;

        default:
            System.out.println("Done");
            break;
    }

    //     if(s == Status.Running)
    //     System.out.println("All Good");
    //    else if(s == Status.Failed)
    //     System.out.println("Try Again");
    //    else if(s == Status.Pending)
    //     System.out.println("Try Again");
    //     else
    //     System.out.println("Done");

    }
}