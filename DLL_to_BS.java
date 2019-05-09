
public class DLL_to_BST {
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
    public void create(Node head)
    {
        Node current;
        Node prev=head;
        for(int i=2;i<10;i++)
        {
            current=new Node(i);
            current.left=prev;
            prev.right=current;
            prev=current;
        }
    }
    public int count(Node head)
    {
        Node c=head;
        int count=0;
        while(c!=null)
        {
            count++;
            c=c.right;
        }
        return count;
    }
    public Node convert(int n)
    {
        if(n<=0)
            return null;
        Node left=convert(n/2);
        Node root=head;
        root.left=left;
        head=head.right;
        root.right=convert(n-(n/2)-1);
        return root;
    }
    public void print(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.right;
        }
    }
    public void print_tree(Node head)
    {
        Node current=head;
        if(current!=null)
        {
            System.out.println(current.data);
            print_tree(current.left);
            print_tree(current.right);
        }

    }
    public static void main(String args[])
    {
        DLL_to_BST tree = new DLL_to_BST();
        tree.head=new Node(1);
        tree.create(tree.head);
        //tree.print(tree.head);
        //tree.con(tree.head);
        int n = tree.count(tree.head);
        System.out.println(n);
        Node p = tree.convert(n);
        tree.print_tree(p);

    }
}

