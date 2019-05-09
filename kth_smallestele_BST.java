
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class kth_smallestele_BST {
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
    public Stack<Node> inorder(Node head,Stack<Node> s)
    {
       Node current=head;
       if(current==null)
           return null;
       else
       {
           inorder(current.left,s);
           s.push(current);
           inorder(current.right,s);
       }
       return s;
    }
    public static void main(String args[])
    {
        Stack<Node> s = new Stack<>();
        kth_smallestele_BST tree = new kth_smallestele_BST();
        tree.head=new Node(7);
        tree.head.left=new Node(4);
        tree.head.right=new Node(9);
        tree.head.left.left=new Node(2);
        tree.head.left.right=new Node(5);
        tree.head.right.left=new Node(8);
        tree.head.right.right=new Node(11);
        int k=5;
        int c=0;
        Stack<Node> p = tree.inorder(tree.head,s);
        //System.out.println(p.size());
        while (c<(p.size()-k))
        {
            p.pop();
        }
        System.out.println(p.pop().data);
    }
}

