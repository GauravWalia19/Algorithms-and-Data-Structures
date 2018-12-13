//ARRAY STACK
public class ArrayStack
{
    int[] stack;
    int top;
    public ArrayStack()
    {
        this(5);
    }

    /**
     * Constructor for initializing the size
     * */
    public ArrayStack(int size)
    {
        stack = new int[size];
        top=-1;
    }

    /**
     * push(int)
     * it will push element to the top of the stack
     * @return void 
     * */
    public void push(int value)
    {
        if(top+1==stack.length)
        {
            System.out.println("STACK OVERFLOW");
            System.exit(0);
        }
        stack[++top]=value;
    }

    /**
     * pop()
     * it will take out one element of the stack
     * @return int
     * */
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("STACK UNDERFLOW");
            System.exit(0);
        }
        int temp = stack[top];
        // stack[top]=0; //initializing it to zero
        top--;
        return temp;
    }

    /**
     * top()
     * it will convey the top element of the stack
     * @return int 
     * */
    public int top()
    {
        int temp = stack[top];
        return temp;
    }

    /**
     * isEmpty()
     * it will convey whether the stack is empty or not
     * @return boolean 
     * */
    public boolean isEmpty()
    {
        return top==-1;
    }

    /**
     * size()
     * it will convey the size of the stack
     * @return int
     **/
    public int size()
    {
        return top+1;
    }
    
    /**
     * print()
     * it will print the stack
     * @return void 
     **/
    public void print()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println("| "+stack[i]+" |");
        }
        System.out.println("-----");
    }
}