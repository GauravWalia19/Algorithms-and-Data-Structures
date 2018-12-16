public class StackNode
{
    private int data;
    private StackNode next;

    //CONSTRUCTOR
    public StackNode(int value)
    {
        this.data = value;
    }
    //GETTERS
    public int getData()
    {
        return data;
    }
    public StackNode getNext()
    {
        return next;
    }
    //SETTERS
    public void setNext(StackNode next)
    {
        this.next = next;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public String toString()
    {    
        return data+"";
    }   
}