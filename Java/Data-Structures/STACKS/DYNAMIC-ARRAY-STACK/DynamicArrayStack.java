import java.util.*;
abstract class DynamicArrayStack
{
    private static class DArrayStack
    {
        private int[] stack;            //array for stack
        private int top;                //top for stack
        private int s;                  //s for calculating the size of the stack

        /**
         * DArrayStack()
         * this is default constructor
         **/
        public DArrayStack()
        {
            this(1);                    //call parameterised contructor as size 1
        }

        /**
         * DArrayStack()
         * this is parametrized constructor
         * 
         * @param num for size of the input 
         **/
        public DArrayStack(int num)
        {
            this.s = num;
            top=-1;
            this.stack = new int[num];
        }

        /**
         * push()
         * this function will push an element to the stack
         * 
         * @param num for element to push
         * 
         * @return void
         **/
        public void push(int num)
        {
            if(top==s-1)
            {
                expand();               //expand array when stack gets full
            }            
            
            top++;
            stack[top] = num;           //push to stack
        }

        /**
         * expand()
         * this function will expand the array to its double
         * 
         * @param void
         * 
         * @return void
         **/
        public void expand()
        {
            int oldsize = s;
            s = s*2;                    //increase the array size to double
            int[] arr = new int[s];
            for(int i=0;i<oldsize;i++)  //copying current stack to arr
            {
                arr[i] = stack[i];
            }
            stack = arr;
        }

        /**
         * pop()
         * this function will pop an element from the stack
         * 
         * @param none
         * 
         * @return int for element to be popped
         **/
        public int pop() throws EmptyStackException
        {
            if(top==-1)                 //if stack is empty
            {
                throw new EmptyStackException();
            }
            int temp = stack[top];      
            stack[top]=0;
            top--;
            if(top+1==s/2)
            {
                shrink();               //shrink the array size
            }
            return temp;
        }

        /**
         * shrink()
         * it will shrink the stack array size to its half
         * 
         * @param void
         * 
         * @return void
         **/
        public void shrink()
        {
            s=s/2;
            int[] arr = new int[s];
            for(int i=0;i<s;i++)
            {
                arr[i] = stack[i];
            }
            stack = arr;
        }

        /**
         * peek()
         * it will return the top element of the stack
         * 
         * @param void
         * 
         * @return int for top element of the stack 
         **/
        public int peek()
        {
            return stack[top];
        }

        /**
         * print()
         * it will print the whole array for checking only never do that
         * 
         * @param void
         * 
         * @return void
         **/
        public void print()
        {
            for(int i=0;i<s;i++)
            {
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }

        /**
         * size()
         * it will return the size of the stack
         * 
         * @param void
         * 
         * @return int for size of the stack
         **/
        public int size()
        {
            return top+1;
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            DArrayStack S = new DArrayStack();
            S.push(1);
            S.push(2);
            S.push(3);
            S.push(4);
            S.push(5);
            S.push(6);
            S.push(10);
            S.pop();
            S.push(11);
            S.push(12);
            S.print();
            System.out.println(S.peek());
            System.out.println(S.size());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}