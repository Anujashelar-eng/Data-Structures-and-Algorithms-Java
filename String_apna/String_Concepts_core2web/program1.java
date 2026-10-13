package String_Concepts_core2web;
import java.io.*;
class program1 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter your name:");
        String name=br.readLine();
        System.out.println(name);

        System.out.println("Enter your age :");
        int age=Integer.parseInt(br.readLine());
        System.out.println(age);

        System.out.println("Enter Wing"); //read()==>return integer
        char wing=(char)br.read(); //Here must need to enter the Single Character
        System.out.println(wing);  
        br.skip(2);
        System.out.println("Enter roll number");
        int rollNo=br.read();
        System.out.println(rollNo);

        char wing2=br.readLine().charAt(0);
    }
}
