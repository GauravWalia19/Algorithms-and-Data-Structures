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

    /*
     *  INSERTION
     *  1. at head
     *  2. at tail
     */
    /*==================> INSERTION AT HEAD <=================*/
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
    /*===================> INSERTION AT TAIL <=================*/
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
    
    /*
     *  DELETION
     *  1. FROM HEAD
     *  2. FROM TAIL
     *  3. FROM MIDDLE USING VALUE
     */
    /*===============> DELETION FROM HEAD <=================*/
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
    /*===============> DELETION FROM TAIL <=================*/
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
    /*===========> DELETION FROM MIDDLE USING VALUE <===============*/
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

    /****************************************************/
    /*================> return head node <==============*/
    public int peek()
    {
        return tail.getNext().getData();
    }

    /****************************************************/
    /*================> return tail node <==============*/
    public int tailPeek()
    {
        return tail.getData();
    }

    /****************************************************/
    /*==============> LENGTH OF LINKED LIST <===========*/
    public int length()
    {
        return length;
    }
    public int size()
    {
        return length;
    }
    /*
     *  TRAVESING THE CIRCULAR LINKED LIST
     */
    /*===========> printing circular linked list <===========*/
    public void PrintCircularListData()
    {
        if(tail==null) //list empty
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

    /*
     *  SEARCHING
     *  --LINEAR SEARCH
     */
    /*==============> linear search <=================*/
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
    
    /***********************************************/
    /*=============> IS EMPTY OR NOT <=============*/
    public boolean isEmpty()
    {
        return(tail==null);
    }

    /***********************************************/
    /*==============> CLEAR LIST <=================*/
    public void clear()
    {
        tail=null;
        length=0;
    }

    /************************************************/
    /*==================> TO STRING <===============*/
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