public class DoubleLinkedList
{
    private Node head;
    private Node tail;

    public void addToFront(data obj)
    {
        Node newNode = new Node(obj);
        newNode.setNext(head);
        if(head==null) //if no element present in the list
        {
            tail = newNode;
        }
        else
        {  
            newNode.setPrev(null);
        }
        head = newNode;
    }
    public void addToEnd(data obj)
    {
        Node newNode = new Node(obj);
        if(tail==null)
        {
            head = newNode;
        }
        else
        {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
    }
    public Node removeFromFront()
    {
        if(head==null)
        {
            //empty
            return null;
        }
        Node removedNode=head;
        if(head.getNext()==null)
        {
            tail=null;
        }
        else
        {
            head.getNext().setPrev(null);
        }
        head=head.getNext();
        removedNode.setNext(null);
        return removedNode;
    }
    public Node removeFromEnd()
    {
        if(head==null)
        {
            return null;
        }
        Node removeNode=tail;
        if(tail.getPrev()==null)
        {
            head=null;
        }
        else
        {
            tail.getPrev().setNext(null);
        }
        tail=tail.getPrev();
        removeNode.setNext(null);
        return removeNode;
    }   
    public void insertNodeInBetween(data left,data right,data add)
    {
        Node newNode = new Node(add);
        Node leftNode=null;
        Node rightNode=null;
        Node current = head;
        int flag=0;
        while(current!=null)
        {
            if(current.getObj().equals(left))
            {
                if(current.getNext().getObj().equals(right))
                {
                    leftNode = current;
                    rightNode=current.getNext();
                    flag=2;
                }
            }
            current= current.getNext();
        }
        if(flag==2)
        {
            //left and right nodes finded
            leftNode.setNext(newNode);
            rightNode.setPrev(newNode);
            newNode.setPrev(leftNode);
            newNode.setNext(rightNode);
        }
        else
        {
            System.out.println("NOT POSSIBLE");
        }
    }
    public void printList()
    {
        Node current = head;
        System.out.print("null <=>");
        while(current != null)
        {
            System.out.print(" "+current+" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}