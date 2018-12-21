public class BinaryTreeNode
{
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
    public int getData()
    {
        return data;
    }
    public void setData(int data)
    {
        this.data=data;
    }
    public BinaryTreeNode getLeft()
    {
        return left;
    }
    public void setLeft(BinaryTreeNode left)
    {
        this.left = left;
    }
    public BinaryTreeNode getRight()
    {
        return right;
    }
    public void setRight(BinaryTreeNode right)
    {
        this.right=right;
    }
}