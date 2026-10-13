import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum=A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        char a=A.charAt(0);
        char b=B.charAt(0);
        System.out.print(Character.toUpperCase(A.charAt(0))+A.substring(1)+" ");
        System.out.println(Character.toUpperCase(B.charAt(0))+B.substring(1));
    }
}



