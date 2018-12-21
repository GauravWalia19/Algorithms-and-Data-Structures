import java.util.*;
public class IterativePostorder
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

        postorder(ROOT);
    }
    public static void postorder(BinaryTreeNode ROOT)
    {
        if(ROOT==null)
        {
            return;
        }
        Stack<BinaryTreeNode> S = new Stack<BinaryTreeNode>();
        S.push(ROOT);
        BinaryTreeNode prev=null;
        while(!S.isEmpty())
        {
            BinaryTreeNode current = S.peek();
            if(prev==null || prev.left==current || prev.right==current)
            {
                //traverse left then right
                if(current.left!=null)
                {
                    S.push(current.left);
                }
                else if(current.right!=null)
                {
                    S.push(current.right);
                }
            }
            else if(current.left==prev)
            {
                if(current.right!=null)
                {
                    S.push(current.right);
                }
            }
            else
            {
                System.out.print(current.data+" ");
                S.pop();
            }
            prev=current;
        }
    }
}