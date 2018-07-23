public class DoubleLinkedList
{
    private Node head;

    public void addToFront(data obj)
    {
        Node node = new Node(obj); //created a sample node
        node.setNext(head);
        head = node;
    }
    public void printList()
    {
        Node current = head;
        while(current != null)
        {
            System.out.println(current);
            current = current.getNext();
        }
    }
}