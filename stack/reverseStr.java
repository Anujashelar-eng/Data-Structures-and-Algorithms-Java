//Reverse a string using Stack
import java.util.Stack;
import java.util.Scanner;
class Reverse{
    static String revString(String str){
        char stackArr[]=new char[str.length()];
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        System.out.println(s);
        int i=0;
        while(!s.empty()){
            stackArr[i]=s.pop();
            i++;
        }
        System.out.println(s);
        return new String(stackArr);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String to reverse");
            String str=sc.next();

            String rev=revString(str);
            System.out.println(rev);
        }
    }
}