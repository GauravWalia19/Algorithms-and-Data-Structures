public class CircularLinkedList
{
    private CLLNode tail;
    private int length;

    //constructor
    public CircularLinkedList()
    {
        tail=null;
        length=0;
    }
    public void addToHead(int data)
    {
        CLLNode newNode = new CLLNode(data);
        if(tail==null) //if list is empty
        {
            tail=newNode;
            tail.setNext(tail);
        }
        else
        {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
        }
        length++;
    }
    public void addToTail(int data)
    {
        CLLNode newNode = new CLLNode(data);
        if(tail==null) //if empty
        {
            tail=newNode;
            tail.setNext(tail);
        }
        else
        {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail=tail.getNext();
        }
        length++;
    }
    //return head node
    public int peek()
    {
        return tail.getNext().getData();
    }
    //return tail node
    public int tailPeek()
    {
        return tail.getData();
    }
    //remove from head
    public int removeFromHead()
    {
        CLLNode temp = tail.getNext();
        if(tail==tail.getNext()) //single node
        {
            tail=null;
        }
        else
        {
            tail.setNext(temp.getNext());
            temp.setNext(null);
        }
        length--;
        return temp.getData();
    }
    //remove from tail
    public int removeFromTail()
    {
        if(tail==null)
        {
            return -1;
        }
        CLLNode current=tail;
        while(current.getNext()!=tail)
        {
            current=current.getNext();
        }
        CLLNode temp = tail;
        current.setNext(tail.getNext());
        tail=current;
        length--;
        return temp.getData();
    }
    
    public int length()
    {
        return length;
    }
    //printing circular linked list
    public void PrintCircularListData()
    {
        if(tail==null)
        {
            System.out.println("null");
        }
        else
        {
            System.out.print(tail.getData()+"->");
            CLLNode current = tail.getNext();
            while(current!=tail)
            {
                System.out.print(current.getData()+"->");
                current=current.getNext();
            }
            System.out.println();
            System.out.println("^");
            System.out.println("TAIL");
        }
    }
    //linear search circular linked list
    public boolean search(int data)
    {
        if(tail==null)
        {
            return false;
        }
        if(tail.getData()==data)
        {
            return true;
        }
        CLLNode current=tail.getNext();
        while(current!=tail)
        {
            if(current.getData()==data)
            {
                return true;
            }
            current=current.getNext();
        }
        return false;
    }
    //remove from value
    public int remove_node_using_value(int data)
    {
        if(tail==null) //empty list
        {
            return -1;
        }
        CLLNode current=tail.getNext();
        CLLNode prev=tail;
        int compares;
        for(compares=0;compares<length && (!(current.getData()==data));compares++)
        {
            prev=current;
            current=current.getNext();
        }
        if(current.getData()==data)
        {
            if(tail==tail.getNext()) //single node
            {
                tail=null;
            }
            else
            {
                if(current==tail)
                {
                    tail=prev;
                }
                prev.setNext(prev.getNext().getNext());
            }
            current.setNext(null);
            length--;
            return current.getData();
        }
        else
            return -1;
    }
    public int size()
    {
        return length;
    }
    public boolean isEmpty()
    {
        return(tail==null);
    }
    //clear list
    public void clear()
    {
        tail=null;
        length=0;
    }
    //to string method
    public String toString()
    {
        String result="[";
        if(tail==null)
        {
            return result+"]";
        }
        result=result+tail.getData();
        CLLNode current=tail.getNext();
        while(current!=tail)
        {
            result=result+","+current.getData();
            current=current.getNext();
        }
        return result+"]";
    }
}