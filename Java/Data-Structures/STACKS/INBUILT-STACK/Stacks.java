import java.util.Stack;
public class Stacks
{
    public static void main(String[] args)
    {
        Stack<Integer> S = new Stack<Integer>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.pop();
        S.push(4);
        
        System.out.println(S);
        System.out.println("size: "+S.size());
        System.out.println("empty: "+S.empty());
        System.out.println("peek: "+S.peek());
        System.out.println("search: "+S.search(1));
    }
}