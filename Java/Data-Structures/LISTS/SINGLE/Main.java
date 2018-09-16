public class Main
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.print_list();
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.print_list();
        list.insert(10, 1);
        list.print_list();
        list.removeFromBegin();
        list.print_list();

        list.removeFromEnd();
        list.print_list();

        list.insertAtBegin(100);
        list.insertAtBegin(200);
        list.print_list();
        list.removeMatched(3);
        list.print_list();

        list.remove(2);
        list.print_list();

        System.out.println("SIZE OF LINKED LIST\n"+list.length());
        list.insertAtBegin(22);
        list.insertAtBegin(44);
        list.insertAtBegin(55);
        // list.insertAtBegin(66);
        System.out.println(list);
        System.out.println(list.optimized_search(1000));
    }
}