package DSA2;

class program11B {
    static void reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();

        str=sb.toString();

        System.out.println(str);
    }
    public static void main(String[] args){
        String str="Anuja";
        reverse(str);
    }
}
