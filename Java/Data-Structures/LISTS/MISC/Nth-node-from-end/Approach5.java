import java.util.*;
abstract class Approach5
{
    /**
     * LINKED LIST CLASS
     **/
    private static class LinkedList
    {
        /**
         * NODE CLASS
         * for linked list node
         **/
        private class Node
        {
            private int data;
            private Node next;

            //constructor
            public Node(int data)
            {
                this.data=data;
                next=null;
            }

            /**
             * getData()
             * @return data in the node
             **/
            public int getData()
            {
                return data;
            }

            /**
             * getNext()
             * @return the next node 
             **/
            public Node getNext()
            {
                return next;
            }
            
            /**
             * setNext()
             * @param next
             **/
            public void setNext(Node next)
            {
                this.next=next;
            }
        }
        
        private Node head;  //head of the linked list

        //constructor for linked list
        public LinkedList()
        {
            head=null;
            size=0;
            hash = new int[1000];
            counter=0;
        }

        /**
         * insert_at_head()
         * it will insert node at the head of the linked list
         * @param data
         **/
        public void insert_at_head(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                newNode.setNext(head);
                head=newNode;
            }
        }

        /**
         * print_list()
         * it will print the linked list
         **/
        public void printList()
        {
            if(head==null)
            {
                System.out.println("NULL");
            }
            else
            {
                Node current=head;
                while(current!=null)
                {
                    System.out.print(current.getData() +" -> ");
                    current=current.getNext();
                }
                System.out.println("NULL");
            }
        }

        /*====================================================================*/
        /**
         * APPROACH 5
         * Finding in one scan of linked list
         * take current pointer set to head
         * traverse upto the nth node
         * take current2 set it to null
         * traverse current again upto null
         * move current2 also
         * when current is fully traversed current2 node will be printed
         **/
        public void printNthNodeFromLast(int num)
        {   
            Node current=head;
            int i=0;
            while(current!=null)    //first traversed half upto nth node
            {
                if(num-1==i)
                {
                    break;
                }
                i++;
                current=current.getNext();
            }
            Node last=null;
            while(current!=null)    //traversed upto end
            {
                if(last==null)
                {
                    last=head;
                }
                else
                {
                    last=last.getNext();
                }
                current=current.getNext();
            }
            System.out.println(last.getData());
        }
        /*====================================================================*/
    }

    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.insert_at_head(3);
        ll.insert_at_head(1);
        ll.insert_at_head(4);
        ll.insert_at_head(2);
        ll.insert_at_head(5);
        
        ll.printList();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth node from last");
        int n = in.nextInt();

        ll.printNthNodeFromLast(n);
        in.close();
    }
}
