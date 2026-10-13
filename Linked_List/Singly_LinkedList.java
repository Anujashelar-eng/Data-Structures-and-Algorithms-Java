class Node{
   int data;
   Node next=null;

   Node(int data){
     this.data=data;
   }
}
class LinkedList{
    Node head=null;
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
        }else{
           newNode.next=head;
           head=newNode;
        }
    }

    void printLinkedList(){
        if(head==null){
            System.out.println("Empty Linked List");
        }else{
            Node temp=head;
            while(temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println(temp.data);
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
        }
    }

    int count(){
        int Count=0;
        Node temp=head;
        while(temp!=null){
            Count++;
            temp=temp.next;
        }
        return Count;
    }


    void addAtPos(int pos,int data){
        if(pos<=0 || pos>count()+1){
            System.out.println("Empty LinkedList");
            return;
        }else{
            if(pos==1){
                addFirst(data);
            }else if(pos==count()+1){
                addLast(data);
            }else{
                Node newNode=new Node(data);
                
                Node temp=head;
                while(pos-2!=0){
                    temp=temp.next;
                    pos--;
                }
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("Empty stack");
        }else{
            head=head.next;
        }
    }

    void deleteLast(){
        if(head==null){
            System.out.println("Empty LinkedList");
        }else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }


    void deleteAtPos(int pos){
        if(pos<=0 || pos>count()){
            System.out.println("Invalid position");
            return;
        }

        if(pos==1){
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
        }
    }
    public static void main(String[] args){
          LinkedList obj=new LinkedList();
          obj.addFirst(10);
          obj.addFirst(20);
          obj.addFirst(30);
          
          obj.addLast(40);
          obj.addLast(50);
          obj.addLast(100);
          
          int count=obj.count();
          System.out.println("count :"+count);
          obj.addAtPos(2,80);


          obj.printLinkedList();
          obj.deleteFirst();
          obj.printLinkedList();
          obj.deleteLast();
         obj.deleteAtPos(3);
          obj.printLinkedList();


    }
}