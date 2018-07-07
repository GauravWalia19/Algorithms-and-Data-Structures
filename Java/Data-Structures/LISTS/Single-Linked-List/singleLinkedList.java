public class singleLinkedList
{
    private node head; //storing head node
    private int size;
    //this is our main clss where we write methods for the list

    //getters
    public node getHead()
    {
        return head;
    }
    //setters
    public void setHead(node h)
    {
        this.head = h;
    }
    //add to front method
    public void addToFront(sample obj)
    {
        node n = new node(obj); //creating node
        n.setNext(head);
        head = n;
        size++;
    }
    public void printList()
    {
        node current = head;
        while(current!=null)
        {
            System.out.print(current+" -> ");
            current = current.getNext();
        }
        System.out.println("null");
        System.out.println("^");
        System.out.println("HEAD");
    }
    public int getSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        return false;
    }
    public node removeFromFront()
    {
        if(isEmpty())
        {
            return null;
        }
        node removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }
}