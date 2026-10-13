package DSA2;
//Reverse a string
class program11 {
    static String reverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
           // System.out.println(str.charAt(i));
            rev=rev+str.charAt(i);
        }
        
        return rev;
    }
    public static void main(String[] args){
        String str="Anuja";

       System.out.println(reverse(str));
    }
}
