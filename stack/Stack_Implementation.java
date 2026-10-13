import java.util.*;

//stack implementation by Array
class Stack1{
    int maxSize;
    int top=-1;
    int stackArr[];

    Stack1(int maxSize){
        this.maxSize=maxSize;
        stackArr=new int[maxSize];
    }

    void push(int data){
        if(top==maxSize-1){
            System.out.println("Stack overflow");
            return;
        }else{
            top++;
            stackArr[top]=data;        
        }
    }


    int pop(){
            int val=stackArr[top];
            top--;
            return val;
    }

    int peek(){ 
        return stackArr[top];
    }

    int size(){
        return top+1;
    }


    boolean empty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    void printStack(){
        System.out.print("[");
        for(int i=top;i>=0;i--){
            System.out.print(stackArr[i]+" ");
        }
        System.out.println("]");
    }
} 
class Stack_Implementation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Stack size");
        int size=sc.nextInt();

        Stack1 st=new Stack1(size);
        char ch = 0;
        do{
            System.out.println("Stack: array");
            System.out.println("1.Push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.empty");
            System.out.println("5.size");
            System.out.println("6.printStack");


            System.out.println("Enter the choice");
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
