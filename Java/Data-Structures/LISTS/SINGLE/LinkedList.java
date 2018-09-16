public class LinkedList
{
    private ListNode head;
    private int length;

    //CONSTRUCTORS
    public LinkedList()
    {
        length = 0;
    }
    //GETTERS AND SETTERS FOR HEAD NODE
    public ListNode getHead()
    {
        return head;
    }
    public void setHead(ListNode head)
    {
        this.head = head;
    }
/* --------------------- 
 * --------METHODS------
 * INSERTION 
 *      1. AT BEGINNING
 *      2. AT END
 *      3. AT MIDDLE
 * DELETION
 *      1. FROM BEGINNING
 *      2. FROM END
 *      3A FROM MIDDLE USING INDEX
 *      3B FROM MIDDLE USING VALUE
 *  TOSTRING
 *  LENGTH
 *  SEARCH ELEMENT
 *  OPTIMIZED SEARCH
 *  CLEAR LIST
 *  PRINT LIST
 */
    //INSERTION
    //1. AT BEGINNING
    public synchronized void insertAtBegin(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            newNode.setNext(head);
            head=newNode;
        }
        length++;
    }
    //2. AT END
    public synchronized void insertAtEnd(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            ListNode current = head;
            while(current.getNext()!=null)
            {
                current = current.getNext();
            }
            // System.out.println(current.getObject());
            current.setNext(newNode);
        }
        length++;
    }
    //3. AT MIDDLE
    public void insert(int data,int position)
    {
        ListNode newNode = new ListNode(data);
        //fix the position
        if(position<0)
        {
            position = 0;
        }
        if(position > length)
        {
            position = length;
        }
        //if list is empty
        if(head==null)
        {
            head = newNode;
        }
        else if(position == 0) //added at 0
        {   
            newNode.setNext(head);
            head=newNode;
        }   
        else
        {
            ListNode current=head;
            for(int i=1;i<length;i++)
            {
                if(i==position)
                {
                    break;
                }
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        length++;
    }
    //DELETION
    //1. FROM HEAD
    public synchronized ListNode removeFromBegin()
    {
        if(head==null)
        {
            return null;
        }
        else if(head.getNext() == null)
        {
            ListNode temp = head;
            head=null;
            length--;
            return temp;
        }
        else
        {
            ListNode temp = head;
            head = head.getNext();
            length--;
            return temp;
        }
    }
    //2. FROM END
    public synchronized ListNode removeFromEnd()
    {
        if(head==null)
        {
            return null;
        }
        else if(head.getNext() == null)
        {
            ListNode temp = head;
            head = null;
            length--;
            return temp;
        }
        else
        {
            ListNode current=head;
            ListNode prev=head;
            while(current.getNext() != null)
            {
                prev=current;
                current=current.getNext();
            }
            prev.setNext(null);
            length--;
            return current;
        }
    }
    //3A. FROM MIDDLE USING INDEX
    public synchronized void remove(int position)
    {
        //fix position
        if(position<0)
        {
            position=0;
        }
        else if(position>=length)
        {
            position = length-1;
        }
        if(head==null)
        {
            return;
        }
        else if(position==0) //deletion from head
        {
            ListNode temp=head;
            head=head.getNext();
            temp.setNext(null);
        }
        else
        {
            ListNode current = head;
            ListNode prev=null;
            for(int i=0;i<position;i++)
            {
                prev=current;
                current=current.getNext();
            }
            prev.setNext(current.getNext());
        }
        length--;
    }

    //3B. FROM MIDDLE USING VALUE
    public synchronized void removeMatched(int value)
    {   
        if(head==null)
        {
            return;
        }
        else if(head.getData()==value)
        {
            ListNode temp = head;
            head=head.getNext();
            temp.setNext(null);
            length--;
        }
        else
        {
            ListNode current=head;
            ListNode prev = head;
            while(current.getNext()!=null)
            {
                if(current.getData() == value)
                {
                    break;
                }
                prev=current;
                current=current.getNext();
            }
            prev.setNext(current.getNext());
            length--;
        }
    }
    //TO STRING METHOD FOR TYPE CONVERSION
    //FORMAT: [1,2,3,4,5]
    public String toString()
    {
        String result="[";
        if(head==null)
        {
            return result+"]";
        }
        ListNode current = head;
        while(current.getNext() != null)
        {
            result=result+current.toString()+",";
            current = current.getNext();
        }
        return result+current.toString()+"]";
    }

    //length of linked list
    public int length()
    {
        return length;
    }

    //SEARCH LINKED LIST
    public boolean search_element(int find)
    {
        if(head==null)
        {
            return false;
        }
        ListNode current=head;
        int flag=0;
        while(current!=null)
        {
            if(current.getData()==find)
            {
                flag=1;
                break;
            }
            current=current.getNext();
        }
        if(flag==1)
        {
            return true;
        }
        return false;
    }
    //OPTIMIZED SEARCH
    public boolean optimized_search(int find)
    {
        if(head==null)
        {
            return false;
        }
        ListNode current1=head;
        ListNode current2=head.getNext();
        int flag=0;
        while(true)
        {
            // System.out.println("current1 "+current1);
            // System.out.println("current2 "+current2);
            if(current1!=null)
            {
                if(current1.getData()==find)
                {
                    flag=1;
                    break;
                }
            }
            else if(current2!=null)
            {
                if(current2.getData()==find)
                {
                    flag=1;
                    break;
                }
            }
            if(current2==null || current2.getNext()==null || current1==null || current1.getNext()==null)
            {
                break;
            }   
            current2=current2.getNext().getNext();
            current1=current1.getNext().getNext();
        }
        if(flag==1)
        {
            return true;
        }
        return false;
    }
    //CLEAR LIST
    public void clearList()
    {
        head=null;
        length=0;
    }
    //PRINT LIST
    //FORMAT: 1->2->3->null
    public void print_list()
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current + "->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}