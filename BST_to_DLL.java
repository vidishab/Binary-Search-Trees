
public class BST_to_DLL {
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
    public void convert(Node root,Node temp)
    {
        if(root==null)
            return;

        Node prev=null;
        convert(root.left,prev);
        if(prev==null)
            temp=root;
        else
        {
            temp.left=root;
            root.right=temp;
        }
        prev=root;
        System.out.println(prev.data);
        convert(root.right,temp);
       // return temp;
        //print(temp);
    }
    public void print(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.left;
        }
    }
    public static void main(String args[])
    {
        BST_to_DLL one = new BST_to_DLL();
        BST_to_DLL tree = new BST_to_DLL();
        tree.head=new Node(4);
        tree.head.left=new Node(2);
        tree.head.right=new Node(8);
        tree.head.right.right=new Node(10);
        tree.head.right.left=new Node(5);
        tree.head.right.left.right=new Node(7);
        tree.head.right.left.right.left=new Node(6);
        tree.convert(tree.head,one.head);
        //tree.print(one.head);

    }
}

