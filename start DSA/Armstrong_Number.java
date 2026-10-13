class Armstrong_Number {
    static void isAmstrong(int num){
        int temp=num;
        int sum=0;
        int count=count(num);
        while(num!=0){
           int lastDigit=num%10;
           int result=1;
           int tempCount = count;   // IMPORTANT

           while(tempCount!=0){
            result=result*lastDigit;
            tempCount--;
           }
           sum=sum+result;
           num=num/10;
        }
        
        System.out.println((sum==temp)?true:false);
    
    }
    static int count(int num){
        int lastDigit;
        int count=0;
       while(num!=0){
        lastDigit=num%10;
        count++;
        num=num/10;
       }
       return count;
    }
    public static void main(String[] args) {

        isAmstrong(153);
    }
}
