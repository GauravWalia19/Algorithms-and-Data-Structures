public class DoublyLinkedList
{
    private DLLNode head;
    private DLLNode tail;
    private int length;

    //constructor to set defaults
    public DoublyLinkedList()
    {
        head=null;
        tail=null;
        length=0;
    }
    //METHODS

    /******************************************************/
    /*======================> LENGTH <====================*/
    public int length()
    {
        return length;
    }

    /*
     *  INSERTION
     *  1. AT HEAD
     *  2. AT TAIL
     *  3A. AT MIDDLE USING INDEX
     *  3B. AT EXACT MIDDLE
     */
    /*==================> INSERT AT HEAD <=================*/
    public void insert_at_head(int value)
    {
        DLLNode newNode = new DLLNode(value);
        if(head==null) //empty linked list
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.setNext(head);
            head.setPrev(newNode);
            head=newNode;
        }
        length++;
    }
    /*====================> INSERT AT TAIL <================*/
    public void insert_at_tail(int value)
    {
        DLLNode newNode = new DLLNode(value);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail=newNode;   
        }
        length++;
    }
    /*============> INSERT AT MIDDLE USING INDEX <===========*/
    public void insert_at_middle_using_index(int value,int position)
    {
        DLLNode newNode = new DLLNode(value);
        //fixing length
        if(position<0 || position>length)
        {
            System.out.println("INVALID POSITION");
            return;
        }
        else if(head==null) //null to one
        {
            if(position==0)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                return;
            }
        }
        else if(position==0) //at head
        {
            newNode.setNext(head);
            head.setPrev(newNode);
            head=newNode;
        }
        else if(position==length) //at tail
        {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail=newNode;
        }
        else
        {
            int i=0;
            DLLNode current=head;
            DLLNode prev=head;
            while(current.getNext()!=null)
            {
                if(position==i)
                {
                    break;
                }
                prev=current;
                current=current.getNext();
                i++;
            }
            // System.out.println(prev.getData());
            // System.out.println(current.getData());

            prev.setNext(newNode);
            newNode.setPrev(prev);

            newNode.setNext(current);
            current.setPrev(newNode);
        }
        length++;
    }
    /*===================> INSERT AT EXACT MIDDLE <==================*/
    public void insert_at_exact_middle(int value)
    {
        int mid = length/2;
        insert_at_middle_using_index(value, mid);
    }

    /*
     *      DELETION
     * 1. FROM HEAD
     * 2. FROM TAIL
     * 3A. FROM MIDDLE USING INDEX
     * 3B. FROM EXACT MIDDLE 
     * 3C. FROM MIDDLE USING VALUE
     */
    /*======================> DELETE FROM HEAD <===================*/
    public void delete_from_head()
    {
        if(head==null) //empty list
        {
            return;
        }
        else if(head.getNext()==null) //single node
        {
            head=null;
            tail=null;
        }
        else
        {
            DLLNode temp = head;
            head=head.getNext();
            head.setPrev(null);
            temp.setNext(null);
        }
        length--;
    }
    /*======================> DELETE FROM TAIL <===================*/
    public void delete_from_tail()
    {
        if(head==null) //empty list
        {
            return;
        }
        else if(head.getNext()==null) //single node
        {
            head=null;
            tail=null;
        }
        else
        {
            DLLNode temp = tail;
            tail=tail.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
        }
        length--;
    }
    /*=================> DELETE FROM MIDDLE USING INDEX <================*/
    public void delete_from_middle_using_index(int position)
    {
        if(head==null) //empty list
        {
            return;
        }
        else if(position<0 || position>length-1) //checking position
        {
            System.out.println("INVALID INDEX");
            return;
        }
        else if(head.getNext()==null) //single node
        {
            if(position==0) //make empty
            {
                head=null;
                tail=null;
            }
            else
            {
                return;
            }
        }
        else if(position==0) //delete from head
        {
            DLLNode temp=head;
            head=head.getNext();
            head.setPrev(null);
            temp.setNext(null);
        }
        else if(position==length-1) //delete from tail
        {
            DLLNode temp = tail;
            tail=tail.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
        }
        else
        {
            DLLNode current=head;
            DLLNode prev=head;
            int i=0;
            while(current.getNext()!=null)
            {
                if(i==position)
                {
                    break;
                }
                prev=current;
                current=current.getNext();
                i++;
            }
            DLLNode temp = current.getNext();
            prev.setNext(temp);
            current.setPrev(null);
            current.setNext(null);
            temp.setPrev(prev);
        } 
        length--;
    }
    /*=================> DELETE FROM EXACT MIDDLE <================*/
    public void delete_from_exact_middle()
    {
        int mid=length/2;
        delete_from_middle_using_index(mid);
    }
    /*=================> DELETE FROM MIDDLE USING VALUE <================*/
    public void delete_from_middle_using_value(int value)
    {
        if(head==null) //empty list
        {
            return;
        }
        else if(head.getNext()==null) //single node
        {
            if(head.getData()==value)
            {
                head=null;
                tail=null;
            }
            else
            {
                System.out.println("NOT FOUND");
                return;
            }
        }
        else if(head.getData()==value) //value present at head
        {
            DLLNode temp=head;
            head=head.getNext();
            head.setPrev(null);
            temp.setNext(null);
        }
        else if(tail.getData()==value) //value present at tail
        {
            DLLNode temp=tail;
            tail=tail.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
        }
        else
        {
            DLLNode current=head;
            DLLNode prev=head;
            int flag=0;
            while(current.getNext()!=null)
            {
                if(current.getData()==value)
                {
                    flag=1;
                    break;
                }
                prev=current;
                current=current.getNext();
            }
            if(flag==1)
            {
                DLLNode temp = current.getNext();
                prev.setNext(temp);
                current.setPrev(null);
                current.setNext(null);
                temp.setPrev(prev);
            }
            else
            {
                System.out.println("NOT FOUND");
                return;
            }
        }
        length--;
    }
    /************************************************/
    /*=================> CLEAR LIST <===============*/
    public void clear_list()
    {
        head=null;
        tail=null;
        length=0;
    }

    /*************************************************************/
    /*=================> TO STRING FOR PRINTING <================*/
    public String toString()
    {
        if(length==0)
        {
            return "[]";       
        }
        String result="[";
        DLLNode current=head;
        while(current!=null)
        {
            if(current.getNext()==null)
            {
                result=result+current.toString()+"]";
            }
            else
            {
                result=result+current.toString()+",";
            }
            current=current.getNext();
        }
        return result;
    }

    /*
     *      TRAVERSING A LIST
     * 1. FROM LEFT TO RIGHT
     * 2. FROL RIGHT TO LEFT
    */
    /*===============> PRINT LIST FROM LEFT <================*/
    public void print_list_from_left()
    {
        if(head==null)
        {
            System.out.println("null");
        }
        else
        {
            DLLNode current=head;
            System.out.print("null <- ");
            while(current!=null)
            {
                if(current.getNext()==null)
                {
                    System.out.println(current.getData() + " -> null");
                }
                else
                {
                    System.out.print(current.getData() + " <=> ");
                }
                current=current.getNext();
            }
        }
    }

    /*===============> PRINT LIST FROM RIGHT <================*/
    public void print_list_from_right()
    {
        if(head==null)
        {
            System.out.println("null");
        }
        else
        {
            DLLNode current=tail;
            System.out.print("null <- ");
            while(current!=null)
            {
                if(current.getPrev()==null)
                {
                    System.out.println(current.getData() + " -> null");
                }
                else
                {
                    System.out.print(current.getData() + " <=> ");
                }
                current=current.getPrev();
            }
        }
    }

    /*
     *  SEARCHING
     * 1. SEARCH LIST USING LINEAR SEARCH
     * 2. OPTIMAL SEARCH BY TRAVERSING FROM BOTH SIDES
     */
    /*====================> SEARCH LIST <======================*/
    public boolean search_list(int value)
    {
        //linear search
        if(head==null)
        {
            return false;
        }
        else
        {
            DLLNode current=head;
            while(current!=null)
            {
                if(current.getData()==value)
                {
                    return true;
                }
                current=current.getNext();
            }    
            return false;
        }
    }
    /*====================> OPTIMAL SEARCH <======================*/
    public boolean optimal_search(int value)
    {
        if(head==null)
        {
            return false;
        }
        else
        {
            //traversing from both sides
            DLLNode current1 = head;
            DLLNode current2 = tail;
            while(true)
            {
                // System.out.println(current1.getData());
                // System.out.println(current2.getData());
                if(current1.getData()==value || current2.getData()==value)
                {
                    return true;
                }
                else if(current1.getData()==current2.getData() || current1.getData()==current2.getPrev().getData())
                {
                    break;
                }
                current1=current1.getNext();
                current2=current2.getPrev();
            }
            return false;
        }
    }
}