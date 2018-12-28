public class Main
{
    public static void main(String[] args)
    {
        DoublyLinkedList mylist = new DoublyLinkedList();
        mylist.insert_at_head(1);
        mylist.insert_at_head(2);
        mylist.insert_at_head(3);
        mylist.insert_at_head(4);
        mylist.print_list_from_left();

        mylist.insert_at_tail(5);
        mylist.insert_at_tail(6);
        mylist.insert_at_tail(7);
        mylist.insert_at_tail(8);
        mylist.print_list_from_left();

        System.out.println(mylist.length());
        mylist.insert_at_middle_using_index(9,0);
        mylist.insert_at_middle_using_index(10,1);
        mylist.print_list_from_left();

        mylist.insert_at_exact_middle(99);
        mylist.print_list_from_left();

        mylist.delete_from_head();
        mylist.print_list_from_left();

        mylist.delete_from_tail();
        mylist.print_list_from_left();

        mylist.delete_from_middle_using_index(1);
        mylist.print_list_from_left();

        mylist.delete_from_exact_middle();
        mylist.print_list_from_left();

        System.out.println(mylist);

        mylist.delete_from_middle_using_value(2);
        mylist.print_list_from_left();

        if(mylist.search_list(100))
        {
            System.out.println("ELEMENT FOUND");
        }
        else
        {
            System.out.println("ELMENT NOT FOUND");
        }
        if(mylist.optimal_search(99))
        {
            System.out.println("ELEMENT FOUND");
        }
        else
        {
            System.out.println("ELMENT NOT FOUND");
        }
    }
}