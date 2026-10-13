package Linked_List;

import java.util.*;

class Node{
    Node prev=null;
    int data;
    Node next=null;
    
    Node(int data){
        this.data=data;
    }
}
class doubly_linked_video {

    Node head=null;
    void addFirst(int data){
        Node newNode=new Node(data);

       if(head==null){
         head=newNode;
       }else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
       }
    }

    void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    int count(){
        int count=0;
        Node temp=head;
        while(temp!=null){
           count++;
           temp=temp.next;
        }
        return count;
    }

    void addAtPos(int pos,int data){
       if(pos<=0 || pos>count()+1){
          System.out.println("Invalid Position");
          return; //stack Frame of this function will break
       }

       if(pos==1){
            addFirst(data);
       }else if(pos==count()+1){
            addLast(data);
       }else{
          Node temp=head;
          Node newNode=new Node(data);
          while(pos-2!=0){
             temp=temp.next;
             pos--;
          }
          newNode.next=temp.next;
          newNode.prev=temp;
          temp.next=newNode;
          newNode.next.prev=newNode;
       }
    }


    void deleteFirst(){
        if(head==null){
            System.out.println("empty Linked List");
            return;
        }

        if(head.next == null){
            head = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }



    void deleteLast(){
        if(head==null){
            System.out.println("Empty LinkedList");
        }else if(head.next==null){
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
          //  temp.next.prev=null;
            temp.next=null;
        }
    }

    void deleteAtPos(int pos){
       if(head==null){
        System.out.println("Empty");
        return;
       }

       if(pos<=0 || pos>count()){
          System.out.println("Invalid Postion");
          return;
       }else if(pos==1){
           deleteFirst();
       }else if(pos==count()){
           deleteLast();
       }else{
          Node temp=head;
          while(pos-2!=0){
            temp=temp.next;
            pos--;
          }
          temp.next=temp.next.next;
          temp.next.prev=temp;
       }

    
    }
    void printNode(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        doubly_linked_video obj=new doubly_linked_video();

        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);

        obj.printNode();

        obj.addLast(50);
        obj.printNode();

        obj.addAtPos(2,100);
        obj.printNode();

        System.out.println("Count"+obj.count());

        obj.deleteFirst();
        obj.printNode();
        obj.deleteLast();
        obj.printNode();
        obj.deleteAtPos(2);
        obj.printNode();
    }
}

