
import java.util.Scanner;

public class NumberComputing
{
    public static void main(String[] args)
    {

        String numCode ;
        Scanner bufferOne = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println( "0:End\n"+
                    "1:Odd/Even\n"+
                    "2:GCD/LCM\n"+
                    "3:Prime\n"+
                    "enter the command code");
            if(bufferOne.hasNextLine())
                numCode = bufferOne.nextLine();
            else
                break;
            switch (numCode)
            {
                case "0":
                    flag = false;
                    break;
                case "1":
                    ParityCheck taskOne = new ParityCheck();
                    System.out.println(taskOne.toString());
                    break;
                case "2":
                    GcdLcm taskTwo = new GcdLcm();
                    System.out.println(taskTwo.toString());
                    break;
                case "3":
                    Eratosthenes taskThree = new Eratosthenes();
                    System.out.println(taskThree.toString());
                    break;
                default:
                    System.out.println("Error command code!\n" + "Please enter it again:");
                    break;
            }
        }
        bufferOne.close();


        System.out.println("\n----Thanks for using this system.\n"+"----Copyright\n----@Takeda Nana\n");
    }
}
