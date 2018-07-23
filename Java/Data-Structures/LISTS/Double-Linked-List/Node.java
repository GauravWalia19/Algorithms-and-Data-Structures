public class Node
{
    private data obj;
    private Node next;

    public Node(data obj)
    {
        this.obj = obj;
    }

    //getters
    public data getObj()
    {
        return obj;
    }
    public Node getNext()
    {
        return next;
    }
    //setters
    public void setObj(data obj)
    {
        this.obj = obj;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
    public String toString()
    {
        return obj.toString();
    }
}