public class MainLS
{
    public static void main(String[] args)
    {
        try
        {
            LinkedStack ls = new LinkedStack();
            ls.push(1);
            ls.push(2);
            ls.push(3);
            ls.push(4);
            ls.pop();
            System.out.println(ls);
            System.out.println(ls.isEmpty());
            System.out.println(ls.size());
        }   
        catch(Exception e)
        {
            System.out.println(e);
        } 
    }
}