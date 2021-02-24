import java.*;
import java.util.Scanner;

public class NumberComputing
{
    public static void main(String[] args)
    {
        Scanner buffer = new Scanner(System.in);
        int value=0;
        value = buffer.nextInt();
        Number numberOne = new Number(value);
        buffer.close();
    }
}