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

        list.printList();
    }
}