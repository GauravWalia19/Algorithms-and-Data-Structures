import java.util.*;
public class LinkedStack
{
    private int length;     //indicates the size of the linked list
    private StackNode top;   //acting like a head of linked list

    public LinkedStack()
    {
        length=0;
        top=null;
    }

    //adds a specified data to the top of this stack
    public void push(int data)
    {
        StackNode temp = new StackNode(data);
        temp.setNext(top);
        top=temp;
        length++;
    }

    //removes the data at the top of this stack and returns a reference to it.throws an empty stack exception if the stack is empty
    public int pop() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    //returns a reference to the data at the top of this stack.
    //the data is not removed from the stack throws an EmptyStackException if the stack is empty
    public int peek() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return top.getData();
    }

    //returns true if this stack is empty and false otherwise
    public boolean isEmpty()
    {
        return length==0;
    }

    //returns the number of eleements in the stack
    public int size()
    {
        return length;
    }

    //returns the string representation of the stack
    public String toString()
    {
        String result="";
        StackNode current=top;
        while(current!=null)
        {
            result=result+current.toString()+"\n";
            current=current.getNext();
        }
        return result;
    }
}