package Linked_List;
import java.util.*;
class node{
    int data;
    node next=null;

    node(int data){
        this.data=data;
    }
}

public class LinkedList{
    node head=null;
    void addFirst(int data){
      node newNode=new node(data);

      if(head==null){
        head=newNode;
      }else{
        newNode.next=head;
        head=newNode;
      }
      
    }

    void addLast(int data){
        node newNode=new node(data);
      if(head==null){
        head=newNode;
      }else{
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
      }
    }

    void addAtPos(int pos,int data){
      
      if(pos<=0 && pos>countNode()+1){
        System.out.println("Invalid data");
      }else if(pos==1){
         addFirst(data);
      }else if(pos==countNode()+1){
        addLast(data);
      }else{
        node newNode=new node(data);
        node temp=head;
        while(pos-2!=0){
            temp=temp.next;
            pos--;
        }
        newNode.next=temp.next;
        temp.next=newNode;
      }
    }

    int countNode(){
        node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }

     void deleteFirst(){
        if(head==null){
            System.out.println("Empty");
            return;
        }else{
            head=head.next;//no incoming arrow to the firstNode
            // node temp=head;
            // temp.next=head;
            // temp=null;
        }
    }

    void deleteLast(){
        if(head==null){
            System.out.println("No node for delete");
            return;
        }else if(head.next==null){
            head=null;
        }else{
            node temp=head;
            while(temp.next.next!=null){ ///note
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    
    void deleteAtPos(int pos){
     if(pos<=0 && pos>countNode()){
        System.out.println("Invalid post");
        return;
      }
      if(pos==1){
        deleteFirst();
        return;
      }else if(pos==countNode()){
        deleteLast();
        return;
      }else{
        node temp=head;
        while (pos-2!=0) { //ek ghar maghe thambnya sathi
            temp=temp.next;
            pos--;
        }
        temp.next=temp.next.next;

      }
    }

    void printNode(){
        node temp=head;
        while(temp.next!=null){
          System.out.print(temp.data +"->");
          temp=temp.next;
        }
        System.out.println(temp.data);
    }
    
}

class Client{
    public static void main(String args[]){
        LinkedList obj=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int data;
        while(true){
        System.out.println("Enter your choice:");
        System.out.println("1:addFirst Node\n2:addLast\n3:deleteFirst\n4:deleteLast\n9:printNode\n10:Exit");
    
        int choice=sc.nextInt();
        
      switch (choice) {
        case 1:
            System.out.println("Enter data");
            data=sc.nextInt();
            obj.addFirst(data);
            break;
        case 2:
            System.out.println("Enter data");
            data=sc.nextInt();
            obj.addLast(data);
            break;
        case 3:
            obj.deleteFirst();
            break;
        case 4:
            obj.deleteLast();
            break;
        case 9:
            obj.printNode();
            break;
        
        case 10:
            break;  // This 'break' statement will exit the switch statement.
            
        default:
            System.out.println("Enter valid choice");
            break;
      }
      if(choice==10){
        break;
      }
    }
}
  
}