public class Main
{
    public static void main(String[] args)
    {
        data one = new data(1,2);
        data two = new data(3,4);
        data three = new data(5,6);
        data four = new data(6,7);

        DoubleLinkedList list = new DoubleLinkedList();
        list.addToFront(one);
        list.addToFront(two);
        list.addToFront(three);
        list.addToFront(four);
        list.addToEnd(four);
        list.addToEnd(three);
        list.addToEnd(two);
        list.addToEnd(one);
        
        list.printList();

        list.removeFromFront();
        list.removeFromFront();
        list.printList();

        list.removeFromEnd();
        list.removeFromEnd();
        list.printList();

        //adding nodes in between consecutive nodes
        list.insertNodeInBetween(two,one,four);
        list.printList();
        list.insertNodeInBetween(two,one,four);
        list.printList();
    }
}