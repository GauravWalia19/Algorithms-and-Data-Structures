import java.util.*;

abstract class ArrayPriorQueue
{
    // class for creating QueueOverflow exception
    private static class QueueOverflowException extends Exception
    {
        private static final long serialVersionUID = 1L;

        public QueueOverflowException(String message)
        {
            super(message);
        }
        public String toString()
        {
            return "myjava.QueueOverflowException: "+getMessage();
        }
    }

    //class for creating Empty Queue exception
    private static class EmptyQueueException extends Exception
    {
        private static final long serialVersionUID = 1L;

        public EmptyQueueException(String str)
        {
            super(str);
        }
        public String toString()
        {
            return "myjava.EmptyQueueException: "+getMessage();
        }
    }

    // Node class for storing data with priorities
    private static class Node
    {
        private int priority;                           // priority of data
        private int data;                               // data in the node

        public Node(int data,int priority)              // constructor
        {
            this.data=data;
            this.priority = priority;
        }

        /**
         * It will return the priority of the node
         * 
         * @return int for priority
         **/
        public int getPriority()
        {
            return priority;
        }

        /**
         * It will return the data of the node
         * 
         * @return int for data
         **/
        public int getData()
        {
            return data;
        }
    }

    // class for priority queue
    private static class PriorQueue
    {
        private Node[] arr;                             // array for queue
        private int capacity;                           // for setting capacity of the queue 
        private int front;                              // front index of the queue
        private int rear;                               // rear index of the queue

        /**
         * Valued Constructor for making queue with the given capacity
         * 
         * @param int for capacity
         **/
        public PriorQueue(int capacity)
        {
            this.capacity = capacity;
            arr = new Node[capacity];
            front=-1;
            rear=-1;
        }
        
        /**
         * Default Constructor for making the queue with default size i.e 10
         **/
        public PriorQueue()
        {
            this(10);
        }

        /**
         * This function will add one element to the queue according to the priority
         * 
         * @param int for data
         * @param int for priority
         * @exception QueueOverflowException
         **/
        public void enqueue(int data,int priority) throws QueueOverflowException
        {
            if(rear+1==capacity)
            {
                throw new QueueOverflowException("Queue Overflow !!!");
            }
            Node newNode = new Node(data,priority);
            if(rear==-1 && front==-1)
            {
                front++;
                rear++;
                arr[rear] = newNode;
            }
            else if(priority <= arr[0].getPriority())               //search for correct position in the array according to priority
            {
                //shift the array 
                rear++;
                for(int i=rear;i>0;i--)
                {
                    arr[i] = arr[i-1];
                }
                arr[0] = newNode;                                   // insert at front
            }
            else if(priority >= arr[rear].getPriority())            // insert at last
            {
                rear++;
                arr[rear] = newNode;
            }
            else                                                    // insert in between
            {
                //search position in the array for insertion
                int i=-1;
                for(i=0;i<=rear;i++)
                {
                    if(priority <= arr[i].getPriority())
                    {
                        break;
                    }
                }
                rear++;
                for(int j=rear;j>i;j--)                             // shift half right array to right
                {
                    arr[j] = arr[j-1];
                }
                arr[i] = newNode;                                   // insert the node
            }
        }
        
        /**
         * This function will remove an element from priority queue
         * 
         * @return int for returning the removed element 
         * @exception EmptyQueueException
         **/
        public int dequeue() throws EmptyQueueException
        {
            if(front==-1 || rear==-1)
            {
                throw new EmptyQueueException("Empty Queue !!!");
            }
            int result = arr[front].getData();
            for(int i=0;i<rear;i++)
            {
                arr[i] = arr[i+1];
            }
            rear--;
            return result;
        }

        /**
         * This function will only return the front element of priority queue
         * 
         * @return int for front element
         * @exception EmptyQueueException
         **/
        public int peek() throws EmptyQueueException
        {
            if(front==-1 || rear==-1)
            {
                throw new EmptyQueueException("Empty Queue !!!");
            }
            return arr[front].getData();
        }

        /**
         * This function will print the queue
         **/
        public void print()
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(arr[i].getPriority() + " " + arr[i].getData());
            }
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            PriorQueue Q = new PriorQueue();
            Q.enqueue(12, 1);
            Q.enqueue(31, 1);
            Q.enqueue(13, 0);
            Q.enqueue(24, 4);
            Q.enqueue(34, 8);
            Q.enqueue(100, 3);
            Q.enqueue(200, 3);
            Q.enqueue(120, 0);
            Q.enqueue(202, 5);
            Q.enqueue(223, 9);
            // Q.enqueue(2323, 0);
            Q.print();
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());
            System.out.println(Q.peek());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}