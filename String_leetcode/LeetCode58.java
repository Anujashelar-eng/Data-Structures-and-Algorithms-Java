class Solution {
    public int lengthOfLastWord(String s) {
        //System.out.println(s);
        String str=s.trim();
       // System.out.println(s);
        int count=0;        
    
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
           
        }
         return count;
    }
}