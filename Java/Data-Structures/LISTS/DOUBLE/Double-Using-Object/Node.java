public class Node
{
    private Node prev;
    private data obj;
    private Node next;

    //contructor
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
    public Node getPrev()
    {
        return prev;
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
    public void setPrev(Node prev)
    {
        this.prev = prev;
    }
    //for conversion for printing
    //calling to tostring method in data.java
    public String toString()
    {
        return obj.toString();
    }
}