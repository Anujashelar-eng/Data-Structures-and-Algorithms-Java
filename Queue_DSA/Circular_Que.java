import java.util.Scanner;
class CircleQueue{
    int queueArr[];
    int maxSize;
    int front=-1;
    int rear=-1;

    CircleQueue(int Size){
        maxSize=Size;
        queueArr=new int[Size];
    }
    
    void enqueue(int data){
        if((front==0 && rear==maxSize-1) || ((rear+1)%maxSize==front)){   //Scenario where the queue is full
            System.out.println("Queue is full");
            return;
        }

        if(front==-1){
            front=rear=0;
        }else if(front!=0 && rear==maxSize-1){
            rear=0;
        }else{
            rear++;
        }
        queueArr[rear]=data;
    }

    int dequeue(){
        if(front == -1){
            return -1;
        }

        int ret = queueArr[front];

        if(front == rear){
            front = rear = -1;
        }else if(front == maxSize - 1){
            front = 0;
        }else{
            front++;
        }

        return ret;
    }

    boolean empty(){
        if(front==-1){
            return true;
        }else{
            return false;
        }
    }

    void printQueue(){
        if(front<=rear){
            for(int i=front;i<=rear;i++){
                
                System.out.print(queueArr[i]+" ");
            }
        }else{
            for(int i=front;i<maxSize;i++){
                System.out.print(queueArr[i]+" ");
            }

            for(int i=0;i<=rear;i++){
                System.out.print(queueArr[i]+" ");
            }
            
        }
        System.out.println();
    }
}
class Client1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Queue: ");
        int Size=sc.nextInt();
        CircleQueue que=new CircleQueue(Size);
        char ch;
        do{
        
        System.out.println("______Circular Queue_______");
        System.out.println("1.enqueue");
        System.out.println("2.dequeue");
        System.out.println("3.empty");
        System.out.println("4.print Queue");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                {  
                    System.out.println("Enter the Data: ");
                    int data=sc.nextInt();
                    que.enqueue(data);
                    break;
                }
            case 2:
                {
                    int ret=que.dequeue();
                    if(ret==-1){
                        System.out.println("Empty Queue");
                    }
                    break;
                }
            case 3:{
                
                    if(que.empty()){
                        System.out.println("Queue is Empty");
                    }else{
                        System.out.println("Queue is Not Empty");
                    }

                break;
            }
            case 4:{
                if(que.empty()){
                    System.out.println("Empty Queue");
                }else{
                    que.printQueue();
                }
                break;
            }
            default:{
                System.out.println("Please Enter the valid choice");
                break;
               // If default is the last block, then break; is not neede
              // If default is not the last, then you should use break; to prevent fall-through.
            }
        }

        System.out.println("Do you want to continue(Y/N)");
        ch=sc.next().charAt(0);
        }while(ch=='Y' || ch=='y');
        
    }
}