import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class Eratosthenes implements PrimeNumber
{
    private int num;
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    private String state;
    public Eratosthenes()
    {
        System.out.println("Enter a number : ");
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
    public void primeMaking()
    {
        int pnarr[]=new int [1000];
        pnarr[2] = 0;
        int len = pnarr.length;
        int k=2,tt=0;
        while(tt < 1000)
        {
            for(int i=1; i<len; i++)
            {
                if(i%k==0&&i!=k) //
                    pnarr[i]=1;
            }

            for(int i=1; i<len; i++)
            {
                if(i>k&&pnarr[i]==0)
                {
                    k=i;
                    break;
                }
            }
            tt++;
        }

        for (int i=1; i<len ;  i++)
        {
            if(pnarr[i]==0) arr.add(i);
        }
    }

    @Override
    public String toString()
    {
        return getNum() + getState();
    }
}
