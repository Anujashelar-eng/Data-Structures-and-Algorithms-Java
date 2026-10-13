import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree {

    Scanner sc=new Scanner(System.in);

    Node constructTreeBT(){

    System.out.println("Enter Data (-1 for no node): ");
    int data = sc.nextInt();

    // ✅ BREAK CONDITION
    if(data == -1){
        return null;
    }

    Node newNode = new Node(data);

    System.out.println("Add left child of " + data + "? (y/n)");
    char ch = sc.next().charAt(0);
    if(ch == 'y' || ch == 'Y'){
        newNode.left = constructTreeBT();
    }

    System.out.println("Add right child of " + data + "? (y/n)");
    char ch2 = sc.next().charAt(0);
    if(ch2 == 'y' || ch2 == 'Y'){
        newNode.right = constructTreeBT();
    }

    return newNode;
    }
    void preorder(Node root){
       if(root==null){
        return;
       }

       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
    }
}

class Client{
    public static void main(String[] args){

        BinaryTree bt=new BinaryTree();
        Node root=null;
        root=bt.constructTreeBT();

        bt.preorder(root);
    }
}