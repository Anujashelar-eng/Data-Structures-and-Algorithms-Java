import java.util.*;
class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str1=sc.nextLine();
        String str2=sc.nextLine();

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        if(ch1.length!=ch2.length){
            System.out.println("Not Equal");
        }else{
            Arrays.sort(ch1);
            Arrays.sort(ch2);

           System.out.println(Arrays.equals(ch1,ch2) ? "Anagram" : "Not Anagram");
        }

    }
}
