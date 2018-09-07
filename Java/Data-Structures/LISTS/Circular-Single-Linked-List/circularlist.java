public class circularlist
{
    private node head;
    //constructors
    public circularlist()
    {
        head=null;
    }
    //methods
    public void insert_head(data obj)
    {
        int f=0;
        if(head==null)
        {
            node newNode = new node(obj);
            head=newNode;
            f=1;
            // newNode.setNext(head);
        }
        else
        {
            node newNode = new node(obj);
            newNode.setNext(head);
            head = newNode;
        }
        //print_list();
        if(f==0)
        {
            node current=head;
            while(current.getNext()!=null)
            {
                current=current.getNext();
            }
            System.out.print(current.getObj()+" -> ");
            System.out.println();
            // current.setNext(head);
        }
        
    }
    public void print_list()
    {
        node current = head;
        while(current!=null)
        {
            System.out.print(current.getObj()+" "+current.getNext()+" -> ");
            current=current.getNext();
        }
        System.out.println("null");
    }
}