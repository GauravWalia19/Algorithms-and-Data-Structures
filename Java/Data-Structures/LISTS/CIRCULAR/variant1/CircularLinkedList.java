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

    /**
     *  INSERTION
     *  1. AT HEAD
     *  2. AT TAIL
     *  3. AT MIDDLE
     **/
    /**
     * addToHead()
     * it will insert node at head
     * @param int for data
     * @return void 
     **/
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

    /**
     * addToTail()
     * it will add the node to the tail
     * @param int for data
     * @return void 
     **/
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

    /**
     * addToMiddle()
     * it will add node to middle
     * @param void
     * @return void
     **/
    public void addToMiddle(int data,int position)
    {
        CLLNode newNode = new CLLNode(data);
        if(position==0)
        {
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                newNode.setNext(head);
                CLLNode current = head.getNext();
                while(current.getNext()!=head)
                {
                    current=current.getNext();
                }
                head=newNode;
                current.setNext(head);
            }
        }
        else
        {
            //insert except head
            CLLNode current=head;
            CLLNode prev=head;
            int it=0;
            while(current!=null)
            {
                if(it==position)
                {
                    break;
                }
                prev=current;
                current=current.getNext();
                it++;
            }
            prev.setNext(newNode);
            newNode.setNext(current);
        }
    }

    /**
     * DELETION
     * 1. FROM HEAD
     * 2. FROM TAIL
     * 3. FROM MIDDLE
     **/

    /**
     * removeFromHead()
     * it will remove node from head
     * @param void
     * @return int for removed node
     **/
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

    /**
     * removeFromTail()
     * it will remove node from the tail
     * @param void
     * @return int for removed node
     **/
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

    /**
     * removeFromMiddle()
     * @param void
     * @return the removed node data
     **/
    public int removeFromMiddle(int position)
    {
        if(position==0)
        {
            //delete from head
            CLLNode current=head;
            while(current.getNext()!=head)
            {
                current=current.getNext();
            }
            CLLNode temp=head;
            head=head.getNext();
            current.setNext(head);
            return temp.getData();
        }
        else
        {
            //delete from middle
            CLLNode prev = head;
            CLLNode current= head;
            int it=0;
            while(current!=null)
            {
                if(it==position)
                {
                    break;
                }
                prev=current;
                current=current.getNext();
                it++;
            }
            CLLNode nextNode = current.getNext();
            prev.setNext(nextNode);
            current.setNext(null);
            return current.getData();
        }
    }
    /**
     * length()
     * @param void
     * @return the length of the list
     **/
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