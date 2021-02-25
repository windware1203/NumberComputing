import java.*;
public class Number {
    private int valueOne;
    private int valueTwo;
    private int valueMult= valueOne * valueTwo;
    private boolean parity;//1=even 0=odd
    private boolean isPrime;
    private int gcdValue;
    private int lcmValue;

    public Number()
    {
        valueOne = 0;
        valueTwo = 0;
    }

    public Number(int prmOne, int prmTwo)
    {
        this.valueOne = prmOne;
        this.valueTwo = prmTwo;
    }

    public boolean parityCheckOne()
    {
        if (this.valueOne % 2 == 0) return true;
        else return false;
    }

    public boolean parityCheckTwo()
    {
        if (this.valueTwo % 2 == 0) return true;
        else return false;
    }

    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public boolean isParity() {
        return parity;
    }

    public void setParity(boolean parity) {
        this.parity = parity;
    }

    public int getGcdValue() {
        return gcdValue;
    }

    public void setGcdValue() {
        this.gcdValue = computingGcdValue(valueOne,valueTwo);
    }

    public int getLcmValue() {
        return lcmValue;
    }

    public void setLcmValue(int lcmValue) {
        this.lcmValue = valueMult/getGcdValue();
    }

    public int computingGcdValue(int a, int b)
    {
        if (b == 0) return a;
        return a % b == 0 ? b : computingGcdValue(b, a % b);
    }
}