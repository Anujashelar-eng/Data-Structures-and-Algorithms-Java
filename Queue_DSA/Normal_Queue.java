import java.util.Scanner;
class Queue{
    int queueArr[]; //refernce
    int front=-1;
    int rear=-1;
    int maxSize;
    //Global ==>need in every operation and live until the object is live


    Queue(int maxSize){ //Constructor Used to initialize instance Variable
        queueArr=new int[maxSize];
        this.maxSize=maxSize;
    }

    void enqueue(int data){
        if(rear==maxSize-1){
            System.out.println("Stack is full");
            return;
        }
            if(front==-1){
               front=rear=0;
            }else{
                rear++;
            }
            queueArr[rear]=data;
    }

    int dequeue(){
        int ele=queueArr[front];
        front++;
        if(front>rear){
            rear=front=-1;
        }
        return ele;
    }
    boolean isEmpty(){
        if(front==-1){
            return true;
        }else{
            return false;
        }
    }

    int front(){
        return queueArr[front];
    }

    int rear(){
        return queueArr[rear];
    }

    void printQueue(){
        int temp=front;
        for(int i=front;i<=rear;i++){
          System.out.print(queueArr[i]+" ");
          //temp++;
        }
        System.out.println();
    }
}
class Client{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Queue Size: ");
        int Size=sc.nextInt();
        Queue que=new Queue(Size);
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
                        System.out.println("Queue is empty: ");
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