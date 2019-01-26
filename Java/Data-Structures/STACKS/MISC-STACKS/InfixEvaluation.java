import java.util.*;
abstract class InfixEvaluation
{
    /**
     * INFIX EVALUTION
     * it will only work when expression has spaces in it
     * it will throw exception when no bracket is balanced
     * 
     * test cases
     * 2 + 3 => 5
     * ( 3 + 3 ) * 2 => 12
     **/
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the expression with spaces");
        String expr = in.nextLine();                            //input string expression
        in.close();
        String[] arr = expr.split(" ");                         //parsing the string expression

        Stack<Integer> valstack = new Stack<Integer>();         //create the value/operand stack 
        Stack<Character> opstack = new Stack<Character>();      //create the operator stack
        
        for(int i=0;i<arr.length;i++)                           //traversing the exp
        {
            if(isopr(arr[i]))                                   //if the arr[i] string is operator
            {
                if(arr[i].equals("("))                          //if left paranthesis found
                {
                    char ch = arr[i].charAt(0);
                    opstack.push(ch);                           //push left paranthesis to operator stack
                }
                else if(arr[i].equals(")"))                     //if right paranthesis found
                {
                    while(opstack.peek()!='(')
                    {
                        char ch = opstack.pop();                //pop one operator
                        int a = valstack.pop();                 //pop first operand
                        int b = valstack.pop();                 //pop second operand
                        int result=solve(a,b,ch);               //solve the small expression
                        valstack.push(result);                  //push result to value stack
                    }
                    opstack.pop();
                }
                else                                            //other operator * - + / ^
                {
                    while(!opstack.empty() && precedence(opstack.peek().toString())>=precedence(arr[i]))
                    {
                        char ch = opstack.pop();                //pop one operator
                        int a = valstack.pop();                 //pop first operand
                        int b = valstack.pop();                 //pop second operand
                        int result=solve(a,b,ch);               //solve the small expression

                        valstack.push(result);                  //push result to value stack
                    }
                    opstack.push(arr[i].charAt(0));             //push this operator to operator stack
                }
            }
            else                                                //if number found
            {
                valstack.push(Integer.parseInt(arr[i]));        //push to value stack
            }
        }

        while(!opstack.empty())
        {
            char ch = opstack.pop();                            //pop one operator
            int a = valstack.pop();                             //pop first operand
            int b = valstack.pop();                             //pop second operand
            int result=solve(a,b,ch);                           //solve the small expression
            valstack.push(result);                              //push result to value stack
        }
        System.out.println(valstack.peek());                    //final value present in the value stack
    }

    /**
     * it will solve the expression
     * 
     * @param a for first operand
     * @param b for second operand
     * @param ch for operator
     * 
     * @return int the result of the epxression 
     **/
    public static int solve(int a,int b,char ch)
    {
        switch(ch)
        {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '^':
                return (int)Math.pow(a, b);
            default:
                return -1;
        }
    }

    /**
     * it will tell the precedence of operators
     * 
     * @param str for operator in string format
     * 
     * @return the precedence value
     **/
    public static int precedence(String str)
    {
        switch(str)
        {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return -1;
        }
    }

    /**
     * it will tell wheter the string is operator or not
     * 
     * @param str for operator in string format
     * 
     * @return boolean
     **/
    public static boolean isopr(String str)
    {
        switch(str)
        {
            case "+":
            case "-":
            case "*":
            case "/":
            case "(":
            case ")":
            case "^":
                return true;
            default:
                return false;
        }
    }
}