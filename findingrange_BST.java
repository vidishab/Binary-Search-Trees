/* To find the range of nodes when the range is part of left subtree or right subtree. In cases of range is in diff nodes
find the inorder traversal and get the range.
Or just do a binary search for that node and then find inorder successor.
 */
public class findingrange_BST {
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
    public void range(Node head,int k1,int k2)
    {
        if(head==null)
            return;
        if(head.data>k1)
            range(head.left,k1,k2);
        if(head.data<k1)
            range(head.right,k1,k2);
        if(head.data>k1 && head.data<k2)
            System.out.println(head.data);

    }
    public static void main(String args[])
    {
        findingrange_BST tree = new findingrange_BST();
        tree.head=new Node(7);
        tree.head.left=new Node(4);
        tree.head.right=new Node(9);
        tree.head.left.left=new Node(2);
        tree.head.left.right=new Node(5);
        tree.head.right.left=new Node(8);
        tree.head.right.right=new Node(11);
        tree.range(tree.head,2,11);
    }
}

