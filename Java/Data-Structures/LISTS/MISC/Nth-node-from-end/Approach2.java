import java.util.*;
abstract class Approach2
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
         * APPROACH 2
         * Using two current pointers
         * Find the remaining nodes from right on every node
         * Find the count of remaining nodes
         * if count is equal to the nth node to be founded then print that node
         * if count is less than the nth node return
         * if count is grater than the nth node then move current forward
         **/
        public void printNthNodeFromLast(int num)
        {
            Node current=head;
            while(current!=null)
            {
                int count=0;    //count of remaining node
                Node current2=current;
                while(current2!=null)
                {
                    count++;
                    current2=current2.getNext();
                }

                if(count==num)
                {
                    System.out.println(current.getData());
                    return;
                }
                else if(count<num)
                {
                    System.out.println("fewer number of nodes");
                    return;
                }
                else if(count>num)
                {
                    current=current.getNext();
                }
            }
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
