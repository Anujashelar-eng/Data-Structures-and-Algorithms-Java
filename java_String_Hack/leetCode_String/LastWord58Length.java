package leetCode_String;

public class LastWord58Length {

    void lengthOfLastWord(String str){
        str=str.trim();
        int count=0;
       System.out.println(str);
       for(int i=str.length()-1;i>=0;i--){
        if(str.charAt(i)==' '){
            break;
        }
        count++;
       }
       System.out.println(count);
    }
    public static void main(String[] args){
        LastWord58Length obj=new LastWord58Length();
        String str="               you can do it Anuja ";
        obj.lengthOfLastWord(str);
    }
}
