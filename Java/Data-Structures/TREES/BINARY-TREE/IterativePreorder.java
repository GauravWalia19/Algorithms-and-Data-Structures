import java.util.*;
public class IterativePreorder
{
    public static void main(String[] args) 
    {
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

        preorder(ROOT);
    }
    public static void preorder(BinaryTreeNode ROOT)
    {
        if(ROOT==null)
        {
            return;
        }
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(ROOT);
        while(!s.empty())
        {
            BinaryTreeNode tmp= s.pop();
            System.out.print(tmp.data+" ");
            
            if(tmp.right!=null)
            {
                s.push(tmp.right);
            }
            if(tmp.left!=null)
            {
                s.push(tmp.left);
            }
        }
    }
}