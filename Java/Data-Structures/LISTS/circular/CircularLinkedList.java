public class CircularLinkedList
{
    private CLLNode head;
    private int length;

    //constructor
    public CircularLinkedList()
    {
        head=null;
        length=0;
    }
    public void addToHead(int data)
    {
        CLLNode newNode = new CLLNode(data);
        if(head==null) //if list is empty
        {
            head=newNode;
            head.setNext(head);
        }
        else
        {
            newNode.setNext(head);
            CLLNode current=head.getNext();
            while(current.getNext()!=head)
            {
                current=current.getNext();
            } 
            current.setNext(newNode);
            head=newNode;
        }
        length++;
    }
    public void addToTail(int data)
    {
        CLLNode newNode = new CLLNode(data);
        if(head==null) //if empty
        {
            head=newNode;
            head.setNext(head);
        }
        else
        {
            newNode.setNext(head);
            CLLNode current=head.getNext();
            while(current.getNext()!=head)
            {
                current=current.getNext();
            }
            current.setNext(newNode);
        }
        length++;
    }
    public int removeFromHead()
    {
        if(head==null)
        {
            return -1;
        }
        CLLNode temp = head;
        CLLNode current=head.getNext();
        while(current.getNext()!=head)
        {
            current=current.getNext();
        }
        head=head.getNext();
        current.setNext(head);
        temp.setNext(null);
        length--;
        return temp.getData();
    }
    public int removeFromTail()
    {
        if(head==null)
        {
            return -1;
        }
        CLLNode current=head.getNext();
        CLLNode prev=head.getNext();
        while(current.getNext()!=head)
        {
            prev=current;
            current=current.getNext();
        }
        current.setNext(null);
        prev.setNext(head);
        length--;
        return current.getData();
    }
    public int length()
    {
        return length;
    }
    public void PrintCircularListData()
    {
        if(head==null)
        {
            System.out.println("null");
        }
        else
        {
            System.out.print(head.getData()+"->");
            CLLNode current = head.getNext();
            while(current!=head)
            {
                System.out.print(current.getData()+"->");
                current=current.getNext();
            }
            System.out.println("HEAD");
        }
    }
}