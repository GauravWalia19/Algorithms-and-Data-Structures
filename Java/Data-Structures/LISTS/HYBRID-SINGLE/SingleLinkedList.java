public class SingleLinkedList
{
    private Node head;
    private Node tail;
    private int size;
    //contructor setting to null
    public SingleLinkedList()
    {
        head = null;
        tail = null;
        size=0;
    }

    /*
     *  INSERTION
     *  AT HEAD
     *  AT TAIL
     *  AT MIDDLE USING VALUE
     *  AT MIDDLE USING INDEX
    */
    public void insert_head(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            newNode.setNext(newNode);
            head = newNode;
        }
    }
    public void insert_tail(int data)
    {

    }
    public void insert_at_middle_using_value(int value)
    {

    }
    public void insert_at_middle_using_index(int value,int index)
    {

    }
}