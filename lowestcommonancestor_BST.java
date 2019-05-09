
public class lowestcommonancestor_BST {
    Node head;
    static class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public void findlca(Node head,Node temp,Node temp1)
    {
        if(head==null)
            return;
        while(head!=null)
        {
            if(temp.data<head.data && temp1.data > head.data)
            {
                System.out.println("Lowest Common Ancestor Found" + head.data);
                break;
            }
            if(temp.data > head.data)
                head=head.right;
            else
                head=head.left;
        }
    }
    public static void main(String args[])
    {
        lowestcommonancestor_BST tree = new lowestcommonancestor_BST();
        tree.head=new Node(4);
        tree.head.left=new Node(2);
        tree.head.right=new Node(8);
        tree.head.right.right=new Node(10);
        tree.head.right.left=new Node(5);
        tree.head.right.left.right=new Node(7);
        tree.head.right.left.right.left=new Node(6);
        Node temp=tree.head.left;
        Node temp1=tree.head.right.right;
        tree.findlca(tree.head,temp,temp1);
    }
}

