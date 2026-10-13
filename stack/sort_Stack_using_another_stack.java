import java.util.Stack;
//In Java, to call a static method of another class, you must use the class name.
//This algorithm works like Insertion Sort on Stack.
//Because we insert each element in correct position.

class SortStack {
  static Stack<Integer> sort(Stack<Integer> s){

        Stack<Integer> temp = new Stack<>();

        while(!s.empty()){

            int val = s.pop();

            while(!temp.empty() && temp.peek() > val){
                s.push(temp.pop());
            }

            temp.push(val);
        }

        return temp;
    }
  
}
class Clinet{
    public static void main(String args[]){
        Stack<Integer> s=new Stack<Integer>();

        s.push(20);
        s.push(10);
        s.push(56);
        s.push(5);
        s.push(44);

        Stack sorted=SortStack.sort(s);
        System.out.println(sorted);
    }
}
