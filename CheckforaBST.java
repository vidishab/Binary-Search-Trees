
public class CheckforaBST {
    int max=0,min=100;
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
    public int check(Node head)
    {
            if (head == null)
                return 1;
            if (head.left!=null && FindMax(head.left,head.data) > head.data  )
                return 0;
            if(head.right!=null && FindMin(head.right,head.data) < head.data)
                return 0;
            if (check(head.left) == 0 || check(head.right) == 0)
                return 0;

            return 1;

    }
    public int FindMax(Node head,int max)
    {
        if(head==null)
        return 0;
        else
        {
            if(max < head.data) {
                max = head.data;
                System.out.println(max);
            }
            FindMax(head.left,max);
            FindMax(head.right,max);
        }
        return max;
    }
    public int FindMin(Node head,int min)
    {
        if(head==null)
            return 0;
        else
        {
            if(min > head.data) {
                min = head.data;
                System.out.println(min);
            }
            FindMin(head.left,min);
            FindMin(head.right,min);
        }
        return min;
    }
    public static void main(String args[])
    {
        CheckforaBST tree = new CheckforaBST();
        tree.head=new Node(4);
        tree.head.left=new Node(2);
        tree.head.right=new Node(8);
        tree.head.right.right=new Node(100);
        tree.head.right.left=new Node(5);
        tree.head.right.left.right=new Node(7);
        tree.head.right.left.right.left=new Node(6);
        //tree.FindMax(tree.head);
        //tree.FindMin(tree.head);
        int r = tree.check(tree.head);
        if(r==1)
            System.out.println("BST");
        else
            System.out.println("Not BST");
    }
}

