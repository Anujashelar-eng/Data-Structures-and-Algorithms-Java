//first non repeating character in a string
class leetcode387 {
    static int nonRepeatingChar(String str){
        str = str.toLowerCase(); // important
        int freq[]=new int[26];
        // int freq[] = new int[256];  //without changing original string
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }

        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String str="leetCode";
        System.out.println(nonRepeatingChar(str));
    }
}



