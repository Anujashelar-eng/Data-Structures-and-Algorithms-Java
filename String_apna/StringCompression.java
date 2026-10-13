// if latter repeated single time then decompress
// Eg. abc ==> abc
//aaaaabbbcc ==> a5b2c2
class StringCompression {
    public static String compressString(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
          Integer Count=1;
          while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            Count++;
            i++;
          }
          newStr=newStr+str.charAt(i);
          if(Count>1){
            newStr=newStr+Count.toString();
          }
          
        }
        return newStr;
    }
    public static void main(String[] args){
       String str="aaaabbbdd"; //a4b3d2
    
       System.out.println(compressString(str));
    }
}
//Time Complexity O(N)  
//Because inside Inner loop there is i++ and(String chi length jevdhi aahe tevdhya ch veles donhi loop milun run kartay so O(N))
// and String Traverse only Once 
//Best by StringBuilder
