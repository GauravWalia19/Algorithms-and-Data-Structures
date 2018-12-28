import java.util.*;
abstract class Approach4
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
        private int size;   //size of the linked list
        private int[] hash; //hashtable for the linked list

        //constructor for linked list
        public LinkedList()
        {
            head=null;
            size=0;
            hash = new int[10];
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
                hash[size]=newNode.getData();
            }
            else
            {
                newNode.setNext(head);
                head=newNode;
                hash[size]=newNode.getData();
            }
            size++;
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
         * APPROACH 4
         * Using hashtables while adding elements in linked list
         * Then we get the size
         * find index of hashtable by subtracting the nthnode from size
         * print node at index from hashtable 
         **/
        public void printNthNodeFromLast(int num)
        {
            if(num>size)
            {
                System.out.println("INDEX OUT OF BOUNDS");
                return;
            }
            System.out.println(hash[num-1]);
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
