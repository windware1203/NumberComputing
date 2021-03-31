import java.util.Scanner;
import java.lang.*;
public class ParityCheck
{
    private int num = 0;
    private  String parity;
    public ParityCheck()
    {
        System.out.println("Enter a number : ");
        Scanner buffer = new Scanner(System.in);

        num = buffer.nextInt();
        if(num % 2==0)parity = "Even ";
        else parity = "Odd ";
    }

    public String getParity()
    {
        return parity;
    }

    @Override
    public String toString()
    {
        return "This is a " + getParity() + "number\n";
    }
}
