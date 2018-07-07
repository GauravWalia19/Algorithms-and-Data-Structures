public class node
{
    private sample obj;
    private node next;//object to store next node address or location

    //constructors
    public node(sample obj)
    {
        this.obj = obj;
    }
    //getters
    public sample getSample()
    {
        return obj;
    }
    public node getNext()
    {
        return next;
    }
    //setters
    public void setSample(sample obj)
    {
        this.obj = obj;
    }
    public void setNext(node n)
    {
        this.next = n;
    }
    public String toString()
    {
        return obj.toString();
    }
}