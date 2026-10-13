// Character.toUpperCase(ch)
// space is the Separation
class Q_each_word_UpperCase {
    String ConvertToUpperCase(String str){
     StringBuilder sb=new StringBuilder("");
     char ch=Character.toUpperCase(str.charAt(0));
     sb.append(ch);

     for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){
           sb.append(str.charAt(i));
           i++;
           sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
     }
     return sb.toString();
   }

   public static void main(String[] args) {
    //StringBuilder sb=new StringBuilder("hi i am Anuja");
    String str="hi i am Anuja";
    Q_each_word_UpperCase obj=new Q_each_word_UpperCase();
    System.out.println(obj.ConvertToUpperCase(str));
    
    }
}

// Time Commplexity ==O(N)