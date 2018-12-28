public class CLLNode
{
    private int data;
    private CLLNode next;

    //constructors
    public CLLNode(int data)
    {
        this.data=data;
    }
    //getters
    public int getData()
    {
        return data;
    }
    public CLLNode getNext()
    {
        return next;
    }
    //setters
    public void setData(int data)
    {
        this.data=data;
    }
    public void setNext(CLLNode next)
    {
        this.next=next;
    }
    //used for conversion
    public String toString()
    {
        return data+"";
    }
}