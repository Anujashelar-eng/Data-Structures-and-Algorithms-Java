//Longest Substring without repeating character
import java.util.*;
class LeetCode3 {
    static int longestSubString(String str){
        int start=0;
        int end=0;
        int maxLength=0;
        List<Character> list=new ArrayList<>();
        while(end<str.length()){
          if(!list.contains(str.charAt(end))){
            list.add(str.charAt(end));
            end++;
            maxLength=Math.max(maxLength,list.size());
          }else{
            list.remove(Character.valueOf(str.charAt(end)));
          }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str="abccbdabbbc";
        System.out.println(longestSubString(str));
    }
}
