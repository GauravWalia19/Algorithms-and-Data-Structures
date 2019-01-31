abstract class FixedArraySimpleQueue
{
    private static class FixedArrayQueue
    {
        private int front;
        private int rear;
        private int[] que;

        /**
         * default constructor
         */
        public FixedArrayQueue()
        {
            this(5);
        }
        /**
         * default constructor
         * @param size
         */
        public FixedArrayQueue(int size)
        {
            que = new int[size];
            front=-1;
            rear=-1;
        }

        /**
         * This method will add an element to the queue
         * @param val for value to enqueue
         * @throws Exception
         * @return void
         */
        public void enqueue(int val) throws Exception
        {
            if(front==-1 && rear==-1)
            {
                front++;
            }
            rear++;
            if(rear==que.length)
            {
                throw new Exception("FullQueueException");
            }
            que[rear]=val;
        }

        /**
         * This method will remove an element from the queue
         * @return int dequeued value
         * @throws Exception
         */
        public int dequeue() throws Exception
        {
            if(front==-1 || rear==-1)
            {
                throw new Exception("EmptyQueueException");
            }
            int temp = que[front];
            
            //shifting left
            int i=0;
            for(i=0;i<que.length-1;i++)
            {
                que[i]=que[i+1];
            }
            que[i]=0;
            rear--;
            
            return temp;
        }

        /**
         * It will return the front value from the queue
         * @return int front value
         */
        public int front()
        {
            if(isEmpty())
            {
                return -1;
            }
            return que[front];
        }

        /**
         * It will return the size of the Queue
         * @return int size of the Queue
         */
        public int size()
        {
            return rear-front+1;
        }

        /**
         * Tells whether the Queue is empty or not
         * @return boolean
         */
        public boolean isEmpty()
        {
            if(front==-1 || rear==-1)
            {
                return true;
            }
            return false;
        }

        /**
         * It will print the queue array
         * @param void
         * @return void
         **/
        public void printCheck()
        {
            for(int i=0;i<que.length;i++)
            {
                System.out.print(que[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        try
        {
            FixedArrayQueue Q = new FixedArrayQueue();
            System.out.println(Q.isEmpty());
            Q.enqueue(1);
            Q.enqueue(2);
            Q.enqueue(3);
            Q.enqueue(4);
            Q.enqueue(5);
            Q.dequeue();
            Q.dequeue();
            Q.dequeue();
            Q.dequeue();
            Q.dequeue();
            Q.enqueue(1);
            Q.dequeue();
            Q.enqueue(2);
            Q.enqueue(3);
            Q.enqueue(4);
            Q.enqueue(5);
            Q.enqueue(6);
            System.out.println(Q.isEmpty());
            System.out.println(Q.front());
            System.out.println(Q.size());
            Q.printCheck();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}