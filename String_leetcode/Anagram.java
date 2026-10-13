//Two string with same character with same frequency
import java.util.*;
class Anagram {

    static boolean isAnagram(String s,String t){

        char[] sArr=s.toLowerCase().toCharArray();
        char[] tArr=t.toLowerCase().toCharArray();

        if(s.length()!=t.length()){
            return false;
        }

        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        //return sArr.equals(tArr); //if both arrays refer to the same object
        return Arrays.equals(sArr,tArr);
    }
    public static void main(String[] args){
        String s = "ana";
        String t = "naa";

        System.out.println(isAnagram(s,t));
    }
}
