import java.util.Scanner;
import java.lang.*;
public class GcdLcm
{
    private int numOne;
    private int numTwo;
    private int gcdValue;
    private int lcmValue;
    private int valueMult;

    public GcdLcm()
    {
        Scanner buffer = new Scanner(System.in);
        System.out.println("enter number One:");
        numOne = buffer.nextInt();
        System.out.println("enter number Two:");
        numTwo = buffer.nextInt();
        valueMult= numOne * numTwo;
        setGcdValue();
        setLcmValue();
    }

    public int getNumOne() {
        return numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public int getGcdValue() {
        return gcdValue;
    }

    public void setGcdValue() {
        this.gcdValue = computingGcdValue(numOne , numTwo);
    }

    public int getLcmValue() {
        return lcmValue;
    }

    public void setLcmValue() {
        lcmValue = valueMult/getGcdValue();
    }
    public int computingGcdValue(int a, int b)
    {
        if (b == 0) return a;
        return a % b == 0 ? b : computingGcdValue(b, a % b);
    }

    @Override
    public String toString()
    {
        return  "number one: " + getNumOne() + "\n"+
                "number two: " + getNumTwo() + "\n"+
                "Gcd value : " + getGcdValue() + "\n"+
                "Lcm value : " + getLcmValue() + "\n";
    }
}
