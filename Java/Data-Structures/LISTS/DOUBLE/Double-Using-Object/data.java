public class data
{
    private int a;
    private int b;

    public data()
    {
        a = 0;
        b = 0;
    }
    public data(int a,int b)
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
        return a + " "+b;
    }
}