
import java.util.Scanner;

public class NumberComputing
{
    public static void main(String[] args)
    {
        Scanner bufferOne = new Scanner(System.in);
        int numCode;

        boolean flag = true;
        do
        {
            System.out.println( "0:End\n"+
                    "1:Odd/Even\n"+
                    "2:GCD/LCM\n"+
                    "3:Prime\n"+
                    "enter the command code");
            numCode = bufferOne.nextInt();

            switch (numCode)
            {
                case 0:
                    flag = false;
                    break;
                case 1:
                    ParityCheck taskOne = new ParityCheck();
                    System.out.println(taskOne.toString());
                    break;
                case 2:
                    GcdLcm taskTwo = new GcdLcm();
                    System.out.println(taskTwo.toString());
                    break;
                case 3:
                    Eratosthenes taskThree = new Eratosthenes();
                    System.out.println(taskThree.toString());
                    break;
                default:
                    System.out.println("Error command code!\n" + "Please enter it again:");
                    break;
            }
        }while (flag);bufferOne.close();


        System.out.println("----Thanks for using this system.\n"+"----Copyright\n----@Takeda Nana\n");
    }
}
