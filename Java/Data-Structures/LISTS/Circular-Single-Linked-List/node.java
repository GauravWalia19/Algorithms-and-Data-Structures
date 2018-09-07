public class node
{
    private data obj;
    private node next;

    public node(data obj)
    {
        this.obj = obj;
        next=null;
    }
    //constructors
    public node(data obj,node head)
    {
        this.obj = obj;
        next=head;
    }
    //getters
    public data getObj()
    {
        return obj;
    }
    public node getNext()
    {
        return next;
    }
    //setters
    public void setObj(data obj)
    {
        this.obj = obj;
    }
    public void setNext(node next)
    {
        this.next = next;
    }
    public String toString(data obj)
    {
        return obj.toString();
    }
}