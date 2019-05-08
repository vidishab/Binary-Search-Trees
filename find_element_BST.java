
public class find_element_BST {
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
    public void inorder(Node head)
    {
        Node current=head;
        if(current!=null)
        {
            inorder(current.left);
            System.out.println(current.data);
            inorder(current.right);
        }
    }
    public void search(Node head,int data)
    {
        if(head==null)
            return;
        if(data<head.data)
            search(head.left,data);
        else if(data>head.data)
            search(head.right,data);
        else if(data==head.data)
            System.out.println(head.data + " Found");
    }
    public void search_iter(Node head,int data)
    {
        if(head==null)
            return;
        else
        {
            while(head!=null)
            {
                if(head.data==data)
                {
                    System.out.println(head.data + " Found iterative");
                    break;
                }
                if(data<head.data)
                    head=head.left;
                if(data>head.data)
                    head=head.right;
            }
        }
    }
    public static void main(String args[])
    {
        find_element_BST tree = new find_element_BST();
        tree.head=new Node(7);
        tree.head.left=new Node(4);
        tree.head.right=new Node(9);
        tree.head.left.left=new Node(2);
        tree.head.left.right=new Node(5);
        tree.head.right.left=new Node(8);
        tree.head.right.right=new Node(11);
        tree.inorder(tree.head);
        int data=2; //Change !
        tree.search(tree.head,data);
        tree.search_iter(tree.head,data);

    }
}

