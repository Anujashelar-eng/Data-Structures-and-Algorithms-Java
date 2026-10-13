import java.util.*;
class BinaryTree{

    static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
      }
    }
        int idx=-1;

        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }

        void preorder(Node root){ //O(N)
            if(root==null){
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        void inorder(Node root){
            if(root==null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }


        void postorder(Node root){
            if(root==null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        //Level Order Traversal ==> we are adding null in queue to get next line(to see the levels)
        void levelOrder(Node root){
            if(root==null){
                return;
            }
            
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){

                Node currNode=q.remove();
                //if node is null
                if(currNode==null){
                  System.out.println();
                  if(q.isEmpty()){
                    break;
                  }else{
                    q.add(null);
                  }
                }else{  //if node is not null
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        //Height of the tree
        int height(Node root){
            if(root==null){
                return 0;
            }

            int lh=height(root.left);
            int rh=height(root.right);

            return Math.max(lh,rh)+1;
        }

        //Count of the nodes
        int count(Node root){
            if(root==null){
                return 0;
            }
            int lc=count(root.left);
            int rc=count(root.right);

            return lc+rc+1;
        }

        //Sum of the nodes
        int sum(Node root){
            if(root==null){
                return 0;
            }

            int leftSum=sum(root.left);
            int rightSum=sum(root.right);

            return leftSum+rightSum+root.data;
        }

        public static void main(String[] args){
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree=new BinaryTree();
            Node root=tree.buildTree(nodes);
            System.out.println(root.data);

            tree.inorder(root);
            System.out.println("preorder");
            tree.preorder(root);
            System.out.println("postorder");
            tree.postorder(root);
            System.out.println("Level order");
            tree.levelOrder(root);

            System.out.println("Height: "+tree.height(root));
            System.out.println("Count Of Node: "+tree.count(root));
            System.out.println("Sum of Nodes: "+tree.sum(root));
    }

}
