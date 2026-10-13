//valid parenthesis e.g compiler while compilation
//open Bracket ->> push in stack
//close Bracket ->>pop in stack
//empty stack =>> -1
//Example:- undo and redo
import java.util.Stack;
import java.util.Scanner;
class ValidParenthesis{
    boolean validParenthesis(String str){

        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{' ||ch=='('||ch=='['){
                s.push(ch);
            }else{
                if(!s.empty()){
                    char x=(char)s.peek();
                   if((x=='{'&& ch=='}') ||(x=='[' && ch==']')||(x=='('&& ch==')') ){
                        s.pop();  
                   }else{
                     return false;
                   }
                }else{
                    return false;
                }
            }
        }
        if(s.empty()){
            return true;
        }else{
            return false;
        }
    }
}
class Client1{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Expression:");
     String str=sc.next();

     ValidParenthesis obj=new ValidParenthesis();
     boolean ret=obj.validParenthesis(str);
     if(ret){
        System.out.println("Balanced");
     }else{
        System.out.println("Not Balanced");
     }
    }
}