import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public interface  PrimeNumber
{
    int num=0;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    String state="";
    /*Scanner buffer = new Scanner(System.in);
    num = buffer.nextInt();
    primeMaking();
        if(arr.contains(num))
    state = " is Prime number.\n";
        else
    state = " is not Prime number.\n";*/

    int getNum();
    /*return num;*/

    String getState();
    //return state;

    //sieve of Eratosthenes
    void primeMaking();

    @Override
    String toString();//getNum() + getState()
}
