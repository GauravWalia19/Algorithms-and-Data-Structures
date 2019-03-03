import java.util.*;
import java.util.Map.*;
import java.util.Queue;
abstract class BottomView
{
    /**
     * BINARY TREE NODE STRUCTURE
     **/
    private static class BTNode
    {
        private int data;
        private BTNode left;
        private BTNode right;

        //constructors
        public BTNode(int data)
        {
            this.data=data;
        }
        //getters
        public BTNode getLeft()
        {
            return left;
        }
        public BTNode getRight()
        {
            return right;
        }
        public int getData()
        {
            return data;
        }
        //setters
        public void setLeft(BTNode left)
        {
            this.left = left;
        }
        public void setRight(BTNode right)
        {
            this.right = right;
        }
    }

    /**
     * BOTTOM VIEW OF A TREE
     **/
    public static void bottomview(BTNode root)
    {
        /**
         * NEW quenode CLASS FOR A QUEUE
         **/
        final class quenode
        {
            public BTNode data;
            public int hd;
            public quenode(BTNode data,int hd)
            {
                this.data = data;
                this.hd = hd;
            }
        }
        Queue<quenode> Q = new LinkedList<quenode>();
        Q.add(new quenode(root,0));
        Map<Integer,Integer> m = new TreeMap<Integer,Integer>();

        while(!Q.isEmpty())
        {
            quenode temp = Q.poll();
            
            m.put(temp.hd, temp.data.getData());

            if(temp.data.getLeft()!=null)
            {
                Q.add(new quenode(temp.data.getLeft(),temp.hd-1));
            }
            if(temp.data.getRight()!=null)
            {
                Q.add(new quenode(temp.data.getRight(),temp.hd+1));
            }
        }

        //traversing the map
        for(Entry<Integer,Integer> entry: m.entrySet())
        {
            System.out.print(entry.getValue()+" ");
        }
        System.out.println();
    }

    /**
     * TREE EXAMPLE GIVEN
     *           20  <- ROOT
     *         /    \
     *        8      22
     *       / \      \
     *      5   3      25
     *         / \
     *        10 14  
     * 
     * BOTTOM VIEW : 5 10 3 14 25 
     * */
    public static void main(String[] args) 
    {
        BTNode a = new BTNode(20);
        BTNode b = new BTNode(8);
        BTNode c = new BTNode(22);
        BTNode d = new BTNode(5);
        BTNode e = new BTNode(3);
        BTNode f = new BTNode(25);
        BTNode g = new BTNode(10);
        BTNode h = new BTNode(14);

        BTNode root = a;
        a.setLeft(b);
        a.setRight(c);

        b.setLeft(d);
        b.setRight(e);
        
        e.setLeft(g);
        e.setRight(h);
        
        c.setRight(f);
        bottomview(root);
    }
}