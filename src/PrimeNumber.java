import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public interface  PrimeNumber
{
    int num=0;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    String state="";

    int getNum();
    /*return num;*/

    String getState();
    //return state;

    //sieve of Eratosthenes
    void primeMaking();

    @Override
    String toString();//getNum() + getState()
}
