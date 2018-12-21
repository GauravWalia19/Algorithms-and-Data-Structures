public class Inorder
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

        inorder(ROOT);
    }
    public static void inorder(BinaryTreeNode ROOT)
    {
        if(ROOT==null)
        {
            return;
        }
        inorder(ROOT.left);
        System.out.print(ROOT.data+" ");
        inorder(ROOT.right);
    }
}