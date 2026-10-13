package DSA1;
//print the digit from given number
class program3 {
    public static void main(String[] args){
         int n=123;
        
         while(n!=0){
            int reminder=n%10;
            System.out.println(reminder);
            n=n/10;
         }
    }
}
