import java.util.*;
public class LevelOrder
{
    public static void main(String[] args) {
        BinaryTreeNode ROOT = null;
        BinaryTreeNode a = new BinaryTreeNode(1);
        BinaryTreeNode b = new BinaryTreeNode(2);
        BinaryTreeNode c = new BinaryTreeNode(3);
        BinaryTreeNode d = new BinaryTreeNode(4);
        BinaryTreeNode e = new BinaryTreeNode(5);
        BinaryTreeNode f = new BinaryTreeNode(6);
        BinaryTreeNode g = new BinaryTreeNode(7);

        ROOT=a;
        ROOT.setLeft(b);
        ROOT.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setLeft(f);
        c.setRight(g);

        levelorder(ROOT);
    }
    public static void levelorder(BinaryTreeNode ROOT)
    {
        if(ROOT==null)
        {
            return;
        }
        Queue<BinaryTreeNode> Q = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode current=ROOT;
        
        while(current!=null)
        {
            System.out.print(current.data +" ");
            if(current.left!=null)
            {
                Q.add(current.left);
            }
            if(current.right!=null)
            {
                Q.add(current.right);
            }

            current=Q.poll();
        }
    }
}