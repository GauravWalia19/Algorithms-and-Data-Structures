import java.util.*;
public class IterativeInorder
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

        inorder(ROOT);   
    }

    public static void inorder(BinaryTreeNode ROOT)
    {
        if(ROOT==null)
        {
            return;
        }
        Stack<BinaryTreeNode> S = new Stack<BinaryTreeNode>();
        boolean done=false;
        BinaryTreeNode current=ROOT;
        while(!done)
        {
            if(current!=null)
            {
                S.push(current);
                current=current.left;
            }
            else    //if null value found
            {
                if(S.isEmpty())
                    done=true;
                else
                {
                    current = S.pop();
                    System.out.print(current.data+" ");
                    current=current.right;
                }
            }
        }
    }
}