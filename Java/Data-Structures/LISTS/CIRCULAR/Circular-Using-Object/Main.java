public class Main
{
    public static void main(String[] args)
    {
        data A = new data(1,"Gaurav");
        data B = new data(2,"Walia");
        data C = new data(3,"Names");

        circularlist mylist = new circularlist();
        mylist.insert_head(A);
        mylist.insert_head(B);
        mylist.insert_head(C);
        // mylist.print_list();

    }
}