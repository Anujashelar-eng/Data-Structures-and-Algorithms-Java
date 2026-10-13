// In java == check Object level equality
// .equals()  comapre values
class ComparisionStr {
   public static void main(String[] args){
    String str1="Tony"; //String Constant Pool
    String str2="Tony"; //String Constant Pool
    String str3=new String("Tony"); //separete new object on Heap


    if(str1==str2){
        System.out.println("Equals");
    }else{
        System.out.println("Not Equals");
    }

    if(str1==str3){
        System.out.println("Equals");
    }else{
        System.out.println("Not Equals");
    }

     if(str1.equals(str3)){
        System.out.println("Equals");
    }else{
        System.out.println("Not Equals");
    }
   }
}
