//Java Strings are IMMUTABLE
//String is class in java=>>>> .length() function in String
//Array =>>> length Function
import java.util.*;
class StringDemo{
   public static void main(String[] args){
    char arr[]={'a','b','c','d'}; //method 1
    String str1="abcd";            //method 2
    String str2=new String("by new memory allocation"); //method 3

    Scanner sc=new Scanner(System.in);
    String name;
    name=sc.next();  //take only single word
    System.out.println(name);

    String fullName=sc.nextLine();
   // System.out.println(fullName);
   System.out.println(fullName.length());
   }
}