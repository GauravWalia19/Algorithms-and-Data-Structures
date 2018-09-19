public class DLLNode
{
    private int data;
    private DLLNode prev;
    private DLLNode next;

    //constructors 
    public DLLNode(int data)
    {
        this.data = data;
        prev=null;
        next=null;
    }

    public DLLNode(int data,DLLNode prev,DLLNode next)
    {
        this.data = data;
        this.prev=prev;
        this.next=next;
    }
    //getters
    public int getData()
    {
        return data;
    }
    public DLLNode getPrev()
    {
        return prev;
    }
    public DLLNode getNext()
    {
        return next;
    }
    //setters
    public void setData(int data)
    {
        this.data = data;
    }
    public void setPrev(DLLNode prev)
    {
        this.prev=prev;
    }
    public void setNext(DLLNode next)
    {
        this.next=next;
    }
    
    //for conversion
    public String toString()
    {
        return data+"";
    }
}