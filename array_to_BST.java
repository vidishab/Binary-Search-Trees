
public class array_to_BST {
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
    public Node convert(int arr[],int c,int n)
    {
       if(c>n)
           return null;
       int mid=(c+n)/2;
       Node root=new Node(arr[mid]);
       //System.out.println(root.data);
       root.left=convert(arr,c,mid-1);
       root.right=convert(arr,mid+1,n);
       return root;
    }
    public void print(Node root)
    {
        if(root==null)
        return;
        else
        {
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
    }
    public static void main(String args[])
    {
        array_to_BST tree=new array_to_BST();
        int arr[]={1,2,3,4};
        int p = arr.length;
        Node temp=tree.convert(arr,0,p-1);
        tree.print(temp);
    }
}

