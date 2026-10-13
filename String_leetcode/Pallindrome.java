//reverse of the string is same as the original String //level //radar
class Pallindrome {
    static Boolean pallindrome(String str){
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            sb=sb.append(str.charAt(i));
        }
        
        String rev=sb.toString().toLowerCase();
        return str.equals(rev);
    }
    public static void main(String[] args){
        String str="leveL";
        System.out.println(pallindrome(str));

        
    }
}
