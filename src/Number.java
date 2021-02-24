import java.*;
public class Number
{
    private int value;
    private boolean parity;//1=even 0=odd
    public Number()
    {
        value = 0;
    }
    public Number(int prm)
    {
        this.value = prm;
    }
    public boolean parityCheck()
    {
        if(this.value % 2 == 0)return true;
        else return false;
    }

    public void setParity()
    {
        this.parity = parityCheck();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}