package DSA2;
//count the frequency of each character in string
class program14 {

    static void frequency(String str){
        int count=0;
        boolean Visited[]=new boolean[str.length()];
        for(int i=0;i<str.length();i++){
          if(Visited[i]){
            continue;
          }
          count=1;

          for(int j=i+1;j<str.length();j++){
             if(str.charAt(i)==str.charAt(j)){
                count++;
                Visited[j]=true;
             }
          }
          System.out.println(str.charAt(i)+"->"+count);
        }
    }
    public static void main(String[] args){
        String str="AABBCDDD";

        frequency(str);
    }
}
