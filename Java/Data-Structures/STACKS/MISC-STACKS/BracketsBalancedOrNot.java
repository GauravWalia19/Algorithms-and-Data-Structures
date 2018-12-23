import java.util.*;
public class BracketsBalancedOrNot
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        in.close();
        if(BalancedOrNot(expression))
        {
            System.out.println("BRACKET BALANCED");
        }
        else
        {
            System.out.println("BRACKET NOT BALANCED");
        }
    }
    private static char reverseBracket(char ch)
    {
        switch(ch)
        {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
            default:
                return '0';
        }
    }
    //this method will throw empty stack exception
    private static boolean BalancedOrNot(String expression) throws EmptyStackException
    {
        Stack<Character> S = new Stack<Character>();
        try
        {
            for(int i=0;i<expression.length();i++)
            {
                char ch = expression.charAt(i);
                if(ch=='(' || ch=='[' || ch=='{')
                {
                    S.push(ch);
                }
                else if(ch==')' || ch==']' || ch=='}')
                {
                    char rev = reverseBracket(ch);
                    if(S.empty())
                    {
                        throw new EmptyStackException();
                    }
                    if(rev == S.peek())
                    {
                        S.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            if(S.empty())
            {
                return true;
            }
        }
        catch(Exception e)
        {
            System.out.println("STACK IS EMPTY");
        }
        return false;
    }
}