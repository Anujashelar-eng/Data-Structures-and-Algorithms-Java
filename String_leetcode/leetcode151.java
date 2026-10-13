class StringreverseWords {

    static String reverseWords(String str){

        String words[]=str.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb=sb.append(words[i]);
            sb=sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String args[]){
        String str=" the sky is    blue  ";
        System.out.println(reverseWords(str));

    }
}
