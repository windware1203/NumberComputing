import java.*;
import java.util.Scanner;

public class NumberComputing
{
    public static void main(String[] args)
    {
        Scanner buffer = new Scanner(System.in);
        int numCode;
        System.out.printl("1:Odd/Even\n"+ 
                          "2:Prime\n"+
                          "3:GCD/LCM\n"+ 
                          "enter the command code");
                          
        numCode = buffer.nextInt();
        switch (numCode)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        /*
        int valueOne=0;
        int valueTwo=0;
        valueOne = buffer.nextInt();
        valueTwo = buffer.nextInt();
        Number numberOne = new Number(valueOne,valueTwo);
        */
        buffer.close();
    }
}
