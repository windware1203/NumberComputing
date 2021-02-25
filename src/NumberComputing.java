import java.*;
import java.util.Scanner;

public class NumberComputing
{
    public static void main(String[] args)
    {
        Scanner buffer = new Scanner(System.in);
        int valueOne=0;
        int valueTwo=0;
        valueOne = buffer.nextInt();
        valueTwo = buffer.nextInt();
        Number numberOne = new Number(valueOne,valueTwo);
        buffer.close();
    }
}