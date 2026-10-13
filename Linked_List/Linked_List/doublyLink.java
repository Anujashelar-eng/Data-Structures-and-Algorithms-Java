package Linked_List;

import java.util.*;

class Client{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        char ch;
        int choice;
        doublyLink dl=new doublyLink();
        do{
            System.out.println("1:addFirst");
            System.out.println("2:addLast");
            System.out.println("3:addAtPos");
            System.out.println("4:deleteFirst");
            System.out.println("5:deleteLast");
            System.out.println("6:deleteAtPos");
            System.out.println("7:CountNode");
            System.out.println("8:PrintNode");

            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    {
                      System.out.println("Enter data :");
                      int data=sc.nextInt();
                      dl.addFirst(data);
                    }
                    break;
                case 7:
                    {
                        System.out.println("Count of Node is "+dl.countNode());
                    }
                    break;
                case 8:
                    {
                        dl.printNode();
                    }
                    break;
                default:
                    System.out.println("Enter Valid Choice:");
                    break;
            }
        System.out.println("Do you want to continue:");
        ch=sc.next().charAt(0);
        }while(ch=='Y' || ch=='y');
    }

    
}
class node{
    node prev=null;
    int data;
    node next=null;

    node(int data){
        this.data=data;
    }
}
public class doublyLink {
    node head=null;
    public void addFirst(int data) {
        node newNode=new node(data);
        if(head==null){
            head=newNode;
        }else{
          newNode.next=head;
          head.prev=newNode.next;
          head=newNode;
        }
    }
    public int countNode(){
       node temp=head;
       int count=0;
       while(temp!=null){
        count++;
        temp=temp.next;
       }
       return count;
    }

    public void printNode(){
        if(head==null){
            System.out.println("Empty Doubly Linked List");
            return;
        }else{
            node temp=head;
            while(temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println(temp.data);

        }
    }
    
}
