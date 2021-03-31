import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
abstract class PrimeNumber
{
    private int num;
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    private String state;
    public PrimeNumber()
    {
        Scanner buffer = new Scanner(System.in);
        num = buffer.nextInt();
        primeMaking();
        if(arr.contains(num))
            state = " is Prime number.\n";
        else
            state = " is not Prime number.\n";
    }

    public int getNum() {
        return num;
    }

    public String getState() {
        return state;
    }

    //sieve of Eratosthenes
     public abstract void primeMaking();

    @Override
    public String toString()
    {
        return getNum() + getState();
    }
}
