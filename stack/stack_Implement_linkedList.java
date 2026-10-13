import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    Node top=null;
    void push(int data){ //add first
        Node newNode=new Node(data);
        if(top==null){
           top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
    }

    int pop(){ //delete first
        int val=top.data;
        if(top.next==null){
            top=null;
        }else{
            top=top.next;
        }
        return val;
    }
   
    int peek(){
        return top.data;
    }

    boolean empty(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }

    // boolean empty(){
    // return top==null;
    //}

    
    int size(){
        Node temp=top;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    void printStack(){
        if(empty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}

class ClientStack{
    public static void main(String[] args){
        char ch;
        Stack st=new Stack();
    
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Stack by LinkedList");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.empty");
            System.out.println("5.size");
            System.out.println("6.printStack");

            System.out.println("Enter your choice");
            int choice=sc.nextInt();

            switch(choice){
               case 1:
                    System.out.println("Enter data");
                    int data=sc.nextInt();
                    st.push(data);
                    break;

                case 2:
                    if(st.empty()){
                       System.out.println("Stack underflow");
                    }else{
                        int val=st.pop();
                        System.out.println(val+" popped");
                    }
                    break;

                case 3:
                    if(st.empty()){
                        System.out.println("Stack underflow");
                    }else{
                        int val1=st.peek();
                        System.out.println(val1);
                    }
                    break;
                case 4:{
                    if(st.empty()){
                        System.out.println("Stack underflow");
                    }else{
                        System.out.println("Stack is not empty");
                    }
                    break;
                    }

                case 5:
                    int sz=st.size();
                    System.out.println("Size:"+sz);
                    break;

                case 6:
                    st.printStack();
                    break;

                default:
                    System.out.println("Wrong Choice");

            }
            System.out.println("Do you want to continue(yes/no)?");
            ch=sc.next().charAt(0);
            
        }while(ch=='y'||ch=='Y');
    }
}