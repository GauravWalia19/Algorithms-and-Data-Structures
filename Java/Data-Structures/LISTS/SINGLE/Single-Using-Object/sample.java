//sample class for making linked list
public class sample
{
    private int a;
    private int b;

    public sample(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    //setters
    public void setA(int a)
    {
        this.a = a;
    }
    public void setB(int b)
    {
        this.b = b;
    } 
    //getters
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public String toString()
    {
        return a+ " "+b;
    }
    public boolean equals(sample copy)
    {
        if(a == copy.a && b == copy.b)
        {
            return true;
        }
        return false;
    }
}