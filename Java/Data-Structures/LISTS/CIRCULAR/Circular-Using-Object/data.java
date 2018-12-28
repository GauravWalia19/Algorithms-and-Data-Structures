public class data
{
    private int a;
    private String str;

    //constructors
    public data()
    {
        a=0;
    }
    public data(int a,String str)
    {
        this.a = a;
        this.str = str;
    }
    //getters
    public int getA()
    {
        return a;
    }
    public String getStr()
    {
        return str;
    }
    //setters
    public void setA(int a)
    {
        this.a = a;
    }
    public void setStr(String str)
    {
        this.str =str;
    }
    //for conversion
    public String toString()
    {
        return a + " " + str;
    }
}