package DSA1;
//pallindrome
class program10 {
    public static void main(String[] args){
       int num=1331;
       int rem=0;
       int temp=num;

       while(temp!=0){
          int digit=temp%10;
          rem=rem*10+digit;
         // System.out.println(rem);
          temp=temp/10;
       }
       //System.out.println(num);
      // System.out.println(rem);
       System.out.println(num==rem?"Pallindrome":"Not a Pallindrome");
    }
}
