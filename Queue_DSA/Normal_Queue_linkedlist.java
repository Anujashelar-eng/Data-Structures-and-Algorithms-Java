import java.util.Scanner;
class Node{
    int data;
    Node next=null;

    Node(int data){
        this.data=data;
    }
}
class Queue{
    Node front=null;
    Node rear=null;

    void enqueue(int data){

        Node newNode=new Node(data);
        if(front==null){
           front=newNode;
           rear=newNode;
        }else{
           rear.next=newNode;
           rear=newNode;
        }
    }

    int dequeue(){
       int ret=front.data;
       if(front==rear){   //important Test case;
        front=rear=null;
       }else{
        front=front.next;
       }
       return ret;
    }

    boolean isEmpty(){
        if(front==null){
            return true;
        }else{
            return false;
        }
    }

    int front(){
        return front.data;
    }

    int rear(){
        return rear.data;
    }

    void printQueue(){
        Node rear=front;

        while(rear.next!=null){
            System.out.print(rear.data+" ");
            rear=rear.next;
        }
        System.out.println(rear.data);
    }
}
class Client{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Queue Size: ");
    
        Queue que=new Queue();
        char ch;
        do{
            System.out.println("Queue by Array: ");
            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.front");
            System.out.println("4.rear");
            System.out.println("5.isEmpty");
            System.out.println("6.Print Queue");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the data: ");
                    int data=sc.nextInt();
                    que.enqueue(data);
                    que.printQueue();
                    break;

                case 2:
                    if(que.isEmpty()){
                        System.out.println("Empty Queue");
                    }else{
                        int ret=que.dequeue();
                        System.out.println("element popped: "+ret);
                    }
                    break;
                case 3:
                    if(que.isEmpty()){
                        System.out.println("Queue is emppty: ");
                    }else{
                        System.out.println("front: "+que.front());
                    }
                    break;
                case 4:
                     if(que.isEmpty()){
                        System.out.println("Queue is emppty: ");
                    }else{
                        System.out.println("rear: "+que.rear());
                    }
                    break;
                case 5:
                     if(que.isEmpty()){
                        System.out.println("Empty Queue");
                    }else{
                        System.out.println("Not Empty");
                    }
                    break;
                case 6:
                     if(que.isEmpty()){
                        System.out.println("Queue is empty ");
                    }else{
                        que.printQueue();
                    }
                    break;
                default:
                    System.out.println("Please Enter valid choice");
                    break;
            }
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);

        }while(ch=='Y'||ch=='y');

    }
}

