
public class insert_ele_BST {
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
    public Node insertBST(Node head,int data)
    {
        Node current=head;
        if(current==null)
        {
            current=new Node(data);
            return current;
        }
        if(data<current.data)
            current.left=insertBST(current.left, data);
        else if(data>current.data)
            current.right=insertBST(current.right,data);
        else if(data==current.data)
            System.out.println("Already exists");
        return head;
    }
    public void print(Node head)
    {
        if(head!=null)
        {
            print(head.left);
            System.out.println(head.data);
            print(head.right);
        }
    }
    public static void main(String args[])
    {
        insert_ele_BST tree = new insert_ele_BST();
        tree.head=new Node(7);
        tree.head.left=new Node(4);
        tree.head.right=new Node(9);
        tree.head.left.left=new Node(2);
        tree.head.left.right=new Node(5);
        tree.head.right.left=new Node(8);
        tree.head.right.right=new Node(11);
        //tree.print(tree.head);
        tree.insertBST(tree.head,14);
        tree.print(tree.head);

    }
}

