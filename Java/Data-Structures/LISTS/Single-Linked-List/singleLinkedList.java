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
    //printing the list
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
    //return the size of the list
    public int getSize()
    {
        return size;
    }
    //check if list is empty or not
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        return false;
    }
    //remove the node from the front
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
    //add to last
    public void addToLast(sample obj)
    {
        node NewNode = new node(obj);
        node current = head;
        while(current.getNext() != null)
        {
            current = current.getNext();
        }
        size++;
        current.setNext(NewNode);
    }
    //remove from the last
    public node removeFromLast()
    {
        node current = head;
        while(current.getNext().getNext() != null)
        {
            current = current.getNext();
        }
        node removeNode = current.getNext();
        size--;
        current.setNext(null);
        return removeNode;
    }
    //remove the first finded specific node
    public node removeFirst(sample obj)
    {
        node current = head;
        node old=current;
        while(current != null)
        {
            if(obj.equals(head.getSample()))
            {
                removeFromFront();
                break;
            }
            else if(obj.equals(current.getSample()))
            {
                System.out.println("sucess");
                old.setNext(current.getNext());
                size--;
                break;
            }
            old = current;
            current = current.getNext();
        }
        return current;
    }
    //removing duplicates
    // public void removeDuplicates()
    // {
    //     node current = head;
    // }
    //method for searching in the list
    public boolean search(sample obj)
    {
        node NewNode = new node(obj);
        node current = head;
        int flag=0;
        while(current != null)
        {
            if(NewNode.equal(current))
            {
                flag=1;
                break;
            }
            current = current.getNext();
        }
        if(flag==1)
        {
            return true;
        }
        return false;
    }
}