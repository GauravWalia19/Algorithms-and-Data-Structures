public class ListNode
{
    private int data;
    private ListNode next;

    //CONSTRUCTOR
    public ListNode(int value)
    {
        this.data = value;
    }
    //GETTERS
    public int getData()
    {
        return data;
    }
    public ListNode getNext()
    {
        return next;
    }
    //SETTERS
    public void setNext(ListNode next)
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